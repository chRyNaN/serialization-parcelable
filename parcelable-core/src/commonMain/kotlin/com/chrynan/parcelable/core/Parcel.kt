@file:Suppress("unused")

package com.chrynan.parcelable.core

/**
 * An interface representing a component that has the ability for primitive types to be written to and read from it.
 *
 * Note that this is not meant to represent a persistent storage component. Instead, [Parcel]s are short-lived and
 * meant to transfer data between different components and processes.
 *
 * Note that this is based off of the Android Parcel component.
 *
 * @see [Android Parcel](https://developer.android.com/reference/android/os/Parcel)
 */
interface Parcel : InputParcel,
    OutputParcel {

    /**
     * The total amount of space available in this parcel. This should always be greater than or equal to [dataSize].
     * There may be more space available ([dataBufferCapacity]) in the underlying data buffer than there is data
     * available ([dataSize]). The difference between [dataBufferCapacity] and [dataSize] indicates the amount of room
     * remaining in the underlying data buffer until more space needs to be allocated.
     */
    val dataBufferCapacity: Int

    /**
     * The total amount of data contained in this parcel.
     */
    val dataSize: Int

    /**
     * The current index position in the data buffer. Should never be more than [dataSize].
     */
    val dataPosition: Int

    /**
     * The remaining amount of data to be read ([dataSize] - [dataPosition]).
     */
    val dataRemaining: Int
        get() = dataSize - dataPosition

    /**
     * Determines whether this [Parcel]s [recycle] function has been called already. A parcel object should not be used
     * after it is recycled.
     *
     * Note that this property is unstable between processes.
     */
    val isRecycled: Boolean

    /**
     * Sets the [dataPosition] to the provided [index] value. This will throw an exception if the provided [index]
     * value is less than zero or exceeds the last index ([dataSize] minus one).
     */
    fun setDataPosition(index: Int)

    /**
     * Puts this parcel object back into the pool, removing its data. This parcel object should not be used after it
     * is recycled.
     */
    fun recycle()

    /**
     * Obtains a [ByteArray] of the underlying values of this [Parcel].
     */
    fun toByteArray(): ByteArray
}

/**
 * Creates an empty [Parcel] instance.
 */
expect fun Parcel(): Parcel

/**
 * Creates a [Parcel] instance containing the provided [data].
 *
 * Note that data coming from different target platforms, or different [Parcel] implementations, is not inter-operable.
 */
expect fun Parcel(data: ByteArray): Parcel
