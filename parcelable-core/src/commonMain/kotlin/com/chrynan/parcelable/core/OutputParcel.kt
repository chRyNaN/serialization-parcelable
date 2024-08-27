package com.chrynan.parcelable.core

/**
 * An interface that provides a way to write to a basic output source. This interface provides the writing
 * functionality of the [Parcel] interface.
 */
public interface OutputParcel {

    /**
     * Writes the [Boolean] [value] to the Parcel at the current data position.
     */
    public fun writeBoolean(value: Boolean)

    /**
     * Writes the [Byte] [value] to the Parcel at the current data position.
     */
    public fun writeByte(value: Byte)

    /**
     * Writes the [Short] [value] to the Parcel at the current data position.
     */
    public fun writeShort(value: Short)

    /**
     * Writes the [Int] [value] to the Parcel at the current data position.
     */
    public fun writeInt(value: Int)

    /**
     * Writes the [Long] [value] to the Parcel at the current data position.
     */
    public fun writeLong(value: Long)

    /**
     * Writes the [Float] [value] to the Parcel at the current data position.
     */
    public fun writeFloat(value: Float)

    /**
     * Writes the [Double] [value] to the Parcel at the current data position.
     */
    public fun writeDouble(value: Double)

    /**
     * Writes the [Char] [value] to the Parcel at the current data position.
     */
    public fun writeChar(value: Char)

    /**
     * Writes the [String] [value] to the Parcel at the current data position.
     */
    public fun writeString(value: String)
}
