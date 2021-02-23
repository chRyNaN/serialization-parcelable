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
 * components and processes, this [Parcelable] interface performs a similar task. Though they way they perform their
 * tasks differs.
 *
 * @see [Android Parcelable (not the same)](https://developer.android.com/reference/android/os/Parcelable))
 */
@ExperimentalSerializationApi
sealed class Parcelable(internal val configuration: ParcelableConfiguration) : SerialFormat {

    override val serializersModule: SerializersModule
        get() = configuration.serializersModule

    /**
     * The default [Parcelable] implementation using the default [ParcelableConfiguration] values. This class can be
     * used when no custom configuration is needed.
     */
    object Default : Parcelable(ParcelableConfiguration())

    /**
     * A custom [Parcelable] implementation using the provided [configuration] values. This class can be used when
     * custom configuration is needed.
     *
     * Note that instances of this class are created using the [Parcelable] function.
     */
    class Custom internal constructor(configuration: ParcelableConfiguration) : Parcelable(configuration)

    /**
     * Encodes the provided [value] to the provided [parcel] using the provided [serializer].
     *
     * @return The provided [parcel] containing the encoded [value].
     */
    fun <T> encodeToParcel(parcel: Parcel, serializer: SerializationStrategy<T>, value: T): Parcel {
        val encoder = ParcelEncoder(serializersModule = serializersModule, output = parcel)
        encoder.encodeSerializableValue(serializer, value)
        return parcel
    }

    /**
     * Decodes the value of [T] from the provided [parcel] using the provided [deserializer].
     *
     * @return The decoded value of [T].
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
@ExperimentalSerializationApi
fun Parcelable(
    from: Parcelable = Parcelable.Default,
    builderAction: ParcelableConfigurationBuilder.() -> Unit
): Parcelable {
    val builder = ParcelableConfigurationBuilder(from.configuration)
    builder.builderAction()
    val configuration = builder.build()
    return Parcelable.Custom(configuration)
}

/**
 * A convenience function to [Parcelable.encodeToParcel] that retrieves the serializer from the
 * [Parcelable.serializersModule].
 */
@ExperimentalSerializationApi
inline fun <reified T> Parcelable.encodeToParcel(parcel: Parcel, value: T): Parcel {
    val encoder = ParcelEncoder(serializersModule = serializersModule, output = parcel)
    encoder.encodeSerializableValue(serializersModule.serializer(), value)
    return parcel
}

/**
 * A convenience function to [Parcelable.decodeFromParcel] that retrieves the deserializer from the
 * [Parcelable.serializersModule].
 */
@ExperimentalSerializationApi
inline fun <reified T> Parcelable.decodeFromParcel(parcel: Parcel): T {
    val decoder = ParcelDecoder(serializersModule = serializersModule, input = parcel)
    return decoder.decodeSerializableValue(serializersModule.serializer())
}
