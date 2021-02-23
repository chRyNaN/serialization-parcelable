package com.chrynan.parcelable.core

/**
 * An interface that provides a way to write to a basic output source. This interface provides the writing
 * functionality of the [Parcel] interface.
 */
interface OutputParcel {

    /**
     * Writes the [Boolean] [value] to the Parcel at the current data position.
     */
    fun writeBoolean(value: Boolean)

    /**
     * Writes the [Byte] [value] to the Parcel at the current data position.
     */
    fun writeByte(value: Byte)

    /**
     * Writes the [Short] [value] to the Parcel at the current data position.
     */
    fun writeShort(value: Short)

    /**
     * Writes the [Int] [value] to the Parcel at the current data position.
     */
    fun writeInt(value: Int)

    /**
     * Writes the [Long] [value] to the Parcel at the current data position.
     */
    fun writeLong(value: Long)

    /**
     * Writes the [Float] [value] to the Parcel at the current data position.
     */
    fun writeFloat(value: Float)

    /**
     * Writes the [Double] [value] to the Parcel at the current data position.
     */
    fun writeDouble(value: Double)

    /**
     * Writes the [Char] [value] to the Parcel at the current data position.
     */
    fun writeChar(value: Char)

    /**
     * Writes the [String] [value] to the Parcel at the current data position.
     */
    fun writeString(value: String)
}
