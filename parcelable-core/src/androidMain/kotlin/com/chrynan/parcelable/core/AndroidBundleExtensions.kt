@file:Suppress("unused")

package com.chrynan.parcelable.core

import android.os.Bundle
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerializationStrategy
import kotlin.reflect.KClass

@ExperimentalSerializationApi
public fun <T : Any> Bundle.putParcelable(
    key: String,
    value: T,
    kClass: KClass<T>,
    parcelable: Parcelable = Parcelable.Default
): Unit = putBundle(key, parcelable.encodeToBundle(value = value, kClass = kClass))

@ExperimentalSerializationApi
public fun <T> Bundle.putParcelable(
    key: String,
    value: T,
    serializer: SerializationStrategy<T>,
    parcelable: Parcelable = Parcelable.Default,
): Unit = putBundle(key, parcelable.encodeToBundle(value = value, serializer = serializer))

@ExperimentalSerializationApi
public inline fun <reified T> Bundle.putParcelable(key: String, value: T, parcelable: Parcelable = Parcelable.Default): Unit =
    putBundle(key, parcelable.encodeToBundle(value = value))

@ExperimentalSerializationApi
public fun <T : Any> Bundle.getParcelable(
    key: String,
    kClass: KClass<T>,
    flags: Int = 0,
    parcelable: Parcelable = Parcelable.Default,
): T? {
    val bundle = getBundle(key)

    return bundle?.let { parcelable.decodeFromBundle(bundle = it, kClass = kClass, flags = flags) }
}

@ExperimentalSerializationApi
public fun <T> Bundle.getParcelable(
    key: String,
    deserializer: DeserializationStrategy<T>,
    flags: Int = 0,
    parcelable: Parcelable = Parcelable.Default,
): T? {
    val bundle = getBundle(key)

    return bundle?.let { parcelable.decodeFromBundle(bundle = it, deserializer = deserializer, flags = flags) }
}

@ExperimentalSerializationApi
public inline fun <reified T> Bundle.getParcelable(
    key: String,
    flags: Int = 0,
    parcelable: Parcelable = Parcelable.Default
): T? {
    val bundle = getBundle(key)

    return bundle?.let { parcelable.decodeFromBundle(bundle = it, flags = flags) }
}
