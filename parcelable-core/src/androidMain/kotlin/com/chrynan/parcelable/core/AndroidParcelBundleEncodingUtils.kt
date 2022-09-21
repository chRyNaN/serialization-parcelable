@file:Suppress("unused")

package com.chrynan.parcelable.core

import android.os.Bundle
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerializationStrategy
import kotlin.reflect.KClass
import kotlinx.serialization.serializer

@ExperimentalSerializationApi
inline fun <reified T> AndroidParceler.encodeToBundle(value: T): Bundle =
    encodeToBundle(value, serializersModule.serializer())

@ExperimentalSerializationApi
fun <T : Any> Parcelable.encodeToBundle(value: T, kClass: KClass<T>): Bundle =
    AndroidParceler(this).encodeToBundle(value, kClass)

@ExperimentalSerializationApi
inline fun <reified T> Parcelable.encodeToBundle(value: T): Bundle =
    AndroidParceler(this).encodeToBundle(value)

@ExperimentalSerializationApi
fun <T> Parcelable.encodeToBundle(value: T, serializer: SerializationStrategy<T>): Bundle =
    AndroidParceler(this).encodeToBundle(value, serializer)
