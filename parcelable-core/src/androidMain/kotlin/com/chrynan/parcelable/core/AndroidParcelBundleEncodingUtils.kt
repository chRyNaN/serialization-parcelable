@file:Suppress("unused")

package com.chrynan.parcelable.core

import android.os.Bundle
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerializationStrategy
import kotlinx.serialization.serializer
import kotlin.reflect.KClass

@ExperimentalSerializationApi
inline fun <reified T : Any> AndroidParceler.encodeToBundle(value: T): Bundle = encodeToBundle(value, T::class)

@ExperimentalSerializationApi
fun <T : Any> Parcelable.encodeToBundle(value: T, kClass: KClass<T>): Bundle =
    AndroidParceler(this).encodeToBundle(value, kClass)

@ExperimentalSerializationApi
inline fun <reified T> Parcelable.encodeToBundle(value: T): Bundle =
    AndroidParceler(this).encodeToBundle(value, serializersModule.serializer())

@ExperimentalSerializationApi
fun <T> Parcelable.encodeToBundle(value: T, serializer: SerializationStrategy<T>): Bundle =
    AndroidParceler(this).encodeToBundle(value, serializer)
