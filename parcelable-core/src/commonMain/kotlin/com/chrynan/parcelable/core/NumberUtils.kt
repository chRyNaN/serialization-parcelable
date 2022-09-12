package com.chrynan.parcelable.core

import kotlin.experimental.and

/**
 * Converts this [Int] value into a [ByteArray] representation.
 */
internal fun Int.toByteArray(): ByteArray {
    val result = ByteArray(Int.SIZE_BYTES)
    var value = this

    for (i in Int.SIZE_BYTES - 1 downTo 0) {
        result[i] = (value and 0xFF).toByte()
        value = value shr Byte.SIZE_BITS
    }

    return result
}

/**
 * Converts this [Long] value into a [ByteArray] representation.
 */
internal fun Long.toByteArray(): ByteArray {
    val result = ByteArray(Long.SIZE_BYTES)
    var value = this

    for (i in 0 until Long.SIZE_BYTES) {
        result[Long.SIZE_BYTES - i - 1] = (value and 0xFF).toByte()
        value = value ushr Byte.SIZE_BITS
    }

    return result
}

/**
 * Converts this [ByteArray] representation of a [Long] value into a [Long] value.
 */
internal fun ByteArray.toLongValue(): Long {
    require(this.size == Long.SIZE_BYTES) { "ByteArray must have a size of 8 to convert to a Long." }

    var result = 0L

    for (i in 0 until Long.SIZE_BYTES) {
        result = result shl Byte.SIZE_BITS
        result = (result or (this[i].toLong() and 0xFF))
    }

    return result
}

/**
 * Converts this [ByteArray] representation of an [Int] value into an [Int] value.
 *
 * **Note:** This function is not safe for use outside this library as it doesn't expose, make guarantees about, or
 * provide a way to change the endianness ordering.
 */
internal fun ByteArray.toIntValue(): Int {
    var result = 0

    for (i in 0 until Int.SIZE_BYTES) {
        result = result shl Byte.SIZE_BITS
        result = (result or (this[i] and 0xFF.toByte()).toInt())
    }

    return result
}
