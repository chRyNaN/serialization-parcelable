@file:Suppress("unused")

package com.chrynan.parcelable.core

import kotlinx.serialization.*
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.json.Json

/**
 * Represents the serialization format for [ParcelEncoder]s and [ParcelDecoder]s. This is analogous to the [Json] class
 * for the JSON serialization format.
 *
 * Note that this is not to be confused with the Android Parcelable interface. However, there is some overlap, and
 * hence the same name, as the Android Parcelable interface provides a means of serializing data between different
 * components and processes, this [Parcelable] interface performs a similar task. Though the way they perform their
 * tasks differs.
 *
 * @see [Android Parcelable (not the same)](https://developer.android.com/reference/android/os/Parcelable))
 */
@ExperimentalSerializationApi
sealed class Parcelable(internal val configuration: ParcelableConfiguration) : SerialFormat,
    BinaryFormat {

    override val serializersModule: SerializersModule
        get() = configuration.serializersModule

    /**
     * The default [Parcelable] implementation using the default [ParcelableConfiguration] values. This class can be
     * used when no custom configuration is needed.
     */
    companion object Default : Parcelable(ParcelableConfiguration())

    /**
     * A custom [Parcelable] implementation using the provided [configuration] values. This class can be used when
     * custom configuration is needed.
     *
     * Note that instances of this class are created using the [Parcelable] function.
     */
    class Custom internal constructor(configuration: ParcelableConfiguration) : Parcelable(configuration) {

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other !is Custom) return false

            return other.configuration == configuration
        }

        override fun hashCode(): Int = configuration.hashCode()

        override fun toString(): String =
            "Parcelable.Custom(configuration=$configuration)"
    }

    override fun <T> encodeToByteArray(serializer: SerializationStrategy<T>, value: T): ByteArray {
        val parcel = Parcel()

        return encodeToParcel(parcel = parcel, serializer = serializer, value = value).toByteArray()
    }

    override fun <T> decodeFromByteArray(deserializer: DeserializationStrategy<T>, bytes: ByteArray): T {
        val parcel = Parcel(bytes)

        return decodeFromParcel(parcel = parcel, deserializer = deserializer)
    }

    /**
     * Encodes the provided [value] to the provided [parcel] using the provided [serializer].
     *
     * Note that the provided [parcel] must already be set to the appropriate [Parcel.dataPosition] before invoking
     * this function, as this function does not make assumptions about where the starting [Parcel.dataPosition] is
     * located. Failure to do so may result in an exception being thrown when attempting to encode.
     *
     * @param [parcel] The [Parcel] to encode the [value] to. Defaults to an empty [Parcel]. The [Parcel.dataPosition]
     * must be set correctly.
     * @param [serializer] The [SerializationStrategy] used to encode the [value] to the [parcel].
     * @param [value] The value that should be encoded into the [parcel].
     *
     * @return The provided [parcel] containing the encoded [value].
     */
    fun <T> encodeToParcel(parcel: Parcel = Parcel(), serializer: SerializationStrategy<T>, value: T): Parcel {
        val encoder = ParcelEncoder(serializersModule = serializersModule, output = parcel)

        encoder.encodeSerializableValue(serializer, value)

        return parcel
    }

    /**
     * Decodes the value of [T] from the provided [parcel] using the provided [deserializer].
     *
     * Note that the provided [parcel] must already be set to the appropriate [Parcel.dataPosition] before invoking
     * this function, as this function does not make assumptions about where the starting [Parcel.dataPosition] is
     * located. Failure to do so may result in an exception being thrown when attempting to decode.
     *
     * @param [parcel] The [Parcel] to decode the returned value from. The [Parcel.dataPosition] must be set correctly.
     * @param [deserializer] The [DeserializationStrategy] used to decode the value from the [parcel].
     *
     * @return The decoded value of [T] obtained from the [parcel].
     */
    fun <T> decodeFromParcel(parcel: Parcel, deserializer: DeserializationStrategy<T>): T {
        val decoder = ParcelDecoder(serializersModule = serializersModule, input = parcel)

        return decoder.decodeSerializableValue(deserializer)
    }
}

/**
 * Creates a custom [Parcelable] implementation using the provided [from] [Parcelable] as a base for the
 * configuration and the provided [builderAction] function to override those configuration values.
 *
 * @param [from] The default [Parcelable] whose configuration values will be used as defaults. This parameter defaults
 * to [Parcelable.Default].
 *
 * @param [builderAction] The function used to provide custom [ParcelableConfiguration] values for this instance being
 * created.
 *
 * @return A [Parcelable.Custom] instance using the provided configuration values.
 */
@Suppress("FunctionName")
@ExperimentalSerializationApi
fun Parcelable(
    from: Parcelable = Parcelable.Default,
    builderAction: ParcelableConfigurationBuilder.() -> Unit
): Parcelable.Custom {
    val builder = ParcelableConfigurationBuilder(from.configuration)

    builder.builderAction()

    val configuration = builder.build()

    return Parcelable.Custom(configuration)
}

/**
 * Encodes the provided [value] to the provided [parcel] using the provided [serializer]. This is a convenience
 * function to [Parcelable.encodeToParcel] that retrieves the serializer from the [Parcelable.serializersModule].
 *
 * Note that the provided [parcel] must already be set to the appropriate [Parcel.dataPosition] before invoking
 * this function, as this function does not make assumptions about where the starting [Parcel.dataPosition] is
 * located. Failure to do so may result in an exception being thrown when attempting to encode.
 *
 * @param [parcel] The [Parcel] to encode the [value] to. Defaults to an empty [Parcel]. The [Parcel.dataPosition]
 * must be set correctly.
 * @param [value] The value that should be encoded into the [parcel].
 *
 * @return The provided [parcel] containing the encoded [value].
 */
@ExperimentalSerializationApi
inline fun <reified T> Parcelable.encodeToParcel(parcel: Parcel = Parcel(), value: T): Parcel {
    val encoder = ParcelEncoder(serializersModule = serializersModule, output = parcel)

    encoder.encodeSerializableValue(serializersModule.serializer(), value)

    return parcel
}

/**
 * Decodes the value of [T] from the provided [parcel]. This is a convenience function to [Parcelable.decodeFromParcel]
 * that retrieves the deserializer from the [Parcelable.serializersModule].
 *
 * Note that the provided [parcel] must already be set to the appropriate [Parcel.dataPosition] before invoking
 * this function, as this function does not make assumptions about where the starting [Parcel.dataPosition] is
 * located. Failure to do so may result in an exception being thrown when attempting to decode.
 *
 * @param [parcel] The [Parcel] to decode the returned value from. The [Parcel.dataPosition] must be set correctly.
 *
 * @return The decoded value of [T] obtained from the [parcel].
 */
@ExperimentalSerializationApi
inline fun <reified T> Parcelable.decodeFromParcel(parcel: Parcel): T {
    val decoder = ParcelDecoder(serializersModule = serializersModule, input = parcel)

    return decoder.decodeSerializableValue(serializersModule.serializer())
}
