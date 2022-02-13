@file:Suppress("unused")

package com.chrynan.parcelable.core

import kotlinx.serialization.ExperimentalSerializationApi
import kotlin.reflect.KClass

/**
 * A class bridging the serialization logic between the [Parcelable] interface in this library and the Android
 * [android.os.Parcel] and [android.os.Parcelable] interfaces.
 */
@ExperimentalSerializationApi
class AndroidParceler(
    private val parcelable: Parcelable
) {

    /**
     * Retrieves the value of [T] represented by the provided [kClass] from the underlying [android.os.Parcel] using
     * the [parcelable] instance.
     */
    fun <T : Any> createFromParcel(source: android.os.Parcel, kClass: KClass<T>): T =
        parcelable.decodeFromParcel(source, kClass)

    /**
     * Retrieves a new empty array for type [T].
     */
    @Suppress("UNCHECKED_CAST")
    fun <T : Any> newArray(size: Int): Array<T?> = arrayOfNulls<Any?>(size) as Array<T?>

    /**
     * Retrieves the [hashCode] for the provided [value] used to describe it's contents in the underlying
     * [android.os.Parcel].
     */
    fun <T> describeContents(value: T): Int = value.hashCode()

    /**
     * Writes the provided [value], represented by the provided [kClass], to the [dest] [android.os.Parcel] using the
     * [parcelable] instance.
     */
    fun <T : Any> writeToParcel(value: T, dest: android.os.Parcel, kClass: KClass<T>) =
        parcelable.encodeToParcel(dest, value, kClass)
}

/**
 * A reified convenience function for [AndroidParceler.createFromParcel].
 */
@ExperimentalSerializationApi
inline fun <reified T : Any> AndroidParceler.createFromParcel(source: android.os.Parcel): T =
    createFromParcel(source, T::class)

/**
 * A reified convenience function for [AndroidParceler.newArray].
 */
@ExperimentalSerializationApi
inline fun <reified T : Any> AndroidParceler.newArrayInline(size: Int): Array<T?> = arrayOfNulls(size)

/**
 * A reified convenience function for [AndroidParceler.writeToParcel].
 */
@ExperimentalSerializationApi
inline fun <reified T : Any> AndroidParceler.writeToParcel(value: T, dest: android.os.Parcel) =
    writeToParcel(value, dest, T::class)
