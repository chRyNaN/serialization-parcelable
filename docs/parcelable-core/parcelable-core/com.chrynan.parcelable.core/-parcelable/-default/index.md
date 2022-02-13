//[parcelable-core](../../../../index.md)/[com.chrynan.parcelable.core](../../index.md)/[Parcelable](../index.md)/[Default](index.md)

# Default

[common]\
object [Default](index.md) : [Parcelable](../index.md)

The default [Parcelable](../index.md) implementation using the default [ParcelableConfiguration](../../-parcelable-configuration/index.md) values. This class can be used when no custom configuration is needed.

## Functions

| Name | Summary |
|---|---|
| [decodeFromByteArray](../decode-from-byte-array.md) | [common]<br>open override fun &lt;[T](../decode-from-byte-array.md)&gt; [decodeFromByteArray](../decode-from-byte-array.md)(deserializer: DeserializationStrategy&lt;[T](../decode-from-byte-array.md)&gt;, bytes: [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)): [T](../decode-from-byte-array.md) |
| [decodeFromParcel](../decode-from-parcel.md) | [common]<br>fun &lt;[T](../decode-from-parcel.md)&gt; [decodeFromParcel](../decode-from-parcel.md)(parcel: [Parcel](../../-parcel/index.md), deserializer: DeserializationStrategy&lt;[T](../decode-from-parcel.md)&gt;): [T](../decode-from-parcel.md)<br>Decodes the value of [T](../decode-from-parcel.md) from the provided [parcel](../decode-from-parcel.md) using the provided [deserializer](../decode-from-parcel.md). |
| [encodeToByteArray](../encode-to-byte-array.md) | [common]<br>open override fun &lt;[T](../encode-to-byte-array.md)&gt; [encodeToByteArray](../encode-to-byte-array.md)(serializer: SerializationStrategy&lt;[T](../encode-to-byte-array.md)&gt;, value: [T](../encode-to-byte-array.md)): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |
| [encodeToParcel](../encode-to-parcel.md) | [common]<br>fun &lt;[T](../encode-to-parcel.md)&gt; [encodeToParcel](../encode-to-parcel.md)(parcel: [Parcel](../../-parcel/index.md), serializer: SerializationStrategy&lt;[T](../encode-to-parcel.md)&gt;, value: [T](../encode-to-parcel.md)): [Parcel](../../-parcel/index.md)<br>Encodes the provided [value](../encode-to-parcel.md) to the provided [parcel](../encode-to-parcel.md) using the provided [serializer](../encode-to-parcel.md). |

## Properties

| Name | Summary |
|---|---|
| [serializersModule](../serializers-module.md) | [common]<br>open override val [serializersModule](../serializers-module.md): SerializersModule |
