package com.chrynan.parcelable.core

import kotlin.test.Test
import kotlin.test.assertEquals

class NumberUtilsTest {

    @Test
    fun longConversionShouldWork() {
        val longValue = 500_000L

        val byteArray = longValue.toByteArray()

        assertEquals(expected = longValue, actual = byteArray.toLongValue())
    }
}
