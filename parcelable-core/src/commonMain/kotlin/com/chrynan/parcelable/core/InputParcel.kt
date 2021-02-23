package com.chrynan.parcelable.core

/**
 * An interface that provides a way to read from a basic input source. This interface provides the reading
 * functionality of the [Parcel] interface.
 */
interface InputParcel {

    /**
     * Retrieves a [Boolean] from the Parcel at the current data position.
     */
    fun readBoolean(): Boolean

    /**
     * Retrieves a [Byte] from the Parcel at the current data position.
     */
    fun readByte(): Byte

    /**
     * Retrieves a [Short] from the Parcel at the current data position.
     */
    fun readShort(): Short

    /**
     * Retrieves a [Int] from the Parcel at the current data position.
     */
    fun readInt(): Int

    /**
     * Retrieves a [Long] from the Parcel at the current data position.
     */
    fun readLong(): Long

    /**
     * Retrieves a [Float] from the Parcel at the current data position.
     */
    fun readFloat(): Float

    /**
     * Retrieves a [Double] from the Parcel at the current data position.
     */
    fun readDouble(): Double

    /**
     * Retrieves a [Char] from the Parcel at the current data position.
     */
    fun readChar(): Char

    /**
     * Retrieves a [String] from the Parcel at the current data position.
     */
    fun readString(): String
}
