package com.chrynan.parcelable.core

import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails

private const val ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"

class ByteArrayParcelTest {

    @Test
    fun resetDataPosition_sets_index_and_position_to_zero() {
        val parcel = ByteArrayParcel()

        parcel.writeString("Test")

        parcel.resetDataPosition()

        assertEquals(expected = 0, parcel.dataIndex)
        assertEquals(expected = 0, parcel.dataPosition)
    }

    @Test
    fun boolean_true() {
        val parcel = ByteArrayParcel()

        parcel.writeBoolean(true)

        parcel.resetDataPosition()

        assertEquals(expected = true, actual = parcel.readBoolean())
        assertEquals(expected = 1, actual = parcel.dataItemCount)
    }

    @Test
    fun boolean_false() {
        val parcel = ByteArrayParcel()

        parcel.writeBoolean(false)

        parcel.resetDataPosition()

        assertEquals(expected = false, actual = parcel.readBoolean())
        assertEquals(expected = 1, actual = parcel.dataItemCount)
    }

    @Test
    fun byte_min() {
        val parcel = ByteArrayParcel()

        val value = Byte.MIN_VALUE

        parcel.writeByte(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readByte())
        assertEquals(expected = 1, actual = parcel.dataItemCount)
    }

    @Test
    fun byte_max() {
        val parcel = ByteArrayParcel()

        val value = Byte.MAX_VALUE

        parcel.writeByte(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readByte())
        assertEquals(expected = 1, actual = parcel.dataItemCount)
    }

    @Test
    fun byte_random() {
        val parcel = ByteArrayParcel()

        val value = Random.nextInt().toByte()

        parcel.writeByte(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readByte())
        assertEquals(expected = 1, actual = parcel.dataItemCount)
    }

    @Test
    fun short_min() {
        val parcel = ByteArrayParcel()

        val value = Short.MIN_VALUE

        parcel.writeShort(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readShort())
        assertEquals(expected = 1, actual = parcel.dataItemCount)
    }

    @Test
    fun short_max() {
        val parcel = ByteArrayParcel()

        val value = Short.MAX_VALUE

        parcel.writeShort(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readShort())
        assertEquals(expected = 1, actual = parcel.dataItemCount)
    }

    @Test
    fun short_random() {
        val parcel = ByteArrayParcel()

        val value = Random.nextInt().toShort()

        parcel.writeShort(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readShort())
        assertEquals(expected = 1, actual = parcel.dataItemCount)
    }

    @Test
    fun int_min() {
        val parcel = ByteArrayParcel()

        val value = Int.MIN_VALUE

        parcel.writeInt(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readInt())
        assertEquals(expected = 1, actual = parcel.dataItemCount)
    }

    @Test
    fun int_max() {
        val parcel = ByteArrayParcel()

        val value = Int.MAX_VALUE

        parcel.writeInt(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readInt())
        assertEquals(expected = 1, actual = parcel.dataItemCount)
    }

    @Test
    fun int_random() {
        val parcel = ByteArrayParcel()

        val value = Random.nextInt()

        parcel.writeInt(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readInt())
        assertEquals(expected = 1, actual = parcel.dataItemCount)
    }

    @Test
    fun long_min() {
        val parcel = ByteArrayParcel()

        val value = Long.MIN_VALUE

        parcel.writeLong(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readLong())
        assertEquals(expected = 1, actual = parcel.dataItemCount)
    }

    @Test
    fun long_max() {
        val parcel = ByteArrayParcel()

        val value = Long.MAX_VALUE

        parcel.writeLong(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readLong())
        assertEquals(expected = 1, actual = parcel.dataItemCount)
    }

    @Test
    fun long_random() {
        val parcel = ByteArrayParcel()

        val value = Random.nextLong()

        parcel.writeLong(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readLong())
        assertEquals(expected = 1, actual = parcel.dataItemCount)
    }

    @Test
    fun float_min() {
        val parcel = ByteArrayParcel()

        val value = Float.MIN_VALUE

        parcel.writeFloat(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readFloat())
        assertEquals(expected = 1, actual = parcel.dataItemCount)
    }

    @Test
    fun float_max() {
        val parcel = ByteArrayParcel()

        val value = Float.MAX_VALUE

        parcel.writeFloat(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readFloat())
        assertEquals(expected = 1, actual = parcel.dataItemCount)
    }

