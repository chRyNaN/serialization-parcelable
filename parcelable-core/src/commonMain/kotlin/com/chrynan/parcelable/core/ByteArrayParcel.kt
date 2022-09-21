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
class ByteArrayParcel internal constructor(initial: ByteArray = byteArrayOf()) : Parcel {

    override val dataBufferCapacity: Int
        get() = data.size

    override val dataSize: Int
        get() = data.size

    override var dataPosition: Int = 0
        private set

    override var isRecycled: Boolean = false
        private set

    private val data = mutableListOf<ByteArray>()

    init {
        setDataFromByteArray(value = initial)
    }

    override fun readBoolean(): Boolean {
        val result = data[dataPosition][0].toBooleanValue()

        dataPosition++

        return result
    }

    override fun readByte(): Byte {
        val result = data[dataPosition][0]

        dataPosition++

        return result
    }

    override fun readShort(): Short {
        val result = data[dataPosition].toShortValue()

        dataPosition++

        return result
    }

    override fun readInt(): Int {
        val result = data[dataPosition].toIntValue()

        dataPosition++

        return result
    }

    override fun readLong(): Long {
        val result = data[dataPosition].toLongValue()

        dataPosition++

        return result
    }

    override fun readFloat(): Float {
        val result = data[dataPosition].toFloatValue()

        dataPosition++

        return result
    }

    override fun readDouble(): Double {
        val result = data[dataPosition].toDoubleValue()

        dataPosition++

        return result
    }

    override fun readChar(): Char {
        val result = data[dataPosition].toCharValue()

        dataPosition++

        return result
    }

    override fun readString(): String {
        val result = data[dataPosition].toStringValue()

        dataPosition++

        return result
    }

    override fun writeBoolean(value: Boolean) {
        data.add(dataPosition, byteArrayOf(value.toByte()))

        dataPosition++
    }

    override fun writeByte(value: Byte) {
        data.add(dataPosition, byteArrayOf(value))

        dataPosition++
    }

    override fun writeShort(value: Short) {
        data.add(dataPosition, value.toByteArray())

        dataPosition++
    }

    override fun writeInt(value: Int) {
        data.add(dataPosition, value.toByteArray())

        dataPosition++
    }

    override fun writeLong(value: Long) {
        data.add(dataPosition, value.toByteArray())

        dataPosition++
    }

    override fun writeFloat(value: Float) {
        data.add(dataPosition, value.toByteArray())

        dataPosition++
    }

    override fun writeDouble(value: Double) {
        data.add(dataPosition, value.toByteArray())

        dataPosition++
    }

    override fun writeChar(value: Char) {
        data.add(dataPosition, value.toByteArray())

        dataPosition++
    }

    override fun writeString(value: String) {
        data.add(dataPosition, value.toByteArray())

        dataPosition++
    }

    override fun recycle() {
        isRecycled = true

        data.clear()
        dataPosition = 0
    }

    override fun toByteArray(): ByteArray {
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

    private fun setDataFromByteArray(value: ByteArray) {
        data.clear()
        dataPosition = 0

        if (value.size >= 4) {
            val dataListSize = value.copyOfRange(fromIndex = 0, toIndex = 4).toIntValue()

            if (dataListSize > 0) {
                var i = 4

                while (i < value.size) {
                    val subListSize = value.copyOfRange(fromIndex = i, toIndex = i + 4).toIntValue()

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

    private fun ByteArray.toShortValue(): Short = toIntValue().toShort()

    private fun ByteArray.toFloatValue(): Float = Float.fromBits(toIntValue())

    private fun ByteArray.toDoubleValue(): Double = Double.fromBits(toLongValue())

    private fun ByteArray.toCharValue(): Char = toIntValue().toChar()

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

    companion object {

        private const val FALSE: Byte = 0
        private const val TRUE: Byte = 1
    }
}
