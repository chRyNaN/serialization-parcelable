package com.chrynan.parcelable.core

/**
 * A [Parcel] implementation that stores its underlying data into a [ByteArray].
 *
 * Note that the data stored in the underlying [ByteArray] is not inter-changeable with other [Parcel] implementations,
 * or different versions of this class.
 *
 * Note that the underlying [ByteArray] data is structured in a way that is meaningful for this class, but doesn't
 * guarantee any structure for outside usage.
 */
public class ByteArrayParcel internal constructor(initial: ByteArray = byteArrayOf()) : Parcel {

    override val dataBufferCapacity: Int
        get() = data.sumOf { it.size }

    override val dataSize: Int
        get() = data.sumOf { it.size }

    override val dataPosition: Int
        get() = data.subList(fromIndex = 0, toIndex = dataIndex)
            .sumOf { it.size }

    override var isRecycled: Boolean = false
        private set

    /**
     * Retrieves the amount of items stored within this data structure. This is different from [dataSize] as that
     * represents the total amount of bytes stored and this [dataItemCount] represents the total amount of items
     * stored. For instance, if there are two [Int] values stored, then this [dataItemCount] will return a value of
     * two, whereas the [dataSize] will return a value of eight (each [Int] has four bytes).
     */
    @Suppress("MemberVisibilityCanBePrivate", "unused")
    public val dataItemCount: Int
        get() = data.size

    /**
     * Represents the current item index within the data structure. This is different from [dataPosition] as that
     * represents the byte value position, whereas this represents the item position. For instance, a [ByteArrayParcel]
     * containing two [Int] values will have a [dataSize] of eight (four bytes for each [Int]). If the [dataIndex]
     * equals one, the [dataPosition] should equal four.
     */
    @Suppress("MemberVisibilityCanBePrivate")
    public var dataIndex: Int = 0

    private val data = mutableListOf<ByteArray>()

    init {
        setDataFromByteArray(value = initial)
    }

    override fun readBoolean(): Boolean {
        check(!isRecycled) { "ByteArrayParcel has been recycled and cannot be reused." }

        val result = data[dataIndex][0].toBooleanValue()

        dataIndex++

        return result
    }

    override fun readByte(): Byte {
        check(!isRecycled) { "ByteArrayParcel has been recycled and cannot be reused." }

        val result = data[dataIndex][0]

        dataIndex++

        return result
    }

    override fun readShort(): Short {
        check(!isRecycled) { "ByteArrayParcel has been recycled and cannot be reused." }

        val result = data[dataIndex].toShortValue()

        dataIndex++

        return result
    }

    override fun readInt(): Int {
        check(!isRecycled) { "ByteArrayParcel has been recycled and cannot be reused." }

        val result = data[dataIndex].toInt()

        dataIndex++

        return result
    }

    override fun readLong(): Long {
        check(!isRecycled) { "ByteArrayParcel has been recycled and cannot be reused." }

        val result = data[dataIndex].toLong()

        dataIndex++

        return result
    }

    override fun readFloat(): Float {
        check(!isRecycled) { "ByteArrayParcel has been recycled and cannot be reused." }

        val result = data[dataIndex].toFloatValue()

        dataIndex++

        return result
    }

    override fun readDouble(): Double {
        check(!isRecycled) { "ByteArrayParcel has been recycled and cannot be reused." }

        val result = data[dataIndex].toDoubleValue()

        dataIndex++

        return result
    }

    override fun readChar(): Char {
        check(!isRecycled) { "ByteArrayParcel has been recycled and cannot be reused." }

        val result = data[dataIndex].toCharValue()

        dataIndex++

        return result
    }

    override fun readString(): String {
        check(!isRecycled) { "ByteArrayParcel has been recycled and cannot be reused." }

        val result = data[dataIndex].toStringValue()

        dataIndex++

        return result
    }

    override fun writeBoolean(value: Boolean) {
        check(!isRecycled) { "ByteArrayParcel has been recycled and cannot be reused." }

        data.add(dataIndex, byteArrayOf(value.toByte()))

        dataIndex++
    }

    override fun writeByte(value: Byte) {
        check(!isRecycled) { "ByteArrayParcel has been recycled and cannot be reused." }

        data.add(dataIndex, byteArrayOf(value))

        dataIndex++
    }

    override fun writeShort(value: Short) {
        check(!isRecycled) { "ByteArrayParcel has been recycled and cannot be reused." }

        data.add(dataIndex, value.toByteArray())

        dataIndex++
    }

    override fun writeInt(value: Int) {
        check(!isRecycled) { "ByteArrayParcel has been recycled and cannot be reused." }

        data.add(dataIndex, value.toByteArray())

        dataIndex++
    }

