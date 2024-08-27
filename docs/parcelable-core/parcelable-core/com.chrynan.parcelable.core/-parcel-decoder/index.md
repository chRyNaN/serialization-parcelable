//[parcelable-core](../../../index.md)/[com.chrynan.parcelable.core](../index.md)/[ParcelDecoder](index.md)

# ParcelDecoder

[common]\
@ExperimentalSerializationApi

class [ParcelDecoder](index.md)(val serializersModule: SerializersModule = EmptySerializersModule(), input: [Parcel](../-parcel/index.md)) : AbstractDecoder

A Decoder that decodes its values from the provided [input](../-parcel/index.md).

## Constructors

| | |
|---|---|
| [ParcelDecoder](-parcel-decoder.md) | [common]<br>constructor(serializersModule: SerializersModule = EmptySerializersModule(), input: [Parcel](../-parcel/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [serializersModule](serializers-module.md) | [common]<br>open override val [serializersModule](serializers-module.md): SerializersModule |

## Functions

| Name | Summary |
|---|---|
| [beginStructure](begin-structure.md) | [common]<br>open override fun [beginStructure](begin-structure.md)(descriptor: SerialDescriptor): CompositeDecoder |
| [decodeBoolean](decode-boolean.md) | [common]<br>open override fun [decodeBoolean](decode-boolean.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [decodeBooleanElement](index.md#1154532184%2FFunctions%2F1557879601) | [common]<br>override fun [decodeBooleanElement](index.md#1154532184%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [decodeByte](decode-byte.md) | [common]<br>open override fun [decodeByte](decode-byte.md)(): [Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html) |
| [decodeByteElement](index.md#-1401365196%2FFunctions%2F1557879601) | [common]<br>override fun [decodeByteElement](index.md#-1401365196%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html) |
| [decodeChar](decode-char.md) | [common]<br>open override fun [decodeChar](decode-char.md)(): [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) |
| [decodeCharElement](index.md#-2095209050%2FFunctions%2F1557879601) | [common]<br>override fun [decodeCharElement](index.md#-2095209050%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) |
| [decodeCollectionSize](decode-collection-size.md) | [common]<br>open override fun [decodeCollectionSize](decode-collection-size.md)(descriptor: SerialDescriptor): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [decodeDouble](decode-double.md) | [common]<br>open override fun [decodeDouble](decode-double.md)(): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [decodeDoubleElement](index.md#981418891%2FFunctions%2F1557879601) | [common]<br>override fun [decodeDoubleElement](index.md#981418891%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [decodeElementIndex](decode-element-index.md) | [common]<br>open override fun [decodeElementIndex](decode-element-index.md)(descriptor: SerialDescriptor): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [decodeEnum](decode-enum.md) | [common]<br>open override fun [decodeEnum](decode-enum.md)(enumDescriptor: SerialDescriptor): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [decodeFloat](decode-float.md) | [common]<br>open override fun [decodeFloat](decode-float.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [decodeFloatElement](index.md#-1593052636%2FFunctions%2F1557879601) | [common]<br>override fun [decodeFloatElement](index.md#-1593052636%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [decodeInline](index.md#-1467422496%2FFunctions%2F1557879601) | [common]<br>open override fun [decodeInline](index.md#-1467422496%2FFunctions%2F1557879601)(descriptor: SerialDescriptor): Decoder |
| [decodeInlineElement](index.md#-744803901%2FFunctions%2F1557879601) | [common]<br>open override fun [decodeInlineElement](index.md#-744803901%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): Decoder |
| [decodeInt](decode-int.md) | [common]<br>open override fun [decodeInt](decode-int.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [decodeIntElement](index.md#1722943985%2FFunctions%2F1557879601) | [common]<br>override fun [decodeIntElement](index.md#1722943985%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [decodeLong](decode-long.md) | [common]<br>open override fun [decodeLong](decode-long.md)(): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [decodeLongElement](index.md#1919548480%2FFunctions%2F1557879601) | [common]<br>override fun [decodeLongElement](index.md#1919548480%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [decodeNotNullMark](decode-not-null-mark.md) | [common]<br>open override fun [decodeNotNullMark](decode-not-null-mark.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [decodeNull](index.md#1090396180%2FFunctions%2F1557879601) | [common]<br>open override fun [decodeNull](index.md#1090396180%2FFunctions%2F1557879601)(): [Nothing](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)? |
| [decodeNullableSerializableElement](index.md#688572507%2FFunctions%2F1557879601) | [common]<br>override fun &lt;[T](index.md#688572507%2FFunctions%2F1557879601) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [decodeNullableSerializableElement](index.md#688572507%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), deserializer: DeserializationStrategy&lt;[T](index.md#688572507%2FFunctions%2F1557879601)?&gt;, previousValue: [T](index.md#688572507%2FFunctions%2F1557879601)?): [T](index.md#688572507%2FFunctions%2F1557879601)? |
| [decodeNullableSerializableValue](index.md#-1990472531%2FFunctions%2F1557879601) | [common]<br>open fun &lt;[T](index.md#-1990472531%2FFunctions%2F1557879601) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [decodeNullableSerializableValue](index.md#-1990472531%2FFunctions%2F1557879601)(deserializer: DeserializationStrategy&lt;[T](index.md#-1990472531%2FFunctions%2F1557879601)?&gt;): [T](index.md#-1990472531%2FFunctions%2F1557879601)? |
| [decodeSequentially](decode-sequentially.md) | [common]<br>open override fun [decodeSequentially](decode-sequentially.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [decodeSerializableElement](index.md#-197381303%2FFunctions%2F1557879601) | [common]<br>open override fun &lt;[T](index.md#-197381303%2FFunctions%2F1557879601)&gt; [decodeSerializableElement](index.md#-197381303%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), deserializer: DeserializationStrategy&lt;[T](index.md#-197381303%2FFunctions%2F1557879601)&gt;, previousValue: [T](index.md#-197381303%2FFunctions%2F1557879601)?): [T](index.md#-197381303%2FFunctions%2F1557879601) |
| [decodeSerializableValue](index.md#1910178398%2FFunctions%2F1557879601) | [common]<br>open fun &lt;[T](index.md#1910178398%2FFunctions%2F1557879601)&gt; [decodeSerializableValue](index.md#1910178398%2FFunctions%2F1557879601)(deserializer: DeserializationStrategy&lt;[T](index.md#1910178398%2FFunctions%2F1557879601)&gt;, previousValue: [T](index.md#1910178398%2FFunctions%2F1557879601)?): [T](index.md#1910178398%2FFunctions%2F1557879601)<br>open fun &lt;[T](index.md#-815868476%2FFunctions%2F1557879601)&gt; [decodeSerializableValue](index.md#-815868476%2FFunctions%2F1557879601)(deserializer: DeserializationStrategy&lt;[T](index.md#-815868476%2FFunctions%2F1557879601)&gt;): [T](index.md#-815868476%2FFunctions%2F1557879601) |
| [decodeShort](decode-short.md) | [common]<br>open override fun [decodeShort](decode-short.md)(): [Short](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html) |
| [decodeShortElement](index.md#-1405074428%2FFunctions%2F1557879601) | [common]<br>override fun [decodeShortElement](index.md#-1405074428%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Short](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html) |
| [decodeString](decode-string.md) | [common]<br>open override fun [decodeString](decode-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [decodeStringElement](index.md#1875429195%2FFunctions%2F1557879601) | [common]<br>override fun [decodeStringElement](index.md#1875429195%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [decodeValue](index.md#-247490770%2FFunctions%2F1557879601) | [common]<br>open fun [decodeValue](index.md#-247490770%2FFunctions%2F1557879601)(): [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [endStructure](index.md#-1401965681%2FFunctions%2F1557879601) | [common]<br>open override fun [endStructure](index.md#-1401965681%2FFunctions%2F1557879601)(descriptor: SerialDescriptor) |
| [equals](equals.md) | [common]<br>open operator override fun [equals](equals.md)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hashCode](hash-code.md) | [common]<br>open override fun [hashCode](hash-code.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toString](to-string.md) | [common]<br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
