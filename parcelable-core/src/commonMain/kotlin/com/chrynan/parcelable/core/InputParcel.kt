package com.chrynan.parcelable.core

/**
 * An interface that provides a way to read from a basic input source. This interface provides the reading
 * functionality of the [Parcel] interface.
 */
public interface InputParcel {

    /**
     * Retrieves a [Boolean] from the Parcel at the current data position.
     */
    public fun readBoolean(): Boolean

    /**
     * Retrieves a [Byte] from the Parcel at the current data position.
     */
    public fun readByte(): Byte

    /**
     * Retrieves a [Short] from the Parcel at the current data position.
     */
    public fun readShort(): Short

    /**
     * Retrieves a [Int] from the Parcel at the current data position.
     */
    public fun readInt(): Int

    /**
     * Retrieves a [Long] from the Parcel at the current data position.
     */
    public fun readLong(): Long

    /**
     * Retrieves a [Float] from the Parcel at the current data position.
     */
    public fun readFloat(): Float

    /**
     * Retrieves a [Double] from the Parcel at the current data position.
     */
    public fun readDouble(): Double

    /**
     * Retrieves a [Char] from the Parcel at the current data position.
     */
    public fun readChar(): Char

    /**
     * Retrieves a [String] from the Parcel at the current data position.
     */
    public fun readString(): String
}
