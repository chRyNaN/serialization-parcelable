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
     *
     * This value represents an amount of bytes.
     */
    val dataBufferCapacity: Int

    /**
     * The total amount of data contained in this parcel.
     *
     * This value represents an amount of bytes.
     */
    val dataSize: Int

    /**
     * The current index position in the data buffer. Should never be more than [dataSize].
     *
     * This value represents an amount of bytes.
     */
    val dataPosition: Int

    /**
     * The remaining amount of data to be read ([dataSize] - [dataPosition]).
     *
     * This value represents an amount of bytes.
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
     * Sets the [dataPosition] to the provided [position] value. This will throw an exception if the provided [position]
     * value is less than zero or exceeds [dataSize].
     *
     * The position value represents an amount of bytes. For instance, an [Int] is a 32-bit (4 byte) integer value,
     * when it is stored in this [Parcel], the [dataSize] will increase by a value of four. To skip over the integer
     * value to the next item, call this function with the current value plus four.
     */
    fun setDataPosition(position: Int)

    /**
     * Puts this parcel object back into the pool, removing its data. This parcel object should not be used after it
     * is recycled. Attempting to write or read from a recycled [Parcel] may cause an exception to be thrown.
     */
    fun recycle()

    /**
     * Obtains a [ByteArray] of the underlying values of this [Parcel]. Note that the returned [ByteArray] data is
     * structured in a way that is meaningful for this implementation, but doesn't guarantee any structure for outside
     * usage or usage between different implementations.
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

/**
 * A convenience function for calling the [Parcel.setDataPosition] with an index value of zero.
 */
inline fun Parcel.resetDataPosition() = setDataPosition(position = 0)
