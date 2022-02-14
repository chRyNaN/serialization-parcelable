@file:Suppress("unused")

package com.chrynan.parcelable.core

import android.content.Intent
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerializationStrategy

@ExperimentalSerializationApi
inline fun <reified T : Any> Intent.putExtra(key: String, value: T, parceler: AndroidParceler) {
    putExtra(key, parceler.encodeToBundle(value))
}

@ExperimentalSerializationApi
inline fun <reified T : Any> Intent.putExtra(key: String, value: T, parcelable: Parcelable = Parcelable.Default) {
    val bundle = parcelable.encodeToBundle(value)
    putExtra(key, bundle)
}

@ExperimentalSerializationApi
fun <T : Any> Intent.putExtra(
    key: String,
    value: T,
    parcelable: Parcelable = Parcelable.Default,
    serializer: SerializationStrategy<T>
) {
    val bundle = parcelable.encodeToBundle(value = value, serializer = serializer)
    putExtra(key, bundle)
}

@ExperimentalSerializationApi
inline fun <reified T : Any> Intent.getParcelableExtra(key: String, parceler: AndroidParceler): T? {
    val bundle = getBundleExtra(key)
    return bundle?.let { parceler.decodeFromBundle(it) }
}

@ExperimentalSerializationApi
inline fun <reified T : Any> Intent.getParcelableExtra(key: String, parcelable: Parcelable = Parcelable): T? {
    val bundle = getBundleExtra(key)
    return bundle?.let { parcelable.decodeFromBundle(it) }
}

@ExperimentalSerializationApi
fun <T : Any> Intent.getParcelableExtra(
    key: String,
    parcelable: Parcelable = Parcelable,
    deserializer: DeserializationStrategy<T>
): T? {
    val bundle = getBundleExtra(key)
    return bundle?.let { parcelable.decodeFromBundle(bundle = it, deserializer = deserializer) }
}