    override fun writeLong(value: Long) {
        check(!isRecycled) { "ByteArrayParcel has been recycled and cannot be reused." }

        data.add(dataIndex, value.toByteArray())

        dataIndex++
    }

    override fun writeFloat(value: Float) {
        check(!isRecycled) { "ByteArrayParcel has been recycled and cannot be reused." }

        data.add(dataIndex, value.toByteArray())

        dataIndex++
    }

    override fun writeDouble(value: Double) {
        check(!isRecycled) { "ByteArrayParcel has been recycled and cannot be reused." }

        data.add(dataIndex, value.toByteArray())

        dataIndex++
    }

    override fun writeChar(value: Char) {
        check(!isRecycled) { "ByteArrayParcel has been recycled and cannot be reused." }

        data.add(dataIndex, value.toByteArray())

        dataIndex++
    }

    override fun writeString(value: String) {
        check(!isRecycled) { "ByteArrayParcel has been recycled and cannot be reused." }

        data.add(dataIndex, value.toByteArray())

        dataIndex++
    }

    override fun recycle() {
        isRecycled = true

        data.clear()
        dataIndex = 0
    }

    override fun toByteArray(): ByteArray {
        check(!isRecycled) { "ByteArrayParcel has been recycled and cannot be reused." }

        val byteList = mutableListOf<Byte>()

        data.size.toByteArray().forEach {
            byteList.add(it)
        }

        data.forEach { dataItemArray ->
            dataItemArray.size.toByteArray().forEach {
                byteList.add(it)
            }

            dataItemArray.forEach {
                byteList.add(it)
            }
        }

        return byteList.toByteArray()
    }

    override fun setDataPosition(position: Int) {
        check(!isRecycled) { "ByteArrayParcel has been recycled and cannot be reused." }
        require(position in 0..dataSize) { "Cannot set data position index less than zero or greater than dataSize." }

        var index = 0
        var byteCount = 0

        for (bytes in data) {
            if (byteCount == position) {
                break
            } else if (byteCount > position) {
                error("Can only set dataPosition in ByteArrayParcel to fixed positions based off of the item index.")
            } else {
                byteCount += bytes.size
                index++
            }
        }

        dataIndex = index
    }

    private fun setDataFromByteArray(value: ByteArray) {
        data.clear()
        dataIndex = 0

        if (value.size >= 4) {
            val dataListSize = value.copyOfRange(fromIndex = 0, toIndex = 4).toInt()

            if (dataListSize > 0) {
                var i = 4

                while (i < value.size) {
                    val subListSize = value.copyOfRange(fromIndex = i, toIndex = i + 4).toInt()

                    i += 4

                    if (subListSize > 0) {
                        data.add(value.copyOfRange(fromIndex = i, toIndex = i + subListSize))

                        i += subListSize
                    } else {
                        data.add(byteArrayOf())
                    }
                }
            }
        }
    }

    private fun Boolean.toByte(): Byte = if (this) TRUE else FALSE

    private fun Short.toByteArray(): ByteArray = toInt().toByteArray()

    private fun Float.toByteArray(): ByteArray = toRawBits().toByteArray()

    private fun Double.toByteArray(): ByteArray = toBits().toByteArray()

    @Suppress("DEPRECATION")
    private fun Char.toByteArray(): ByteArray = toInt().toByteArray()

    private fun String.toByteArray(): ByteArray = encodeToByteArray()

    private fun Byte.toBooleanValue(): Boolean = this == TRUE

    private fun ByteArray.toShortValue(): Short = toInt().toShort()

    private fun ByteArray.toFloatValue(): Float = Float.fromBits(toInt())

    private fun ByteArray.toDoubleValue(): Double = Double.fromBits(toLong())

    private fun ByteArray.toCharValue(): Char = toInt().toChar()

    private fun ByteArray.toStringValue(): String = decodeToString()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ByteArrayParcel) return false

        if (dataBufferCapacity != other.dataBufferCapacity) return false
        if (dataSize != other.dataSize) return false
        if (dataPosition != other.dataPosition) return false
        if (isRecycled != other.isRecycled) return false
        if (data != other.data) return false

        return true
    }

    override fun hashCode(): Int {
        var result = dataBufferCapacity

        result = 31 * result + dataSize
        result = 31 * result + dataPosition
        result = 31 * result + isRecycled.hashCode()
        result = 31 * result + data.hashCode()

        return result
    }

    override fun toString(): String =
        "ByteArrayParcel(" +
                "dataBufferCapacity=$dataBufferCapacity, " +
                "dataSize=$dataSize, " +
                "dataPosition=$dataPosition, " +
                "isRecycled=$isRecycled, " +
                "data=$data)"

    public companion object {

        private const val FALSE: Byte = 0
        private const val TRUE: Byte = 1
    }
}
