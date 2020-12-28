package com.chrynan.parcelable.core

interface OutputParcel {

    fun writeBoolean(value: Boolean)

    fun writeByte(value: Byte)

    fun writeShort(value: Short)

    fun writeInt(value: Int)

    fun writeLong(value: Long)

    fun writeFloat(value: Float)

    fun writeDouble(value: Double)

    fun writeChar(value: Char)

    fun writeString(value: String)
}
