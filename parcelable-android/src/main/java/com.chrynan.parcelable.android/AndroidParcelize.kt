@file:Suppress("unused")

package com.chrynan.parcelable.android

import android.os.Bundle
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
fun <T : Any> com.chrynan.parcelable.core.Parcelable.parcelize(value: T, kClass: KClass<T>): GenericParcelable<T> =
    AndroidParceler(this).parcelize(value, kClass)

@ExperimentalSerializationApi
inline fun <reified T : Any> com.chrynan.parcelable.core.Parcelable.parcelize(value: T): GenericParcelable<T> =
    parcelize(value, T::class)

@ExperimentalSerializationApi
fun <T : Any> AndroidParceler.bundle(value: T, kClass: KClass<T>): Bundle {
    val bundle = Bundle()
    val parcel = Parcel.obtain()
    this.writeToParcel(value, parcel, kClass)
    bundle.readFromParcel(parcel)
    parcel.recycle()
    return bundle
}

@ExperimentalSerializationApi
inline fun <reified T : Any> AndroidParceler.bundle(value: T): Bundle = bundle(value, T::class)

@ExperimentalSerializationApi
fun <T : Any> com.chrynan.parcelable.core.Parcelable.bundle(value: T, kClass: KClass<T>): Bundle =
    AndroidParceler(this).bundle(value, kClass)

@ExperimentalSerializationApi
inline fun <reified T : Any> com.chrynan.parcelable.core.Parcelable.bundle(value: T): Bundle =
    AndroidParceler(this).bundle(value)

@ExperimentalSerializationApi
fun <T : Any> AndroidParceler.unbundle(bundle: Bundle, kClass: KClass<T>, flags: Int = 0): T? {
    val parcel = Parcel.obtain()
    bundle.writeToParcel(parcel, flags)

    val length = parcel.readInt()
    if (length <= 0) return null

    // There's some internal "magic" int property that we don't need.
    parcel.readInt()

    val item = this.createFromParcel(parcel, kClass)
    parcel.recycle()
    return item
}

@ExperimentalSerializationApi
inline fun <reified T : Any> AndroidParceler.unbundle(bundle: Bundle, flags: Int = 0): T? =
    unbundle(bundle, T::class, flags)

@ExperimentalSerializationApi
fun <T : Any> com.chrynan.parcelable.core.Parcelable.unbundle(bundle: Bundle, kClass: KClass<T>, flags: Int = 0): T? =
    AndroidParceler(this).unbundle(bundle, kClass, flags)

@ExperimentalSerializationApi
inline fun <reified T : Any> com.chrynan.parcelable.core.Parcelable.unbundle(bundle: Bundle, flags: Int = 0): T? =
    AndroidParceler(this).unbundle(bundle, flags)
