@file:Suppress("unused")

package com.chrynan.parcelable.core

import android.os.Bundle
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerializationStrategy

@ExperimentalSerializationApi
inline fun <reified T : Any> Bundle.putParcelable(
    key: String,
    value: T,
    parceler: AndroidParceler
) {
    putBundle(key, parceler.encodeToBundle(value))
}

@ExperimentalSerializationApi
inline fun <reified T> Bundle.putParcelable(key: String, value: T, parcelable: Parcelable = Parcelable.Default) {
    putBundle(key, parcelable.encodeToBundle(value))
}

@ExperimentalSerializationApi
fun <T> Bundle.putParcelable(
    key: String,
    value: T,
    parcelable: Parcelable = Parcelable.Default,
    serializer: SerializationStrategy<T>
) {
    putBundle(key, parcelable.encodeToBundle(value, serializer))
}

@ExperimentalSerializationApi
inline fun <reified T> Bundle.getParcelable(key: String, parceler: AndroidParceler): T? {
    val bundle = getBundle(key)
    return bundle?.let { parceler.decodeFromBundle(it) }
}

@ExperimentalSerializationApi
inline fun <reified T> Bundle.getParcelable(key: String, parcelable: Parcelable = Parcelable.Default): T? {
    val bundle = getBundle(key)
    return bundle?.let { parcelable.decodeFromBundle(it) }
}

@ExperimentalSerializationApi
fun <T> Bundle.getParcelable(
    key: String,
    parcelable: Parcelable = Parcelable.Default,
    deserializer: DeserializationStrategy<T>
): T? {
    val bundle = getBundle(key)
    return bundle?.let { parcelable.decodeFromBundle(it, deserializer) }
}
