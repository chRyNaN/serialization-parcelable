package com.chrynan.parcelable.core

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.serializer
import kotlin.reflect.KClass

/**
 * Encodes the provided [value] to the provided [parcel] using the provided [serializer]. This is a convenience
 * function to [Parcelable.encodeToParcel] that retrieves the serializer from the [Parcelable.serializersModule] using
 * the provided [kClass].
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
fun <T : Any> Parcelable.encodeToParcel(parcel: Parcel = Parcel(), kClass: KClass<T>, value: T): Parcel {
    val encoder = ParcelEncoder(serializersModule = serializersModule, output = parcel)

    encoder.encodeSerializableValue(serializersModule.serializer(kClass.java), value)

    return parcel
}

/**
 * Decodes the value of [T] from the provided [parcel]. This is a convenience function to [Parcelable.decodeFromParcel]
 * that retrieves the deserializer from the [Parcelable.serializersModule] from the provided [kClass].
 *
 * Note that the provided [parcel] must already be set to the appropriate [Parcel.dataPosition] before invoking
 * this function, as this function does not make assumptions about where the starting [Parcel.dataPosition] is
 * located. Failure to do so may result in an exception being thrown when attempting to decode.
 *
 * @param [parcel] The [Parcel] to decode the returned value from. The [Parcel.dataPosition] must be set correctly.
 *
 * @return The decoded value of [T] obtained from the [parcel].
 */
@Suppress("UNCHECKED_CAST")
@ExperimentalSerializationApi
fun <T : Any> Parcelable.decodeFromParcel(parcel: Parcel, kClass: KClass<T>): T {
    val decoder = ParcelDecoder(serializersModule = serializersModule, input = parcel)

    return decoder.decodeSerializableValue(serializersModule.serializer(kClass.java)) as T
}
