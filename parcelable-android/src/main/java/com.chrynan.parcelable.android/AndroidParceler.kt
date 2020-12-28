@file:Suppress("unused")

package com.chrynan.parcelable.android

import android.os.Parcel
import com.chrynan.parcelable.core.Parcelable
import kotlinx.serialization.ExperimentalSerializationApi
import kotlin.reflect.KClass

@ExperimentalSerializationApi
class AndroidParceler(
    private val parcelable: Parcelable
) {

    fun <T : Any> createFromParcel(source: Parcel, kClass: KClass<T>): T = parcelable.decodeFromParcel(source, kClass)

    @Suppress("UNCHECKED_CAST")
    fun <T : Any> newArray(size: Int): Array<T?> = arrayOfNulls<Any?>(size) as Array<T?>

    fun <T> describeContents(value: T): Int = value.hashCode()

    fun <T : Any> writeToParcel(value: T, dest: Parcel, kClass: KClass<T>) =
        parcelable.encodeToParcel(dest, value, kClass)
}

@ExperimentalSerializationApi
inline fun <reified T : Any> AndroidParceler.createFromParcel(source: Parcel): T = createFromParcel(source, T::class)

@ExperimentalSerializationApi
inline fun <reified T : Any> AndroidParceler.newArrayInline(size: Int): Array<T?> = arrayOfNulls(size)

@ExperimentalSerializationApi
inline fun <reified T : Any> AndroidParceler.writeToParcel(value: T, dest: Parcel) =
    writeToParcel(value, dest, T::class)
