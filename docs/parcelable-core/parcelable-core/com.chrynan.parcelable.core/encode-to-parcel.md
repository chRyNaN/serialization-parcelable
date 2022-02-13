//[parcelable-core](../../index.md)/[com.chrynan.parcelable.core](index.md)/[encodeToParcel](encode-to-parcel.md)

# encodeToParcel

[android]\
fun &lt;[T](encode-to-parcel.md)&gt; [Parcelable](-parcelable/index.md#1131268509%2FExtensions%2F-1462739831).[encodeToParcel](encode-to-parcel.md)(parcel: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), serializer: SerializationStrategy&lt;[T](encode-to-parcel.md)&gt;, value: [T](encode-to-parcel.md)): [Parcel](../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/index.md)

inline fun &lt;[T](encode-to-parcel.md)&gt; [Parcelable](-parcelable/index.md#1131268509%2FExtensions%2F-1462739831).[encodeToParcel](encode-to-parcel.md)(parcel: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), value: [T](encode-to-parcel.md)): [Parcel](../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/index.md)

fun &lt;[T](encode-to-parcel.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [Parcelable](-parcelable/index.md#1131268509%2FExtensions%2F-1462739831).[encodeToParcel](encode-to-parcel.md)(parcel: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), value: [T](encode-to-parcel.md), kclass: [KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)&lt;[T](encode-to-parcel.md)&gt;): [Parcel](../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/index.md)

[common]\
inline fun &lt;[T](encode-to-parcel.md)&gt; [Parcelable](-parcelable/index.md).[encodeToParcel](encode-to-parcel.md)(parcel: [Parcel](-parcel/index.md), value: [T](encode-to-parcel.md)): [Parcel](-parcel/index.md)

A convenience function to [Parcelable.encodeToParcel](-parcelable/encode-to-parcel.md) that retrieves the serializer from the [Parcelable.serializersModule](-parcelable/serializers-module.md).
