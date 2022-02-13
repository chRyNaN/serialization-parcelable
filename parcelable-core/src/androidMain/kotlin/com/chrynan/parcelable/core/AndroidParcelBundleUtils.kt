package com.chrynan.parcelable.core

import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import kotlinx.serialization.ExperimentalSerializationApi
import kotlin.reflect.KClass

/**
 * Writes the provide [value] of [kClass] into a [Bundle] and returns it.
 * The returned [Bundle] can then be used as extras in [Intent]s or other
 * [Bundle]s.
 */
@ExperimentalSerializationApi
fun <T : Any> AndroidParceler.encodeToBundle(value: T, kClass: KClass<T>): Bundle {
    // Create a new Bundle and obtain a Parcel from the Parcel Pool.
    val bundle = Bundle()
    val parcel = Parcel.obtain()

    // Write the properties of the value to the Parcel, then set it's data
    // position back to zero so that it can be read.
    this.writeToParcel(value, parcel, kClass)
    parcel.setDataPosition(0)

    // Obtain a new Parcel from the Parcel Pool and write to it the size
    // of the first Parcel, some magic number, and the contents of the first
    // Parcel. This is a bit "hacky" but we don't know the size of the first
    // Parcel until after it has already been written.
    val data = Parcel.obtain()

    // Write the size, or length, of the first Parcel to the new data Parcel.
    data.writeInt(parcel.dataSize())

    // Write some magic number to the data Parcel. This number is taken from
    // the base Bundle class. They store different values for Java or Native
    // which indicates whether the Parcel was written natively or with Java.
    // This property doesn't look accessible, so I just hard-coded the Java
    // value in to this here since we are writing it in Kotlin. But I think
    // it is supposed to mean the internal representation. If this causes
    // issues, then we might have to extract the exact internal value if possible,
    // perhaps using reflection.
    data.writeInt(0x4C444E42)

    // Append the data from the first parcel into this Data Parcel.
    data.appendFrom(parcel, 0, parcel.dataSize())

    // Set the data position back to zero so that it can be read by the internal
    // implementation.
    data.setDataPosition(0)

    // Set the Bundle values to the data Parcel values.
    bundle.readFromParcel(data)

    // Recycler the Parcels.
    parcel.recycle()
    data.recycle()

    // Congrats you have a Bundle with all of the values, return it.
    return bundle
}

/**
 * Retrieves a value of [T] of [kClass] from the provided [bundle] and [flags], or null
 * if the [bundle] is empty or
 */
@ExperimentalSerializationApi
fun <T : Any> AndroidParceler.decodeFromBundle(bundle: Bundle, kClass: KClass<T>, flags: Int = 0): T? {
    // Obtain a new Parcel from the Parcel pool.
    val parcel = Parcel.obtain()

    // Copy the Bundle contents into the Parcel.
    bundle.writeToParcel(parcel, flags)

    // Set the data position back to zero after the write so that we can read it.
    parcel.setDataPosition(0)

    // The first property is the length field. We don't specifically need to use the value
    // but if the value is less than or equal to zero than there are no properties so we
    // return null.
    if (parcel.readInt() <= 0) return null

    // There's some internal "magic" int property that we don't need. We just read it so
    // that we can go to the next property which should be the first property in the returned
    // model.
    parcel.readInt()

    // Create an instance of the class from the Parcel starting at the current data position.
    val item = this.createFromParcel(parcel, kClass)

    // Recycle the Parcel after use.
    parcel.recycle()

    // Congrats we have a model, or null, so return it.
    return item
}
