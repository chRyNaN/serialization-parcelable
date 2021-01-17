@file:Suppress("unused")

package com.chrynan.parcelable.android

import android.os.Bundle
import kotlinx.serialization.ExperimentalSerializationApi
import kotlin.reflect.KClass

@ExperimentalSerializationApi
inline fun <reified T : Any> AndroidParceler.bundle(value: T): Bundle = bundle(value, T::class)

@ExperimentalSerializationApi
fun <T : Any> com.chrynan.parcelable.core.Parcelable.bundle(value: T, kClass: KClass<T>): Bundle =
    AndroidParceler(this).bundle(value, kClass)

@ExperimentalSerializationApi
inline fun <reified T : Any> com.chrynan.parcelable.core.Parcelable.bundle(value: T): Bundle =
    AndroidParceler(this).bundle(value)

@ExperimentalSerializationApi
inline fun <reified T : Any> AndroidParceler.unbundle(bundle: Bundle, flags: Int = 0): T? =
    unbundle(bundle, T::class, flags)

@ExperimentalSerializationApi
fun <T : Any> com.chrynan.parcelable.core.Parcelable.unbundle(bundle: Bundle, kClass: KClass<T>, flags: Int = 0): T? =
    AndroidParceler(this).unbundle(bundle, kClass, flags)

@ExperimentalSerializationApi
inline fun <reified T : Any> com.chrynan.parcelable.core.Parcelable.unbundle(bundle: Bundle, flags: Int = 0): T? =
    AndroidParceler(this).unbundle(bundle, flags)
