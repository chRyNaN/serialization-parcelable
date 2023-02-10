package com.chrynan.parcelable.core

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.MediumTest
import kotlinx.serialization.ExperimentalSerializationApi
import org.junit.Test
import org.junit.runner.RunWith
import kotlin.random.Random
import kotlin.test.assertEquals

private const val ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"

@RunWith(AndroidJUnit4::class)
@MediumTest
@OptIn(ExperimentalSerializationApi::class)
class AndroidParcelEncoderTest {

    @Test
    fun boolean_true() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val encoder = ParcelEncoder(output = parcel)

        encoder.encodeBoolean(true)

        parcel.resetDataPosition()

        assertEquals(expected = true, actual = parcel.readBoolean())

        parcel.recycle()
    }

    @Test
    fun boolean_false() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val encoder = ParcelEncoder(output = parcel)

        encoder.encodeBoolean(false)

        parcel.resetDataPosition()

        assertEquals(expected = false, actual = parcel.readBoolean())

        parcel.recycle()
    }

    @Test
    fun byte_min() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val encoder = ParcelEncoder(output = parcel)

        val value = Byte.MIN_VALUE

        encoder.encodeByte(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readByte())

        parcel.recycle()
    }

    @Test
    fun byte_max() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val encoder = ParcelEncoder(output = parcel)

        val value = Byte.MAX_VALUE

        encoder.encodeByte(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readByte())

        parcel.recycle()
    }

    @Test
    fun byte_random() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val encoder = ParcelEncoder(output = parcel)

        val value = Random.nextInt().toByte()

        encoder.encodeByte(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readByte())

        parcel.recycle()
    }

    @Test
    fun short_min() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val encoder = ParcelEncoder(output = parcel)

        val value = Short.MIN_VALUE

        encoder.encodeShort(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readShort())

        parcel.recycle()
    }

    @Test
    fun short_max() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val encoder = ParcelEncoder(output = parcel)

        val value = Short.MAX_VALUE

        encoder.encodeShort(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readShort())

        parcel.recycle()
    }

    @Test
    fun short_random() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val encoder = ParcelEncoder(output = parcel)

        val value = Random.nextInt().toShort()

        encoder.encodeShort(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readShort())

        parcel.recycle()
    }

    @Test
    fun int_min() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val encoder = ParcelEncoder(output = parcel)

        val value = Int.MIN_VALUE

        encoder.encodeInt(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readInt())

        parcel.recycle()
    }

    @Test
    fun int_max() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val encoder = ParcelEncoder(output = parcel)

        val value = Int.MAX_VALUE

        encoder.encodeInt(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readInt())

        parcel.recycle()
    }

    @Test
    fun int_random() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val encoder = ParcelEncoder(output = parcel)

        val value = Random.nextInt()

        encoder.encodeInt(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readInt())

        parcel.recycle()
    }

    @Test
    fun long_min() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val encoder = ParcelEncoder(output = parcel)

        val value = Long.MIN_VALUE

        encoder.encodeLong(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readLong())

        parcel.recycle()
    }

    @Test
    fun long_max() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val encoder = ParcelEncoder(output = parcel)

        val value = Long.MAX_VALUE

        encoder.encodeLong(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readLong())

        parcel.recycle()
    }

    @Test
    fun long_random() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val encoder = ParcelEncoder(output = parcel)

        val value = Random.nextLong()

        encoder.encodeLong(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readLong())

        parcel.recycle()
    }

    @Test
    fun float_min() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val encoder = ParcelEncoder(output = parcel)

        val value = Float.MIN_VALUE

        encoder.encodeFloat(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readFloat())

        parcel.recycle()
    }

    @Test
    fun float_max() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val encoder = ParcelEncoder(output = parcel)

        val value = Float.MAX_VALUE

        encoder.encodeFloat(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readFloat())

        parcel.recycle()
    }

    @Test
    fun float_random() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val encoder = ParcelEncoder(output = parcel)

        val value = Random.nextFloat()

        encoder.encodeFloat(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readFloat())

        parcel.recycle()
    }

    @Test
    fun double_min() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val encoder = ParcelEncoder(output = parcel)

        val value = Double.MIN_VALUE

        encoder.encodeDouble(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readDouble())

        parcel.recycle()
    }

    @Test
    fun double_max() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val encoder = ParcelEncoder(output = parcel)

        val value = Double.MAX_VALUE

        encoder.encodeDouble(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readDouble())

        parcel.recycle()
    }

    @Test
    fun double_random() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val encoder = ParcelEncoder(output = parcel)

        val value = Random.nextDouble()

        encoder.encodeDouble(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readDouble())

        parcel.recycle()
    }

    @Test
    fun char_random() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val encoder = ParcelEncoder(output = parcel)

        val value = ALPHA_NUMERIC_STRING[Random.nextInt(from = 0, until = ALPHA_NUMERIC_STRING.length)]

        encoder.encodeChar(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readChar())

        parcel.recycle()
    }

    @Test
    fun string_random() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val encoder = ParcelEncoder(output = parcel)

        val length = Random.nextInt(from = 0, until = 100)

        val charArray = CharArray(length)

        for (i in 0 until length) {
            charArray[i] = ALPHA_NUMERIC_STRING[Random.nextInt(from = 0, until = ALPHA_NUMERIC_STRING.length)]
        }

        val value = charArray.toString()

        encoder.encodeString(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = parcel.readString())

        parcel.recycle()
    }
}
