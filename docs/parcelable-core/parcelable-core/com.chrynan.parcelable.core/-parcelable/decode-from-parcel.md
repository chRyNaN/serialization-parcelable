//[parcelable-core](../../../index.md)/[com.chrynan.parcelable.core](../index.md)/[Parcelable](index.md)/[decodeFromParcel](decode-from-parcel.md)

# decodeFromParcel

[common]\
fun &lt;[T](decode-from-parcel.md)&gt; [decodeFromParcel](decode-from-parcel.md)(parcel: [Parcel](../-parcel/index.md), deserializer: DeserializationStrategy&lt;[T](decode-from-parcel.md)&gt;): [T](decode-from-parcel.md)

Decodes the value of [T](decode-from-parcel.md) from the provided [parcel](decode-from-parcel.md) using the provided [deserializer](decode-from-parcel.md).

Note that the provided [parcel](decode-from-parcel.md) must already be set to the appropriate [Parcel.dataPosition](../-parcel/data-position.md) before invoking this function, as this function does not make assumptions about where the starting [Parcel.dataPosition](../-parcel/data-position.md) is located. Failure to do so may result in an exception being thrown when attempting to decode.

#### Return

The decoded value of [T](decode-from-parcel.md) obtained from the [parcel](decode-from-parcel.md).

#### Parameters

common

| | |
|---|---|
| parcel | The [Parcel](../-parcel/index.md) to decode the returned value from. The [Parcel.dataPosition](../-parcel/data-position.md) must be set correctly. |
| deserializer | The DeserializationStrategy used to decode the value from the [parcel](decode-from-parcel.md). |
