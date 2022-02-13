@file:Suppress("unused")

package com.chrynan.parcelable.core

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerializationStrategy
import kotlinx.serialization.serializer
import kotlin.reflect.KClass

@ExperimentalSerializationApi
fun <T> Parcelable.encodeToParcel(
    parcel: android.os.Parcel,
    serializer: SerializationStrategy<T>,
    value: T
): Parcel {
    val androidParcel = AndroidParcel(parcel)
    val encoder = ParcelEncoder(serializersModule = serializersModule, output = androidParcel)
    encoder.encodeSerializableValue(serializer, value)
    return androidParcel
}

@ExperimentalSerializationApi
inline fun <reified T> Parcelable.encodeToParcel(parcel: android.os.Parcel, value: T): Parcel {
    val androidParcel = AndroidParcel(parcel)
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
    val androidParcel = AndroidParcel(parcel)
    val encoder = ParcelEncoder(serializersModule = serializersModule, output = androidParcel)
    encoder.encodeSerializableValue(serializersModule.serializer(kclass.java), value)
    return androidParcel
}
