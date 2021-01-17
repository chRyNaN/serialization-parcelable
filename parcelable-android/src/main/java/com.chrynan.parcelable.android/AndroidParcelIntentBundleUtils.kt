@file:Suppress("unused")

package com.chrynan.parcelable.android

import android.content.Intent
import android.os.Bundle
import com.chrynan.parcelable.core.Parcelable
import kotlinx.serialization.ExperimentalSerializationApi

@ExperimentalSerializationApi
inline fun <reified T : Any> Intent.putExtra(key: String, value: T, parceler: AndroidParceler) {
    putExtra(key, parceler.bundle(value))
}

@ExperimentalSerializationApi
inline fun <reified T : Any> Intent.putExtra(key: String, value: T, parceler: Parcelable) {
    val bundle = parceler.bundle(value)
    putExtra(key, bundle)
}

@ExperimentalSerializationApi
inline fun <reified T : Any> Intent.getParcelableExtra(key: String, parceler: AndroidParceler): T? {
    val bundle = getBundleExtra(key)
    return bundle?.let { parceler.unbundle<T>(it) }
}

@ExperimentalSerializationApi
inline fun <reified T : Any> Intent.getParcelableExtra(key: String, parceler: Parcelable): T? {
    val bundle = getBundleExtra(key)
    return bundle?.let { parceler.unbundle<T>(it) }
}

@ExperimentalSerializationApi
inline fun <reified T : Any> Bundle.putParcelable(
    key: String,
    value: T,
    parceler: AndroidParceler
) {
    putBundle(key, parceler.bundle(value))
}

@ExperimentalSerializationApi
inline fun <reified T : Any> Bundle.putParcelable(key: String, value: T, parceler: Parcelable) {
    putBundle(key, parceler.bundle(value))
}

@ExperimentalSerializationApi
inline fun <reified T : Any> Bundle.getParcelable(key: String, parceler: AndroidParceler): T? {
    val bundle = getBundle(key)
    return bundle?.let { parceler.unbundle<T>(it) }
}

@ExperimentalSerializationApi
inline fun <reified T : Any> Bundle.getParcelable(key: String, parceler: Parcelable): T? {
    val bundle = getBundle(key)
    return bundle?.let { parceler.unbundle<T>(it) }
}
