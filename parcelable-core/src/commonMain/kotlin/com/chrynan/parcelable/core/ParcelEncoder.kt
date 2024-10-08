@file:Suppress("unused")

package com.chrynan.parcelable.core

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.AbstractEncoder
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.modules.EmptySerializersModule
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.encoding.Encoder

/**
 * An [Encoder] that encodes its values to the provided [output] [Parcel].
 */
@ExperimentalSerializationApi
public class ParcelEncoder(
    override val serializersModule: SerializersModule = EmptySerializersModule(),
    private val output: Parcel
) : AbstractEncoder() {

    override fun encodeBoolean(value: Boolean): Unit = output.writeBoolean(value)

    override fun encodeByte(value: Byte): Unit = output.writeByte(value)

    override fun encodeShort(value: Short): Unit = output.writeShort(value)

    override fun encodeInt(value: Int): Unit = output.writeInt(value)

    override fun encodeLong(value: Long): Unit = output.writeLong(value)

    override fun encodeFloat(value: Float): Unit = output.writeFloat(value)

    override fun encodeDouble(value: Double): Unit = output.writeDouble(value)

    override fun encodeChar(value: Char): Unit = output.writeChar(value)

    override fun encodeString(value: String): Unit = output.writeString(value)

    override fun encodeEnum(enumDescriptor: SerialDescriptor, index: Int): Unit =
        output.writeInt(index)

    override fun encodeNull(): Unit = output.writeBoolean(false)

    override fun encodeNotNullMark(): Unit = output.writeBoolean(true)

    override fun beginCollection(
        descriptor: SerialDescriptor,
        collectionSize: Int
    ): CompositeEncoder {
        output.writeInt(collectionSize)
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ParcelEncoder) return false

        if (serializersModule != other.serializersModule) return false
        if (output != other.output) return false

        return true
    }

    override fun hashCode(): Int {
        var result = serializersModule.hashCode()
        result = 31 * result + output.hashCode()
        return result
    }

    override fun toString(): String =
        "ParcelEncoder(serializersModule=$serializersModule, output=$output)"
}
