package com.chrynan.parcelable.core

/**
 * Converts this [Int] value into a [ByteArray] representation.
 *
 * **Note:** This function is not safe for use outside this library as it doesn't expose, make guarantees about, or
 * provide a way to change the endianness ordering.
 */
internal fun Int.toByteArray(): ByteArray =
    byteArrayOf(
        (this shr 24 and 0xff).toByte(),
        (this shr 16 and 0xff).toByte(),
        (this shr 8 and 0xff).toByte(),
        (this shr 0 and 0xff).toByte()
    )

/**
 * Converts this [ByteArray] representation of an [Int] value into an [Int] value.
 *
 * **Note:** This function is not safe for use outside this library as it doesn't expose, make guarantees about, or
 * provide a way to change the endianness ordering.
 */
internal fun ByteArray.toInt(): Int =
    0xff and this[0].toInt() shl 24 or
            (0xff and this[1].toInt() shl 16) or
            (0xff and this[2].toInt() shl 8) or
            (0xff and this[3].toInt() shl 0)

/**
 * Converts this [Long] value into a [ByteArray] representation.
 *
 * **Note:** This function is not safe for use outside this library as it doesn't expose, make guarantees about, or
 * provide a way to change the endianness ordering.
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
 *
 * **Note:** This function is not safe for use outside this library as it doesn't expose, make guarantees about, or
 * provide a way to change the endianness ordering.
 */
internal fun ByteArray.toLong(): Long {
    require(this.size == Long.SIZE_BYTES) { "ByteArray must have a size of 8 to convert to a Long." }

    var result = 0L

    for (i in 0 until Long.SIZE_BYTES) {
        result = result shl Byte.SIZE_BITS
        result = (result or (this[i].toLong() and 0xFF))
    }

    return result
}
