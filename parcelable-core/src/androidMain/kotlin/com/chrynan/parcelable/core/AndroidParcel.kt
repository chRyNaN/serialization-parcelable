@file:Suppress("unused")

package com.chrynan.parcelable.core

import android.annotation.SuppressLint
import kotlinx.serialization.SerializationException

/**
 * An Android implementation of the [Parcel] interface. This class wraps the provided [android.os.Parcel] [parcel] and
 * delegates the reading and writing to it.
 *
 * Note that this class should not be confused with the [android.os.Parcel]. Instead, this class wraps that class and
 * implements the [Parcel] interface of this library.
 *
 * @see [Parcel]
 * @see [android.os.Parcel]
 */
public class AndroidParcel @PublishedApi internal constructor(private val parcel: android.os.Parcel) :
    Parcel {

    override val dataBufferCapacity: Int
        get() = parcel.dataCapacity()

    override val dataSize: Int
        get() = parcel.dataSize()

    override val dataPosition: Int
        get() = parcel.dataPosition()

    override var isRecycled: Boolean = false
        private set

    override fun readBoolean(): Boolean = try {
        parcel.readInt() == 1
    } catch (exception: Exception) {
        throw SerializationException("Error reading the Boolean value from the Parcel.", exception)
    }

    override fun readByte(): Byte = try {
        parcel.readByte()
    } catch (exception: Exception) {
        throw SerializationException("Error reading the Byte value from the Parcel.", exception)
    }

    override fun readShort(): Short = try {
        parcel.readInt().toShort()
    } catch (exception: Exception) {
        throw SerializationException("Error reading the Short value from the Parcel.", exception)
    }

    override fun readInt(): Int = try {
        parcel.readInt()
    } catch (exception: Exception) {
        throw SerializationException("Error reading the Int value from the Parcel.", exception)
    }

    override fun readLong(): Long = try {
        parcel.readLong()
    } catch (exception: Exception) {
        throw SerializationException("Error reading the Long value from the Parcel.", exception)
    }

    override fun readFloat(): Float = try {
        parcel.readFloat()
    } catch (exception: Exception) {
        throw SerializationException("Error reading the Float value from the Parcel.", exception)
    }

    override fun readDouble(): Double = try {
        parcel.readDouble()
    } catch (exception: Exception) {
        throw SerializationException("Error reading the Double value from the Parcel.", exception)
    }

    override fun readChar(): Char = try {
        parcel.readString()?.get(0)
    } catch (exception: Exception) {
        throw SerializationException("Error reading the Char value from the Parcel.", exception)
    } ?: throw InvalidParcelValueException("Invalid Parcel value. Expected Char but got null.")

    override fun readString(): String =
        try {
            parcel.readString()
        } catch (exception: Exception) {
            throw SerializationException(
                "Error reading the String value from the Parcel.",
                exception
            )
        }
            ?: throw InvalidParcelValueException("Invalid Parcel value. Expected String but got null.")

    override fun writeBoolean(value: Boolean): Unit = try {
        parcel.writeInt(if (value) 1 else 0)
    } catch (exception: Exception) {
        throw SerializationException(
            "Error writing the Boolean value '$value' to the Parcel.",
            exception
        )
    }

    override fun writeByte(value: Byte): Unit = try {
        parcel.writeByte(value)
    } catch (exception: Exception) {
        throw SerializationException(
            "Error writing the Byte value '$value' to the Parcel.",
            exception
        )
    }

    override fun writeShort(value: Short): Unit = try {
        parcel.writeInt(value.toInt())
    } catch (exception: Exception) {
        throw SerializationException(
            "Error writing the Short value '$value' to the Parcel.",
            exception
        )
    }

    override fun writeInt(value: Int): Unit = try {
        parcel.writeInt(value)
    } catch (exception: Exception) {
        throw SerializationException(
            "Error writing the Int value '$value' to the Parcel.",
            exception
        )
    }

    override fun writeLong(value: Long): Unit = try {
        parcel.writeLong(value)
    } catch (exception: Exception) {
        throw SerializationException(
            "Error writing the Long value '$value' to the Parcel.",
            exception
        )
    }

    override fun writeFloat(value: Float): Unit = try {
        parcel.writeFloat(value)
    } catch (exception: Exception) {
        throw SerializationException(
            "Error writing the Float value '$value' to the Parcel.",
            exception
        )
    }

    override fun writeDouble(value: Double): Unit = try {
        parcel.writeDouble(value)
    } catch (exception: Exception) {
        throw SerializationException(
            "Error writing the Double value '$value' to the Parcel.",
            exception
        )
    }

    override fun writeChar(value: Char): Unit = try {
        parcel.writeString(value.toString())
    } catch (exception: Exception) {
        throw SerializationException(
            "Error writing the Char value '$value' to the Parcel.",
            exception
        )
    }

    override fun writeString(value: String): Unit = try {
        parcel.writeString(value)
    } catch (exception: Exception) {
        throw SerializationException(
            "Error writing the String value '$value' to the Parcel.",
            exception
        )
    }

    override fun setDataPosition(position: Int) {
        require(position in 0..dataSize) { "Cannot set data position index less than zero or greater than or equal to dataSize." }
        println("dataSize = $dataSize; dataCapacity = $dataBufferCapacity; dataPosition = $dataPosition")
        parcel.setDataPosition(position)
        parcel.dataAvail()
    }

    override fun recycle() {
        parcel.recycle()
        isRecycled = true
    }

    override fun toByteArray(): ByteArray = parcel.marshall()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AndroidParcel) return false

        if (parcel != other.parcel) return false
        if (dataBufferCapacity != other.dataBufferCapacity) return false
        if (dataSize != other.dataSize) return false
        if (dataPosition != other.dataPosition) return false
        if (isRecycled != other.isRecycled) return false

        return true
    }

    override fun hashCode(): Int {
        var result = parcel.hashCode()

        result = 31 * result + dataBufferCapacity
        result = 31 * result + dataSize
        result = 31 * result + dataPosition
        result = 31 * result + isRecycled.hashCode()

        return result
    }

    override fun toString(): String =
        "AndroidParcel(" +
                "parcel=$parcel, " +
                "dataBufferCapacity=$dataBufferCapacity, " +
                "dataSize=$dataSize, " +
                "dataPosition=$dataPosition, " +
                "isRecycled=$isRecycled)"

    internal fun toAndroidParcel(): android.os.Parcel = parcel
}

public actual fun Parcel(): Parcel = AndroidParcel(android.os.Parcel.obtain())

@SuppressLint("Recycle")
public actual fun Parcel(data: ByteArray): Parcel {
    val androidParcel = android.os.Parcel.obtain()

    androidParcel.unmarshall(data, 0, data.size)

    androidParcel.setDataPosition(0)

    return AndroidParcel(androidParcel)
}

/**
 * Creates a [com.chrynan.parcelable.core.Parcel] instance from the provided [android.os.Parcel] class.
 */
@Suppress("NOTHING_TO_INLINE")
public inline fun Parcel(androidParcel: android.os.Parcel): Parcel =
    AndroidParcel(parcel = androidParcel)

/**
 * Creates a [com.chrynan.parcelable.core.Parcel] instance from this [android.os.Parcel] class.
 */
@Suppress("NOTHING_TO_INLINE")
public inline fun android.os.Parcel.toParcel(): Parcel =
    AndroidParcel(parcel = this)
