//[parcelable-core](../../../index.md)/[com.chrynan.parcelable.core](../index.md)/[ParcelEncoder](index.md)

# ParcelEncoder

[common]\
@ExperimentalSerializationApi

class [ParcelEncoder](index.md)(val serializersModule: SerializersModule = EmptySerializersModule(), output: [Parcel](../-parcel/index.md)) : AbstractEncoder

An Encoder that encodes its values to the provided [output](../-parcel/index.md).

## Constructors

| | |
|---|---|
| [ParcelEncoder](-parcel-encoder.md) | [common]<br>fun [ParcelEncoder](-parcel-encoder.md)(serializersModule: SerializersModule = EmptySerializersModule(), output: [Parcel](../-parcel/index.md)) |

## Functions

| Name | Summary |
|---|---|
| [beginCollection](begin-collection.md) | [common]<br>open override fun [beginCollection](begin-collection.md)(descriptor: SerialDescriptor, collectionSize: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): CompositeEncoder |
| [beginStructure](index.md#-28485579%2FFunctions%2F1557879601) | [common]<br>open override fun [beginStructure](index.md#-28485579%2FFunctions%2F1557879601)(descriptor: SerialDescriptor): CompositeEncoder |
| [encodeBoolean](encode-boolean.md) | [common]<br>open override fun [encodeBoolean](encode-boolean.md)(value: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [encodeBooleanElement](index.md#957465308%2FFunctions%2F1557879601) | [common]<br>override fun [encodeBooleanElement](index.md#957465308%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), value: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [encodeByte](encode-byte.md) | [common]<br>open override fun [encodeByte](encode-byte.md)(value: [Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)) |
| [encodeByteElement](index.md#1446328370%2FFunctions%2F1557879601) | [common]<br>override fun [encodeByteElement](index.md#1446328370%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), value: [Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)) |
| [encodeChar](encode-char.md) | [common]<br>open override fun [encodeChar](encode-char.md)(value: [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)) |
| [encodeCharElement](index.md#11008918%2FFunctions%2F1557879601) | [common]<br>override fun [encodeCharElement](index.md#11008918%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), value: [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)) |
| [encodeDouble](encode-double.md) | [common]<br>open override fun [encodeDouble](encode-double.md)(value: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) |
| [encodeDoubleElement](index.md#575175456%2FFunctions%2F1557879601) | [common]<br>override fun [encodeDoubleElement](index.md#575175456%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), value: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) |
| [encodeElement](index.md#-368233972%2FFunctions%2F1557879601) | [common]<br>open fun [encodeElement](index.md#-368233972%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [encodeEnum](encode-enum.md) | [common]<br>open override fun [encodeEnum](encode-enum.md)(enumDescriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [encodeFloat](encode-float.md) | [common]<br>open override fun [encodeFloat](encode-float.md)(value: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [encodeFloatElement](index.md#-570516580%2FFunctions%2F1557879601) | [common]<br>override fun [encodeFloatElement](index.md#-570516580%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), value: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [encodeInline](index.md#-3972464%2FFunctions%2F1557879601) | [common]<br>open override fun [encodeInline](index.md#-3972464%2FFunctions%2F1557879601)(descriptor: SerialDescriptor): Encoder |
| [encodeInlineElement](index.md#2108465011%2FFunctions%2F1557879601) | [common]<br>override fun [encodeInlineElement](index.md#2108465011%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): Encoder |
| [encodeInt](encode-int.md) | [common]<br>open override fun [encodeInt](encode-int.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [encodeIntElement](index.md#-761765764%2FFunctions%2F1557879601) | [common]<br>override fun [encodeIntElement](index.md#-761765764%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [encodeLong](encode-long.md) | [common]<br>open override fun [encodeLong](encode-long.md)(value: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) |
| [encodeLongElement](index.md#-803021494%2FFunctions%2F1557879601) | [common]<br>override fun [encodeLongElement](index.md#-803021494%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), value: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) |
| [encodeNotNullMark](encode-not-null-mark.md) | [common]<br>open override fun [encodeNotNullMark](encode-not-null-mark.md)() |
| [encodeNull](encode-null.md) | [common]<br>open override fun [encodeNull](encode-null.md)() |
| [encodeNullableSerializableElement](index.md#1760601801%2FFunctions%2F1557879601) | [common]<br>open override fun &lt;[T](index.md#1760601801%2FFunctions%2F1557879601) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [encodeNullableSerializableElement](index.md#1760601801%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), serializer: SerializationStrategy&lt;[T](index.md#1760601801%2FFunctions%2F1557879601)&gt;, value: [T](index.md#1760601801%2FFunctions%2F1557879601)?) |
| [encodeNullableSerializableValue](index.md#-1929440544%2FFunctions%2F1557879601) | [common]<br>open fun &lt;[T](index.md#-1929440544%2FFunctions%2F1557879601) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [encodeNullableSerializableValue](index.md#-1929440544%2FFunctions%2F1557879601)(serializer: SerializationStrategy&lt;[T](index.md#-1929440544%2FFunctions%2F1557879601)&gt;, value: [T](index.md#-1929440544%2FFunctions%2F1557879601)?) |
| [encodeSerializableElement](index.md#-607508213%2FFunctions%2F1557879601) | [common]<br>open override fun &lt;[T](index.md#-607508213%2FFunctions%2F1557879601)&gt; [encodeSerializableElement](index.md#-607508213%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), serializer: SerializationStrategy&lt;[T](index.md#-607508213%2FFunctions%2F1557879601)&gt;, value: [T](index.md#-607508213%2FFunctions%2F1557879601)) |
| [encodeSerializableValue](index.md#563303892%2FFunctions%2F1557879601) | [common]<br>open fun &lt;[T](index.md#563303892%2FFunctions%2F1557879601)&gt; [encodeSerializableValue](index.md#563303892%2FFunctions%2F1557879601)(serializer: SerializationStrategy&lt;[T](index.md#563303892%2FFunctions%2F1557879601)&gt;, value: [T](index.md#563303892%2FFunctions%2F1557879601)) |
| [encodeShort](encode-short.md) | [common]<br>open override fun [encodeShort](encode-short.md)(value: [Short](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html)) |
| [encodeShortElement](index.md#-1833660516%2FFunctions%2F1557879601) | [common]<br>override fun [encodeShortElement](index.md#-1833660516%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), value: [Short](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html)) |
| [encodeString](encode-string.md) | [common]<br>open override fun [encodeString](encode-string.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [encodeStringElement](index.md#283493024%2FFunctions%2F1557879601) | [common]<br>override fun [encodeStringElement](index.md#283493024%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [encodeValue](index.md#733233407%2FFunctions%2F1557879601) | [common]<br>open fun [encodeValue](index.md#733233407%2FFunctions%2F1557879601)(value: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)) |
| [endStructure](index.md#578274407%2FFunctions%2F1557879601) | [common]<br>open override fun [endStructure](index.md#578274407%2FFunctions%2F1557879601)(descriptor: SerialDescriptor) |
| [equals](equals.md) | [common]<br>open operator override fun [equals](equals.md)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hashCode](hash-code.md) | [common]<br>open override fun [hashCode](hash-code.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [shouldEncodeElementDefault](index.md#-1741660893%2FFunctions%2F1557879601) | [common]<br>open fun [shouldEncodeElementDefault](index.md#-1741660893%2FFunctions%2F1557879601)(descriptor: SerialDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [toString](to-string.md) | [common]<br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Properties

| Name | Summary |
|---|---|
| [serializersModule](serializers-module.md) | [common]<br>open override val [serializersModule](serializers-module.md): SerializersModule |
