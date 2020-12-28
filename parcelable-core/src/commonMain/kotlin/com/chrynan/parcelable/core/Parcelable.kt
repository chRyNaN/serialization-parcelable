@file:Suppress("unused")

package com.chrynan.parcelable.core

import kotlinx.serialization.*
import kotlinx.serialization.modules.SerializersModule

@ExperimentalSerializationApi
sealed class Parcelable(internal val configuration: ParcelableConfiguration) : SerialFormat {

    override val serializersModule: SerializersModule
        get() = configuration.serializersModule

    object Default : Parcelable(ParcelableConfiguration())

    class Custom internal constructor(configuration: ParcelableConfiguration) : Parcelable(configuration)

    fun <T> encodeToParcel(parcel: Parcel, serializer: SerializationStrategy<T>, value: T): Parcel {
        val encoder = ParcelEncoder(serializersModule = serializersModule, output = parcel)
        encoder.encodeSerializableValue(serializer, value)
        return parcel
    }

    fun <T> decodeFromParcel(parcel: Parcel, deserializer: DeserializationStrategy<T>): T {
        val decoder = ParcelDecoder(serializersModule = serializersModule, input = parcel)
        return decoder.decodeSerializableValue(deserializer)
    }
}

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

@ExperimentalSerializationApi
inline fun <reified T> Parcelable.encodeToParcel(parcel: Parcel, value: T): Parcel {
    val encoder = ParcelEncoder(serializersModule = serializersModule, output = parcel)
    encoder.encodeSerializableValue(serializersModule.serializer(), value)
    return parcel
}

@ExperimentalSerializationApi
inline fun <reified T> Parcelable.decodeFromParcel(parcel: Parcel): T {
    val decoder = ParcelDecoder(serializersModule = serializersModule, input = parcel)
    return decoder.decodeSerializableValue(serializersModule.serializer())
}
