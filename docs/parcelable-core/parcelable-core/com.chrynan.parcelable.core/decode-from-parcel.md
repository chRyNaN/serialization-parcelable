//[parcelable-core](../../index.md)/[com.chrynan.parcelable.core](index.md)/[decodeFromParcel](decode-from-parcel.md)

# decodeFromParcel

[android]\
fun &lt;[T](decode-from-parcel.md)&gt; [Parcelable](-parcelable/index.md#1131268509%2FExtensions%2F-1462739831).[decodeFromParcel](decode-from-parcel.md)(parcel: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), deserializer: DeserializationStrategy&lt;[T](decode-from-parcel.md)&gt;): [T](decode-from-parcel.md)

inline fun &lt;[T](decode-from-parcel.md)&gt; [Parcelable](-parcelable/index.md#1131268509%2FExtensions%2F-1462739831).[decodeFromParcel](decode-from-parcel.md)(parcel: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html)): [T](decode-from-parcel.md)

fun &lt;[T](decode-from-parcel.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [Parcelable](-parcelable/index.md#1131268509%2FExtensions%2F-1462739831).[decodeFromParcel](decode-from-parcel.md)(parcel: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), kclass: [KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)&lt;[T](decode-from-parcel.md)&gt;): [T](decode-from-parcel.md)

[common]\
inline fun &lt;[T](decode-from-parcel.md)&gt; [Parcelable](-parcelable/index.md).[decodeFromParcel](decode-from-parcel.md)(parcel: [Parcel](-parcel/index.md)): [T](decode-from-parcel.md)

A convenience function to [Parcelable.decodeFromParcel](-parcelable/decode-from-parcel.md) that retrieves the deserializer from the [Parcelable.serializersModule](-parcelable/serializers-module.md).
