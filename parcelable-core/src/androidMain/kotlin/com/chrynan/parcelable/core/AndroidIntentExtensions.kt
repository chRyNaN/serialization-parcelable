@file:Suppress("unused")

package com.chrynan.parcelable.core

import android.content.Intent
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerializationStrategy
import kotlin.reflect.KClass

@ExperimentalSerializationApi
public fun <T : Any> Intent.putExtra(
    name: String,
    value: T,
    kClass: KClass<T>,
    parcelable: Parcelable = Parcelable.Default
): Intent = parcelable.encodeToIntent(name = name, value = value, kClass = kClass, intent = this)

@ExperimentalSerializationApi
public fun <T> Intent.putExtra(
    name: String,
    value: T,
    serializer: SerializationStrategy<T>,
    parcelable: Parcelable = Parcelable.Default,
): Intent = parcelable.encodeToIntent(name = name, value = value, serializer = serializer, intent = this)

@ExperimentalSerializationApi
public inline fun <reified T> Intent.putExtra(
    name: String,
    value: T,
    parcelable: Parcelable = Parcelable.Default,
): Intent = parcelable.encodeToIntent(
    name = name,
    value = value,
    intent = this
)

@ExperimentalSerializationApi
public fun <T : Any> Intent.getParcelableExtra(
    name: String,
    kClass: KClass<T>,
    flags: Int = 0,
    parcelable: Parcelable = Parcelable.Default
): T? = parcelable.decodeFromIntent(name = name, kClass = kClass, flags = flags, intent = this)

@ExperimentalSerializationApi
public fun <T : Any> Intent.getParcelableExtra(
    name: String,
    deserializer: DeserializationStrategy<T>,
    flags: Int = 0,
    parcelable: Parcelable = Parcelable.Default
): T? = parcelable.decodeFromIntent(name = name, deserializer = deserializer, flags = flags, intent = this)

@ExperimentalSerializationApi
public inline fun <reified T : Any> Intent.getParcelableExtra(
    name: String,
    flags: Int = 0,
    parcelable: Parcelable = Parcelable.Default
): T? = parcelable.decodeFromIntent(
    name = name,
    flags = flags,
    intent = this
)
