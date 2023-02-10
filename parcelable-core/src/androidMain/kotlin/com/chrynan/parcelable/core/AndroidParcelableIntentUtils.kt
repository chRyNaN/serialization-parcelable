package com.chrynan.parcelable.core

import android.content.Intent
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerializationStrategy
import kotlinx.serialization.serializer
import kotlin.reflect.KClass

@ExperimentalSerializationApi
fun <T : Any> Parcelable.encodeToIntent(name: String, value: T, kClass: KClass<T>, intent: Intent): Intent {
    val bundle = this.encodeToBundle(value = value, kClass = kClass)

    intent.putExtra(name, bundle)

    return intent
}

@ExperimentalSerializationApi
fun <T> Parcelable.encodeToIntent(
    name: String,
    value: T,
    serializer: SerializationStrategy<T>,
    intent: Intent
): Intent {
    val bundle = this.encodeToBundle(value = value, serializer = serializer)

    intent.putExtra(name, bundle)

    return intent
}

@ExperimentalSerializationApi
inline fun <reified T> Parcelable.encodeToIntent(
    name: String,
    value: T,
    intent: Intent
): Intent = encodeToIntent(name = name, value = value, serializer = serializersModule.serializer(), intent = intent)

@ExperimentalSerializationApi
fun <T : Any> Parcelable.decodeFromIntent(name: String, kClass: KClass<T>, flags: Int = 0, intent: Intent): T? {
    val bundle = intent.getBundleExtra(name)

    return bundle?.let { this.decodeFromBundle(bundle = it, kClass = kClass, flags = flags) }
}

@ExperimentalSerializationApi
fun <T> Parcelable.decodeFromIntent(
    name: String,
    deserializer: DeserializationStrategy<T>,
    flags: Int = 0,
    intent: Intent
): T? {
    val bundle = intent.getBundleExtra(name)

    return bundle?.let { this.decodeFromBundle(bundle = it, deserializer = deserializer, flags = flags) }
}

@ExperimentalSerializationApi
inline fun <reified T> Parcelable.decodeFromIntent(
    name: String,
    flags: Int = 0,
    intent: Intent
): T? = decodeFromIntent(name = name, deserializer = serializersModule.serializer(), flags = flags, intent = intent)
