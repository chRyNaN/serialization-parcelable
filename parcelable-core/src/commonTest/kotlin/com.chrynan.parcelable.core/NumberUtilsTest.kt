package com.chrynan.parcelable.core

import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertEquals

class NumberUtilsTest {

    @Test
    fun int_conversion_min() {
        val intValue = Int.MIN_VALUE

        val byteArray = intValue.toByteArray()

        assertEquals(expected = intValue, actual = byteArray.toInt())
    }

    @Test
    fun int_conversion_max() {
        val intValue = Int.MAX_VALUE

        val byteArray = intValue.toByteArray()

        assertEquals(expected = intValue, actual = byteArray.toInt())
    }

    @Test
    fun int_conversion_random_number() {
        val intValue = Random.nextInt()

        val byteArray = intValue.toByteArray()

        assertEquals(expected = intValue, actual = byteArray.toInt())
    }

    @Test
    fun long_conversion_min() {
        val longValue = Long.MIN_VALUE

        val byteArray = longValue.toByteArray()

        assertEquals(expected = longValue, actual = byteArray.toLong())
    }

    @Test
    fun long_conversion_max() {
        val longValue = Long.MAX_VALUE

        val byteArray = longValue.toByteArray()

        assertEquals(expected = longValue, actual = byteArray.toLong())
    }

    @Test
    fun long_conversion_random_number() {
        val longValue = Random.nextLong()

        val byteArray = longValue.toByteArray()

        assertEquals(expected = longValue, actual = byteArray.toLong())
    }
}
