package com.chrynan.parcelable.core

import kotlin.test.Test
import kotlin.test.assertEquals

class ByteArrayParcelTest {

    @Test
    fun boolean_true() {
        val parcel = ByteArrayParcel()

        parcel.writeBoolean(true)

        parcel.setDataPosition(0)

        assertEquals(expected = true, actual = parcel.readBoolean())
    }

    @Test
    fun boolean_false() {
        val parcel = ByteArrayParcel()

        parcel.writeBoolean(false)

        parcel.setDataPosition(0)

        assertEquals(expected = false, actual = parcel.readBoolean())
    }
}
