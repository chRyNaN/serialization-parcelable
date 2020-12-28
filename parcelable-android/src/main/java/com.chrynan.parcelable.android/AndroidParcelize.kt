@file:Suppress("unused")

package com.chrynan.parcelable.android

import android.os.Parcel
import android.os.Parcelable
import kotlinx.serialization.ExperimentalSerializationApi
import kotlin.reflect.KClass

@ExperimentalSerializationApi
fun <T : Any> AndroidParceler.parcelize(value: T, kClass: KClass<T>): GenericParcelable<T> {
    val parceler = this

    return object : GenericParcelable<T>() {

        override val item = value

        override fun describeContents(): Int = parceler.describeContents(item)

        override fun writeToParcel(dest: Parcel, flags: Int) {
            parceler.writeToParcel(item, dest, kClass)
        }

        @JvmField
        val CREATOR = object : Parcelable.Creator<GenericParcelable<T>> {

            override fun createFromParcel(source: Parcel): GenericParcelable<T> =
                parceler.parcelize(parceler.createFromParcel(source, kClass), kClass)

            override fun newArray(size: Int): Array<GenericParcelable<T>?> = parceler.newArray(size)
        }
    }
}

@ExperimentalSerializationApi
inline fun <reified T : Any> AndroidParceler.parcelize(value: T): GenericParcelable<T> = parcelize(value, T::class)

@ExperimentalSerializationApi
fun <T : Any> com.chrynan.parcelable.core.Parcelable.parcelize(value: T, kClass: KClass<T>): Parcelable =
    AndroidParceler(this).parcelize(value, kClass)

@ExperimentalSerializationApi
inline fun <reified T : Any> com.chrynan.parcelable.core.Parcelable.parcelize(value: T): Parcelable =
    parcelize(value, T::class)
