//[parcelable-core](../../index.md)/[com.chrynan.parcelable.core](index.md)/[[android]decodeFromParcel]([android]decode-from-parcel.md)

# decodeFromParcel

[android]\

@ExperimentalSerializationApi

fun &lt;[T]([android]decode-from-parcel.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [Parcelable](-parcelable/index.md).[decodeFromParcel]([android]decode-from-parcel.md)(parcel: [Parcel](-parcel/index.md), kClass: [KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)&lt;[T]([android]decode-from-parcel.md)&gt;): [T]([android]decode-from-parcel.md)

Decodes the value of [T]([android]decode-from-parcel.md) from the provided [parcel]([android]decode-from-parcel.md). This is a convenience function to [Parcelable.decodeFromParcel](-parcelable/decode-from-parcel.md) that retrieves the deserializer from the [Parcelable.serializersModule](-parcelable/serializers-module.md) from the provided [kClass]([android]decode-from-parcel.md).

Note that the provided [parcel]([android]decode-from-parcel.md) must already be set to the appropriate [Parcel.dataPosition](-parcel/data-position.md) before invoking this function, as this function does not make assumptions about where the starting [Parcel.dataPosition](-parcel/data-position.md) is located. Failure to do so may result in an exception being thrown when attempting to decode.

#### Return

The decoded value of [T]([android]decode-from-parcel.md) obtained from the [parcel]([android]decode-from-parcel.md).

#### Parameters

android

| | |
|---|---|
| parcel | The [Parcel](-parcel/index.md) to decode the returned value from. The [Parcel.dataPosition](-parcel/data-position.md) must be set correctly. |
