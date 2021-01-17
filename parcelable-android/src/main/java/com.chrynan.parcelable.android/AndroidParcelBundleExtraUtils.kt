@file:Suppress("unused")

package com.chrynan.parcelable.android

import android.os.Bundle
import kotlinx.serialization.ExperimentalSerializationApi
import kotlin.reflect.KClass

@ExperimentalSerializationApi
inline fun <reified T : Any> AndroidParceler.encodeToBundle(value: T): Bundle = encodeToBundle(value, T::class)

@ExperimentalSerializationApi
fun <T : Any> com.chrynan.parcelable.core.Parcelable.encodeToBundle(value: T, kClass: KClass<T>): Bundle =
    AndroidParceler(this).encodeToBundle(value, kClass)

@ExperimentalSerializationApi
inline fun <reified T : Any> com.chrynan.parcelable.core.Parcelable.encodeToBundle(value: T): Bundle =
    AndroidParceler(this).encodeToBundle(value)

@ExperimentalSerializationApi
inline fun <reified T : Any> AndroidParceler.decodeFromBundle(bundle: Bundle, flags: Int = 0): T? =
    decodeFromBundle(bundle, T::class, flags)

@ExperimentalSerializationApi
fun <T : Any> com.chrynan.parcelable.core.Parcelable.decodeFromBundle(
    bundle: Bundle,
    kClass: KClass<T>,
    flags: Int = 0
): T? = AndroidParceler(this).decodeFromBundle(bundle, kClass, flags)

@ExperimentalSerializationApi
inline fun <reified T : Any> com.chrynan.parcelable.core.Parcelable.decodeFromBundle(
    bundle: Bundle,
    flags: Int = 0
): T? = AndroidParceler(this).decodeFromBundle(bundle, flags)
