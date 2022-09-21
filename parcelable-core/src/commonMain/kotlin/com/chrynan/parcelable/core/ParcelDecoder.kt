@file:Suppress("unused")

package com.chrynan.parcelable.core

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.AbstractDecoder
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.modules.EmptySerializersModule
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.encoding.Decoder

/**
 * A [Decoder] that decodes its values from the provided [input] [Parcel].
 */
@ExperimentalSerializationApi
class ParcelDecoder(
    override val serializersModule: SerializersModule = EmptySerializersModule(),
    private val input: Parcel
) : AbstractDecoder() {

    private var elementIndex = 0

    override fun decodeBoolean(): Boolean = input.readBoolean()

    override fun decodeByte(): Byte = input.readByte()

    override fun decodeShort(): Short = input.readShort()

    override fun decodeInt(): Int = input.readInt()

    override fun decodeLong(): Long = input.readLong()

    override fun decodeFloat(): Float = input.readFloat()

    override fun decodeDouble(): Double = input.readDouble()

    override fun decodeChar(): Char = input.readChar()

    override fun decodeString(): String = input.readString()

    override fun decodeEnum(enumDescriptor: SerialDescriptor): Int = input.readInt()

    override fun decodeElementIndex(descriptor: SerialDescriptor): Int {
        if (elementIndex == descriptor.elementsCount) return CompositeDecoder.DECODE_DONE
        return elementIndex++
    }

    override fun beginStructure(descriptor: SerialDescriptor): CompositeDecoder =
        ParcelDecoder(serializersModule = serializersModule, input = input)

    override fun decodeSequentially(): Boolean = true

    override fun decodeCollectionSize(descriptor: SerialDescriptor): Int = decodeInt()

    override fun decodeNotNullMark(): Boolean = input.readBoolean()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ParcelDecoder) return false

        if (serializersModule != other.serializersModule) return false
        if (input != other.input) return false
        if (elementIndex != other.elementIndex) return false

        return true
    }

    override fun hashCode(): Int {
        var result = serializersModule.hashCode()

        result = 31 * result + input.hashCode()
        result = 31 * result + elementIndex

        return result
    }

    override fun toString(): String =
        "ParcelDecoder(serializersModule=$serializersModule, input=$input, elementIndex=$elementIndex)"
}
