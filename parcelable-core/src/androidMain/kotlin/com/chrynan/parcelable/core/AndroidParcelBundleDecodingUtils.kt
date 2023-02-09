@file:Suppress("unused")

package com.chrynan.parcelable.core

import android.os.Bundle
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerializationException
import kotlin.reflect.KClass

@ExperimentalSerializationApi
fun <T : Any> Parcelable.decodeFromBundleOrNull(bundle: Bundle, kClass: KClass<T>, flags: Int = 0): T? =
    try {
        decodeFromBundle(bundle, kClass, flags)
    } catch (e: SerializationException) {
        null
    }

@ExperimentalSerializationApi
inline fun <reified T : Any> Parcelable.decodeFromBundle(bundle: Bundle, flags: Int = 0): T =
    decodeFromBundle(bundle, T::class, flags)

@ExperimentalSerializationApi
inline fun <reified T : Any> Parcelable.decodeFromBundleOrNull(bundle: Bundle, flags: Int = 0): T? =
    try {
        decodeFromBundle(bundle, T::class, flags)
    } catch (e: SerializationException) {
        null
    }
