//[parcelable-core](../../index.md)/[com.chrynan.parcelable.core](index.md)/[[android]encodeToParcel]([android]encode-to-parcel.md)

# encodeToParcel

[android]\

@ExperimentalSerializationApi

fun &lt;[T]([android]encode-to-parcel.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [Parcelable](-parcelable/index.md).[encodeToParcel]([android]encode-to-parcel.md)(parcel: [Parcel](-parcel/index.md) = Parcel(), kClass: [KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)&lt;[T]([android]encode-to-parcel.md)&gt;, value: [T]([android]encode-to-parcel.md)): [Parcel](-parcel/index.md)

Encodes the provided [value]([android]encode-to-parcel.md) to the provided [parcel]([android]encode-to-parcel.md) using the provided serializer. This is a convenience function to [Parcelable.encodeToParcel](-parcelable/encode-to-parcel.md) that retrieves the serializer from the [Parcelable.serializersModule](-parcelable/serializers-module.md) using the provided [kClass]([android]encode-to-parcel.md).

Note that the provided [parcel]([android]encode-to-parcel.md) must already be set to the appropriate [Parcel.dataPosition](-parcel/data-position.md) before invoking this function, as this function does not make assumptions about where the starting [Parcel.dataPosition](-parcel/data-position.md) is located. Failure to do so may result in an exception being thrown when attempting to encode.

#### Return

The provided [parcel]([android]encode-to-parcel.md) containing the encoded [value]([android]encode-to-parcel.md).

#### Parameters

android

| | |
|---|---|
| parcel | The [Parcel](-parcel/index.md) to encode the [value]([android]encode-to-parcel.md) to. Defaults to an empty [Parcel](-parcel/index.md). The [Parcel.dataPosition](-parcel/data-position.md) must be set correctly. |
| value | The value that should be encoded into the [parcel]([android]encode-to-parcel.md). |
