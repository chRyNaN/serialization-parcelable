@file:Suppress("unused")

package com.chrynan.parcelable.android

import android.content.Intent
import android.os.Bundle
import com.chrynan.parcelable.core.Parcelable
import kotlinx.serialization.ExperimentalSerializationApi

@ExperimentalSerializationApi
inline fun <reified T : Any> Intent.putExtra(key: String, value: T, parceler: AndroidParceler) {
    putExtra(key, parceler.parcelize(value))
}

@ExperimentalSerializationApi
inline fun <reified T : Any> Intent.putExtra(key: String, value: T, parceler: Parcelable) {
    putExtra(key, parceler.parcelize(value))
}

@ExperimentalSerializationApi
inline fun <reified T : Any> Intent.getKotlinParcelableExtra(key: String) =
    getParcelableExtra<GenericParcelable<T>>(key)?.item

@ExperimentalSerializationApi
inline fun <reified T : Any> Bundle.putParcelable(
    key: String,
    value: T,
    parceler: AndroidParceler
) {
    putParcelable(key, parceler.parcelize(value))
}

@ExperimentalSerializationApi
inline fun <reified T : Any> Bundle.putParcelable(key: String, value: T, parceler: Parcelable) {
    putParcelable(key, parceler.parcelize(value))
}

@ExperimentalSerializationApi
inline fun <reified T : Any> Bundle.getKotlinParcelable(key: String) =
    getParcelable<GenericParcelable<T>>(key)?.item
