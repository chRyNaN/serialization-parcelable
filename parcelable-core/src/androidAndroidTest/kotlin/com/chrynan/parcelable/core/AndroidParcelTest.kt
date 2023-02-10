package com.chrynan.parcelable.core

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.MediumTest
import org.junit.Test
import org.junit.runner.RunWith
import kotlin.random.Random
import kotlin.test.assertEquals
import kotlin.test.assertFails

private const val ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"

@RunWith(AndroidJUnit4::class)
@MediumTest
class AndroidParcelTest {

    @Test
    fun resetDataPosition_sets_position_to_zero() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        parcel.writeString("Test")

        parcel.resetDataPosition()

        assertEquals(expected = 0, parcel.dataPosition)

        parcel.recycle()
    }

    @Test
    fun boolean_true() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        parcel.writeBoolean(true)

        parcel.resetDataPosition()

        assertEquals(expected = true, actual = parcel.readBoolean())

        parcel.recycle()
    }

    @Test
    fun boolean_false() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        parcel.writeBoolean(false)

        parcel.resetDataPosition()

        assertEquals(expected = false, actual = parcel.readBoolean())

        parcel.recycle()
    }

    @Test
    fun byte_min() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val value = Byte.MIN_VALUE

        parcel.writeByte(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readByte())

        parcel.recycle()
    }

    @Test
    fun byte_max() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val value = Byte.MAX_VALUE

        parcel.writeByte(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readByte())

        parcel.recycle()
    }

    @Test
    fun byte_random() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val value = Random.nextInt().toByte()

        parcel.writeByte(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readByte())

        parcel.recycle()
    }

    @Test
    fun short_min() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val value = Short.MIN_VALUE

        parcel.writeShort(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readShort())

        parcel.recycle()
    }

    @Test
    fun short_max() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val value = Short.MAX_VALUE

        parcel.writeShort(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readShort())

        parcel.recycle()
    }

    @Test
    fun short_random() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val value = Random.nextInt().toShort()

        parcel.writeShort(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readShort())

        parcel.recycle()
    }

    @Test
    fun int_min() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val value = Int.MIN_VALUE

        parcel.writeInt(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readInt())

        parcel.recycle()
    }

    @Test
    fun int_max() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val value = Int.MAX_VALUE

        parcel.writeInt(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readInt())

        parcel.recycle()
    }

    @Test
    fun int_random() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val value = Random.nextInt()

        parcel.writeInt(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readInt())

        parcel.recycle()
    }

    @Test
    fun long_min() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val value = Long.MIN_VALUE

        parcel.writeLong(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readLong())

        parcel.recycle()
    }

    @Test
    fun long_max() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val value = Long.MAX_VALUE

        parcel.writeLong(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readLong())

        parcel.recycle()
    }

    @Test
    fun long_random() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val value = Random.nextLong()

        parcel.writeLong(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readLong())

        parcel.recycle()
    }

    @Test
    fun float_min() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val value = Float.MIN_VALUE

        parcel.writeFloat(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readFloat())

        parcel.recycle()
    }

    @Test
    fun float_max() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val value = Float.MAX_VALUE

        parcel.writeFloat(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readFloat())

        parcel.recycle()
    }

    @Test
    fun float_random() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val value = Random.nextFloat()

        parcel.writeFloat(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readFloat())

        parcel.recycle()
    }

    @Test
    fun double_min() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val value = Double.MIN_VALUE

        parcel.writeDouble(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readDouble())

        parcel.recycle()
    }

    @Test
    fun double_max() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val value = Double.MAX_VALUE

        parcel.writeDouble(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readDouble())

        parcel.recycle()
    }

    @Test
    fun double_random() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val value = Random.nextDouble()

        parcel.writeDouble(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readDouble())

        parcel.recycle()
    }

    @Test
    fun char_random() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val value = ALPHA_NUMERIC_STRING[Random.nextInt(from = 0, until = ALPHA_NUMERIC_STRING.length)]

        parcel.writeChar(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readChar())

        parcel.recycle()
    }

    @Test
    fun string_random() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val length = Random.nextInt(from = 0, until = 100)

        val charArray = CharArray(length)

        for (i in 0 until length) {
            charArray[i] = ALPHA_NUMERIC_STRING[Random.nextInt(from = 0, until = ALPHA_NUMERIC_STRING.length)]
        }

        val value = charArray.toString()

        parcel.writeString(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readString())

        parcel.recycle()
    }

    @Test
    fun setting_data_position_less_than_zero_throws_exception() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        parcel.writeString("Test")

        // There's only one item at index zero. Meaning that the dataSize is equal to 1 (which is the current index).
        // Setting the value to 2 or more should fail.
        assertFails { parcel.setDataPosition(-1) }

        parcel.recycle()
    }

    @Test
    fun setting_data_position_greater_than_data_size_throws_exception() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        parcel.writeInt(0)

        // There's only one item at index zero. Meaning that the dataSize is equal to 1 (which is the current index).
        // Setting the value to 2 or more should fail.
        assertFails { parcel.setDataPosition(5) }

        parcel.recycle()
    }

    @Test
    fun recycled_cannot_be_reused() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        parcel.writeString("Test")

        parcel.resetDataPosition()

        parcel.recycle()

        assertFails { parcel.readString() }
    }

    @Test
    fun byte_array_constructor_works() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        parcel.writeBoolean(false)
        parcel.writeByte(0)
        parcel.writeShort(1)
        parcel.writeInt(2)
        parcel.writeLong(3)
        parcel.writeFloat(4f)
        parcel.writeDouble(5.5)
        parcel.writeChar('a')
        parcel.writeString("Testing123")

        val bytes = parcel.toByteArray()

        val resultParcel = Parcel(bytes)

        assertEquals(expected = false, actual = resultParcel.readBoolean())
        assertEquals(expected = 0, actual = resultParcel.readByte())
        assertEquals(expected = 1, actual = resultParcel.readShort())
        assertEquals(expected = 2, actual = resultParcel.readInt())
        assertEquals(expected = 3, actual = resultParcel.readLong())
        assertEquals(expected = 4f, actual = resultParcel.readFloat())
        assertEquals(expected = 5.5, actual = resultParcel.readDouble())
        assertEquals(expected = 'a', actual = resultParcel.readChar())
        assertEquals(expected = "Testing123", actual = resultParcel.readString())

        parcel.recycle()
        resultParcel.recycle()
    }
}
