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
class ParcelEncoder(
    override val serializersModule: SerializersModule = EmptySerializersModule(),
    private val output: Parcel
) : AbstractEncoder() {

    override fun encodeBoolean(value: Boolean) = output.writeBoolean(value)

    override fun encodeByte(value: Byte) = output.writeByte(value)

    override fun encodeShort(value: Short) = output.writeShort(value)

    override fun encodeInt(value: Int) = output.writeInt(value)

    override fun encodeLong(value: Long) = output.writeLong(value)

    override fun encodeFloat(value: Float) = output.writeFloat(value)

    override fun encodeDouble(value: Double) = output.writeDouble(value)

    override fun encodeChar(value: Char) = output.writeChar(value)

    override fun encodeString(value: String) = output.writeString(value)

    override fun encodeEnum(enumDescriptor: SerialDescriptor, index: Int) = output.writeInt(index)

    override fun encodeNull() = output.writeBoolean(false)

    override fun encodeNotNullMark() = output.writeBoolean(true)

    override fun beginCollection(descriptor: SerialDescriptor, collectionSize: Int): CompositeEncoder {
        output.writeInt(collectionSize)
        return this
    }
}
