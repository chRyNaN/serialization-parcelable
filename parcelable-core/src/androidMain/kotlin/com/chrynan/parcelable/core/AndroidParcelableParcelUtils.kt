@file:Suppress("unused")

package com.chrynan.parcelable.core

import kotlinx.serialization.*
import kotlin.reflect.KClass

@ExperimentalSerializationApi
fun <T> Parcelable.encodeToParcel(
    parcel: android.os.Parcel,
    serializer: SerializationStrategy<T>,
    value: T
): Parcel {
    val androidParcel = Parcel(parcel)
    val encoder = ParcelEncoder(serializersModule = serializersModule, output = androidParcel)
    encoder.encodeSerializableValue(serializer, value)
    return androidParcel
}

@ExperimentalSerializationApi
inline fun <reified T> Parcelable.encodeToParcel(parcel: android.os.Parcel, value: T): Parcel {
    val androidParcel = Parcel(parcel)
    val encoder = ParcelEncoder(serializersModule = serializersModule, output = androidParcel)
    encoder.encodeSerializableValue(serializersModule.serializer(), value)
    return androidParcel
}

@ExperimentalSerializationApi
fun <T : Any> Parcelable.encodeToParcel(
    parcel: android.os.Parcel,
    value: T,
    kclass: KClass<T>
): Parcel {
    val androidParcel = Parcel(parcel)
    val encoder = ParcelEncoder(serializersModule = serializersModule, output = androidParcel)
    encoder.encodeSerializableValue(serializersModule.serializer(kclass.java), value)
    return androidParcel
}

@ExperimentalSerializationApi
fun <T> Parcelable.decodeFromParcel(parcel: android.os.Parcel, deserializer: DeserializationStrategy<T>): T {
    val decoder = ParcelDecoder(serializersModule = serializersModule, input = Parcel(parcel))
    return decoder.decodeSerializableValue(deserializer)
}

@ExperimentalSerializationApi
inline fun <reified T> Parcelable.decodeFromParcel(parcel: android.os.Parcel): T {
    val decoder = ParcelDecoder(serializersModule = serializersModule, input = Parcel(parcel))
    return decoder.decodeSerializableValue(serializersModule.serializer())
}

@Suppress("UNCHECKED_CAST")
@ExperimentalSerializationApi
fun <T : Any> Parcelable.decodeFromParcel(parcel: android.os.Parcel, kclass: KClass<T>): T {
    val decoder = ParcelDecoder(serializersModule = serializersModule, input = Parcel(parcel))
    return decoder.decodeSerializableValue(serializersModule.serializer(kclass.java)) as T
}

@ExperimentalSerializationApi
fun <T> Parcelable.decodeFromParcelOrNull(parcel: android.os.Parcel, deserializer: DeserializationStrategy<T>): T? =
    try {
        decodeFromParcel(parcel, deserializer)
    } catch (e: SerializationException) {
        null
    }

@ExperimentalSerializationApi
inline fun <reified T> Parcelable.decodeFromParcelOrNull(parcel: android.os.Parcel): T? =
    try {
        decodeFromParcel(parcel)
    } catch (e: SerializationException) {
        null
    }

@ExperimentalSerializationApi
fun <T : Any> Parcelable.decodeFromParcelOrNull(parcel: android.os.Parcel, kclass: KClass<T>): T? =
    try {
        decodeFromParcel(parcel, kclass)
    } catch (e: SerializationException) {
        null
    }
