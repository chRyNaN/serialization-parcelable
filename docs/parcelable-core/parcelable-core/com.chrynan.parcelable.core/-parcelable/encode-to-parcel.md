//[parcelable-core](../../../index.md)/[com.chrynan.parcelable.core](../index.md)/[Parcelable](index.md)/[encodeToParcel](encode-to-parcel.md)

# encodeToParcel

[common]\
fun &lt;[T](encode-to-parcel.md)&gt; [encodeToParcel](encode-to-parcel.md)(parcel: [Parcel](../-parcel/index.md) = Parcel(), serializer: SerializationStrategy&lt;[T](encode-to-parcel.md)&gt;, value: [T](encode-to-parcel.md)): [Parcel](../-parcel/index.md)

Encodes the provided [value](encode-to-parcel.md) to the provided [parcel](encode-to-parcel.md) using the provided [serializer](encode-to-parcel.md).

Note that the provided [parcel](encode-to-parcel.md) must already be set to the appropriate [Parcel.dataPosition](../-parcel/data-position.md) before invoking this function, as this function does not make assumptions about where the starting [Parcel.dataPosition](../-parcel/data-position.md) is located. Failure to do so may result in an exception being thrown when attempting to encode.

#### Return

The provided [parcel](encode-to-parcel.md) containing the encoded [value](encode-to-parcel.md).

#### Parameters

common

| | |
|---|---|
| parcel | The [Parcel](../-parcel/index.md) to encode the [value](encode-to-parcel.md) to. Defaults to an empty [Parcel](../-parcel/index.md). The [Parcel.dataPosition](../-parcel/data-position.md) must be set correctly. |
| serializer | The SerializationStrategy used to encode the [value](encode-to-parcel.md) to the [parcel](encode-to-parcel.md). |
| value | The value that should be encoded into the [parcel](encode-to-parcel.md). |
