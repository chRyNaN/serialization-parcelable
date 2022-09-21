@file:Suppress("unused")

package com.chrynan.parcelable.core

import android.os.Bundle
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerializationException
import kotlin.reflect.KClass
import kotlinx.serialization.serializer

@ExperimentalSerializationApi
fun <T : Any> AndroidParceler.decodeFromBundleOrNull(bundle: Bundle, kClass: KClass<T>, flags: Int = 0): T? =
    try {
        decodeFromBundle(bundle, kClass, flags)
    } catch (e: SerializationException) {
        null
    }

@ExperimentalSerializationApi
inline fun <reified T> AndroidParceler.decodeFromBundle(bundle: Bundle, flags: Int = 0): T =
    decodeFromBundle(bundle, serializersModule.serializer(), flags)

@ExperimentalSerializationApi
inline fun <reified T> AndroidParceler.decodeFromBundleOrNull(bundle: Bundle, flags: Int = 0): T? =
    try {
        decodeFromBundle(bundle, flags)
    } catch (e: SerializationException) {
        null
    }

@ExperimentalSerializationApi
fun <T : Any> Parcelable.decodeFromBundle(
    bundle: Bundle,
    kClass: KClass<T>,
    flags: Int = 0
): T = AndroidParceler(this).decodeFromBundle(bundle, kClass, flags)

@ExperimentalSerializationApi
fun <T : Any> Parcelable.decodeFromBundleOrNull(
    bundle: Bundle,
    kClass: KClass<T>,
    flags: Int = 0
): T? =
    try {
        AndroidParceler(this).decodeFromBundle(bundle, kClass, flags)
    } catch (e: SerializationException) {
        null
    }

@ExperimentalSerializationApi
inline fun <reified T> Parcelable.decodeFromBundle(
    bundle: Bundle,
    flags: Int = 0
): T = decodeFromBundle(bundle, serializersModule.serializer(), flags)

@ExperimentalSerializationApi
fun <T> Parcelable.decodeFromBundle(
    bundle: Bundle,
    deserializer: DeserializationStrategy<T>,
    flags: Int = 0
): T = AndroidParceler(this).decodeFromBundle(bundle, deserializer, flags)

@ExperimentalSerializationApi
inline fun <reified T> Parcelable.decodeFromBundleOrNull(
    bundle: Bundle,
    flags: Int = 0
): T? =
    try {
        decodeFromBundle(bundle, flags)
    } catch (e: Exception) {
        null
    }

@ExperimentalSerializationApi
fun <T> Parcelable.decodeFromBundleOrNull(
    bundle: Bundle,
    flags: Int = 0,
    deserializer: DeserializationStrategy<T>
): T? =
    try {
        decodeFromBundle(bundle, deserializer, flags)
    } catch (e: Exception) {
        null
    }
