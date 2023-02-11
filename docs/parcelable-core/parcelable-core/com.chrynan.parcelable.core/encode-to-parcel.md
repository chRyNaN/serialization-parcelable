//[parcelable-core](../../index.md)/[com.chrynan.parcelable.core](index.md)/[encodeToParcel](encode-to-parcel.md)

# encodeToParcel

[common]\

@ExperimentalSerializationApi

inline fun &lt;[T](encode-to-parcel.md)&gt; [Parcelable](-parcelable/index.md).[encodeToParcel](encode-to-parcel.md)(parcel: [Parcel](-parcel/index.md) = Parcel(), value: [T](encode-to-parcel.md)): [Parcel](-parcel/index.md)

Encodes the provided [value](encode-to-parcel.md) to the provided [parcel](encode-to-parcel.md) using the provided serializer. This is a convenience function to [Parcelable.encodeToParcel](-parcelable/encode-to-parcel.md) that retrieves the serializer from the [Parcelable.serializersModule](-parcelable/serializers-module.md).

Note that the provided [parcel](encode-to-parcel.md) must already be set to the appropriate [Parcel.dataPosition](-parcel/data-position.md) before invoking this function, as this function does not make assumptions about where the starting [Parcel.dataPosition](-parcel/data-position.md) is located. Failure to do so may result in an exception being thrown when attempting to encode.

#### Return

The provided [parcel](encode-to-parcel.md) containing the encoded [value](encode-to-parcel.md).

#### Parameters

common

| | |
|---|---|
| parcel | The [Parcel](-parcel/index.md) to encode the [value](encode-to-parcel.md) to. Defaults to an empty [Parcel](-parcel/index.md). The [Parcel.dataPosition](-parcel/data-position.md) must be set correctly. |
| value | The value that should be encoded into the [parcel](encode-to-parcel.md). |
