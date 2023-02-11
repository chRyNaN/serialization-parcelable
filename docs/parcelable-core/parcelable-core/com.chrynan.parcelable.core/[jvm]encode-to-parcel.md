//[parcelable-core](../../index.md)/[com.chrynan.parcelable.core](index.md)/[[jvm]encodeToParcel]([jvm]encode-to-parcel.md)

# encodeToParcel

[jvm]\

@ExperimentalSerializationApi

fun &lt;[T]([jvm]encode-to-parcel.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [Parcelable](-parcelable/index.md#1131268509%2FExtensions%2F1959883941).[encodeToParcel]([jvm]encode-to-parcel.md)(parcel: [Parcel](../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/index.md) = Parcel(), kClass: [KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)&lt;[T]([jvm]encode-to-parcel.md)&gt;, value: [T]([jvm]encode-to-parcel.md)): [Parcel](../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/index.md)

Encodes the provided [value]([jvm]encode-to-parcel.md) to the provided [parcel]([jvm]encode-to-parcel.md) using the provided serializer. This is a convenience function to [Parcelable.encodeToParcel](../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcelable/encode-to-parcel.md) that retrieves the serializer from the [Parcelable.serializersModule](../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcelable/serializers-module.md) using the provided [kClass]([jvm]encode-to-parcel.md).

Note that the provided [parcel]([jvm]encode-to-parcel.md) must already be set to the appropriate [Parcel.dataPosition](../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/data-position.md) before invoking this function, as this function does not make assumptions about where the starting [Parcel.dataPosition](../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/data-position.md) is located. Failure to do so may result in an exception being thrown when attempting to encode.

#### Return

The provided [parcel]([jvm]encode-to-parcel.md) containing the encoded [value]([jvm]encode-to-parcel.md).

#### Parameters

jvm

| | |
|---|---|
| parcel | The [Parcel](../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/index.md) to encode the [value]([jvm]encode-to-parcel.md) to. Defaults to an empty [Parcel](../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/index.md). The [Parcel.dataPosition](../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/data-position.md) must be set correctly. |
| value | The value that should be encoded into the [parcel]([jvm]encode-to-parcel.md). |
