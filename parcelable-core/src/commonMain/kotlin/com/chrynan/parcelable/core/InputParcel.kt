package com.chrynan.parcelable.core

interface InputParcel {

    /**
     * Retrieves a [Boolean] from the parcel at the current [dataPosition].
     */
    fun readBoolean(): Boolean

    fun readByte(): Byte

    fun readShort(): Short

    fun readInt(): Int

    fun readLong(): Long

    fun readFloat(): Float

    fun readDouble(): Double

    fun readChar(): Char

    fun readString(): String
}
