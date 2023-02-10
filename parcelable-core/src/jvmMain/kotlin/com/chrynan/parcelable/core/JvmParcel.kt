@file:Suppress("unused")

package com.chrynan.parcelable.core

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.serializer
import kotlin.reflect.KClass

actual fun Parcel(): Parcel = ByteArrayParcel()

actual fun Parcel(data: ByteArray): Parcel = ByteArrayParcel(initial = data)

/**
 * A convenience function to [Parcelable.encodeToParcel] that retrieves the serializer from the
 * [Parcelable.serializersModule].
 */
@ExperimentalSerializationApi
fun <T : Any> Parcelable.encodeToParcel(parcel: Parcel = Parcel(), kClass: KClass<T>, value: T): Parcel {
    val encoder = ParcelEncoder(serializersModule = serializersModule, output = parcel)

    encoder.encodeSerializableValue(serializersModule.serializer(kClass.java), value)

    return parcel
}

/**
 * A convenience function to [Parcelable.decodeFromParcel] that retrieves the deserializer from the
 * [Parcelable.serializersModule].
 */
@Suppress("UNCHECKED_CAST")
@ExperimentalSerializationApi
fun <T : Any> Parcelable.decodeFromParcel(parcel: Parcel, kClass: KClass<T>): T {
    val decoder = ParcelDecoder(serializersModule = serializersModule, input = parcel)

    return decoder.decodeSerializableValue(serializersModule.serializer(kClass.java)) as T
}