    @Test
    fun float_random() {
        val parcel = ByteArrayParcel()

        val value = Random.nextFloat()

        parcel.writeFloat(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readFloat())
        assertEquals(expected = 1, actual = parcel.dataItemCount)
    }

    @Test
    fun double_min() {
        val parcel = ByteArrayParcel()

        val value = Double.MIN_VALUE

        parcel.writeDouble(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readDouble())
        assertEquals(expected = 1, actual = parcel.dataItemCount)
    }

    @Test
    fun double_max() {
        val parcel = ByteArrayParcel()

        val value = Double.MAX_VALUE

        parcel.writeDouble(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readDouble())
        assertEquals(expected = 1, actual = parcel.dataItemCount)
    }

    @Test
    fun double_random() {
        val parcel = ByteArrayParcel()

        val value = Random.nextDouble()

        parcel.writeDouble(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readDouble())
        assertEquals(expected = 1, actual = parcel.dataItemCount)
    }

    @Test
    fun char_random() {
        val parcel = ByteArrayParcel()

        val value = ALPHA_NUMERIC_STRING[Random.nextInt(from = 0, until = ALPHA_NUMERIC_STRING.length)]

        parcel.writeChar(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readChar())
        assertEquals(expected = 1, actual = parcel.dataItemCount)
    }

    @Test
    fun string_random() {
        val parcel = ByteArrayParcel()

        val length = Random.nextInt(from = 0, until = 100)

        val charArray = CharArray(length)

        for (i in 0 until length) {
            charArray[i] = ALPHA_NUMERIC_STRING[Random.nextInt(from = 0, until = ALPHA_NUMERIC_STRING.length)]
        }

        val value = charArray.toString()

        parcel.writeString(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readString())
        assertEquals(expected = 1, actual = parcel.dataItemCount)
    }

    @Test
    fun setting_data_position_less_than_zero_throws_exception() {
        val parcel = ByteArrayParcel()

        parcel.writeInt(100)

        assertFails { parcel.setDataPosition(-1) }
    }

    @Test
    fun setting_data_position_greater_than_data_size_throws_exception() {
        val parcel = ByteArrayParcel()

        parcel.writeInt(10)

        // There's only one item at index zero. Meaning that the dataSize is equal to one times the byte size for that
        // item. Setting the value to greater than that value should fail.
        assertFails { parcel.setDataPosition(5) }
    }

    @Test
    fun recycle_clears_data() {
        val parcel = ByteArrayParcel()

        parcel.writeString("Test")

        assertEquals(expected = 1, actual = parcel.dataItemCount)
        assertEquals(expected = false, actual = parcel.isRecycled)

        parcel.recycle()

        assertEquals(expected = 0, actual = parcel.dataSize)
        assertEquals(expected = 0, actual = parcel.dataItemCount)
        assertEquals(expected = true, actual = parcel.isRecycled)
    }

    @Test
    fun recycled_cannot_be_reused() {
        val parcel = ByteArrayParcel()

        parcel.writeString("Test")

        parcel.resetDataPosition()

        parcel.recycle()

        assertFails { parcel.readString() }
    }

    @Test
    fun byte_array_constructor_works() {
        val parcel = ByteArrayParcel()

        parcel.writeBoolean(false)
        parcel.writeByte(0)
        parcel.writeShort(1)
        parcel.writeInt(2)
        parcel.writeLong(3)
        parcel.writeFloat(4f)
        parcel.writeDouble(5.5)
        parcel.writeChar('a')
        parcel.writeString("Testing123")

        assertEquals(expected = 9, actual = parcel.dataItemCount)

        val bytes = parcel.toByteArray()

        val resultParcel = ByteArrayParcel(bytes)

        assertEquals(expected = 9, actual = resultParcel.dataItemCount)
        assertEquals(expected = false, actual = resultParcel.readBoolean())
        assertEquals(expected = 0, actual = resultParcel.readByte())
        assertEquals(expected = 1, actual = resultParcel.readShort())
        assertEquals(expected = 2, actual = resultParcel.readInt())
        assertEquals(expected = 3, actual = resultParcel.readLong())
        assertEquals(expected = 4f, actual = resultParcel.readFloat())
        assertEquals(expected = 5.5, actual = resultParcel.readDouble())
        assertEquals(expected = 'a', actual = resultParcel.readChar())
        assertEquals(expected = "Testing123", actual = resultParcel.readString())
    }
}
