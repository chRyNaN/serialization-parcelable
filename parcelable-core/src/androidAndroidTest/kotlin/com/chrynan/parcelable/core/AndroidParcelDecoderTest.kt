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
class AndroidParcelDecoderTest {

    @Test
    fun boolean_true() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val decoder = ParcelDecoder(input = parcel)

        parcel.writeBoolean(true)

        parcel.resetDataPosition()

        assertEquals(expected = true, actual = decoder.decodeBoolean())

        parcel.recycle()
    }

    @Test
    fun boolean_false() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val decoder = ParcelDecoder(input = parcel)

        parcel.writeBoolean(false)

        parcel.resetDataPosition()

        assertEquals(expected = false, actual = decoder.decodeBoolean())

        parcel.recycle()
    }

    @Test
    fun byte_min() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val decoder = ParcelDecoder(input = parcel)

        val value = Byte.MIN_VALUE

        parcel.writeByte(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = decoder.decodeByte())

        parcel.recycle()
    }

    @Test
    fun byte_max() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val decoder = ParcelDecoder(input = parcel)

        val value = Byte.MAX_VALUE

        parcel.writeByte(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = decoder.decodeByte())

        parcel.recycle()
    }

    @Test
    fun byte_random() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val decoder = ParcelDecoder(input = parcel)

        val value = Random.nextInt().toByte()

        parcel.writeByte(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = decoder.decodeByte())

        parcel.recycle()
    }

    @Test
    fun short_min() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val decoder = ParcelDecoder(input = parcel)

        val value = Short.MIN_VALUE

        parcel.writeShort(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = decoder.decodeShort())

        parcel.recycle()
    }

    @Test
    fun short_max() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val decoder = ParcelDecoder(input = parcel)

        val value = Short.MAX_VALUE

        parcel.writeShort(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = decoder.decodeShort())

        parcel.recycle()
    }

    @Test
    fun short_random() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val decoder = ParcelDecoder(input = parcel)

        val value = Random.nextInt().toShort()

        parcel.writeShort(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = decoder.decodeShort())

        parcel.recycle()
    }

    @Test
    fun int_min() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val decoder = ParcelDecoder(input = parcel)

        val value = Int.MIN_VALUE

        parcel.writeInt(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = decoder.decodeInt())

        parcel.recycle()
    }

    @Test
    fun int_max() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val decoder = ParcelDecoder(input = parcel)

        val value = Int.MAX_VALUE

        parcel.writeInt(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = decoder.decodeInt())

        parcel.recycle()
    }

    @Test
    fun int_random() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val decoder = ParcelDecoder(input = parcel)

        val value = Random.nextInt()

        parcel.writeInt(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = decoder.decodeInt())

        parcel.recycle()
    }

    @Test
    fun long_min() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val decoder = ParcelDecoder(input = parcel)

        val value = Long.MIN_VALUE

        parcel.writeLong(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = decoder.decodeLong())

        parcel.recycle()
    }

    @Test
    fun long_max() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val decoder = ParcelDecoder(input = parcel)

        val value = Long.MAX_VALUE

        parcel.writeLong(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = decoder.decodeLong())

        parcel.recycle()
    }

    @Test
    fun long_random() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val decoder = ParcelDecoder(input = parcel)

        val value = Random.nextLong()

        parcel.writeLong(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = decoder.decodeLong())

        parcel.recycle()
    }

    @Test
    fun float_min() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val decoder = ParcelDecoder(input = parcel)

        val value = Float.MIN_VALUE

        parcel.writeFloat(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = decoder.decodeFloat())

        parcel.recycle()
    }

    @Test
    fun float_max() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val decoder = ParcelDecoder(input = parcel)

        val value = Float.MAX_VALUE

        parcel.writeFloat(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = decoder.decodeFloat())

        parcel.recycle()
    }

    @Test
    fun float_random() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val decoder = ParcelDecoder(input = parcel)

        val value = Random.nextFloat()

        parcel.writeFloat(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = decoder.decodeFloat())

        parcel.recycle()
    }

    @Test
    fun double_min() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val decoder = ParcelDecoder(input = parcel)

        val value = Double.MIN_VALUE

        parcel.writeDouble(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = decoder.decodeDouble())

        parcel.recycle()
    }

    @Test
    fun double_max() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val decoder = ParcelDecoder(input = parcel)

        val value = Double.MAX_VALUE

        parcel.writeDouble(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = decoder.decodeDouble())

        parcel.recycle()
    }

    @Test
    fun double_random() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val decoder = ParcelDecoder(input = parcel)

        val value = Random.nextDouble()

        parcel.writeDouble(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = decoder.decodeDouble())

        parcel.recycle()
    }

    @Test
    fun char_random() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val decoder = ParcelDecoder(input = parcel)

        val value = ALPHA_NUMERIC_STRING[Random.nextInt(from = 0, until = ALPHA_NUMERIC_STRING.length)]

        parcel.writeChar(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = decoder.decodeChar())

        parcel.recycle()
    }

    @Test
    fun string_random() {
        val parcel = AndroidParcel(android.os.Parcel.obtain())

        val decoder = ParcelDecoder(input = parcel)

        val length = Random.nextInt(from = 0, until = 100)

        val charArray = CharArray(length)

        for (i in 0 until length) {
            charArray[i] = ALPHA_NUMERIC_STRING[Random.nextInt(from = 0, until = ALPHA_NUMERIC_STRING.length)]
        }

        val value = charArray.toString()

        parcel.writeString(value)

        parcel.resetDataPosition()

        assertEquals(expected = value, actual = decoder.decodeString())

        parcel.recycle()
    }
}
