//[parcelable-core](../../index.md)/[com.chrynan.parcelable.core](index.md)/[decodeFromParcel](decode-from-parcel.md)

# decodeFromParcel

[common]\

@ExperimentalSerializationApi

inline fun &lt;[T](decode-from-parcel.md)&gt; [Parcelable](-parcelable/index.md).[decodeFromParcel](decode-from-parcel.md)(parcel: [Parcel](-parcel/index.md)): [T](decode-from-parcel.md)

Decodes the value of [T](decode-from-parcel.md) from the provided [parcel](decode-from-parcel.md). This is a convenience function to [Parcelable.decodeFromParcel](-parcelable/decode-from-parcel.md) that retrieves the deserializer from the [Parcelable.serializersModule](-parcelable/serializers-module.md).

Note that the provided [parcel](decode-from-parcel.md) must already be set to the appropriate [Parcel.dataPosition](-parcel/data-position.md) before invoking this function, as this function does not make assumptions about where the starting [Parcel.dataPosition](-parcel/data-position.md) is located. Failure to do so may result in an exception being thrown when attempting to decode.

#### Return

The decoded value of [T](decode-from-parcel.md) obtained from the [parcel](decode-from-parcel.md).

#### Parameters

common

| | |
|---|---|
| parcel | The [Parcel](-parcel/index.md) to decode the returned value from. The [Parcel.dataPosition](-parcel/data-position.md) must be set correctly. |
