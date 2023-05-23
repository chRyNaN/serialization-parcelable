//[parcelable-core](../../index.md)/[com.chrynan.parcelable.core](index.md)/[decodeFromBundle](decode-from-bundle.md)

# decodeFromBundle

[android]\

@ExperimentalSerializationApi

fun &lt;[T](decode-from-bundle.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [Parcelable](-parcelable/index.md#1131268509%2FMain%2F-1462739831).[decodeFromBundle](decode-from-bundle.md)(bundle: [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html), kClass: [KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)&lt;[T](decode-from-bundle.md)&gt;, flags: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0): [T](decode-from-bundle.md)

Retrieves a value of [T](decode-from-bundle.md) of [kClass](decode-from-bundle.md) from the provided [bundle](decode-from-bundle.md) and [flags](decode-from-bundle.md), or null if the [bundle](decode-from-bundle.md) is empty or

[android]\

@ExperimentalSerializationApi

fun &lt;[T](decode-from-bundle.md)&gt; [Parcelable](-parcelable/index.md#1131268509%2FMain%2F-1462739831).[decodeFromBundle](decode-from-bundle.md)(bundle: [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html), deserializer: DeserializationStrategy&lt;[T](decode-from-bundle.md)&gt;, flags: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0): [T](decode-from-bundle.md)

Retrieves a value of [T](decode-from-bundle.md) of [deserializer](decode-from-bundle.md) from the provided [bundle](decode-from-bundle.md) and [flags](decode-from-bundle.md), or null if the [bundle](decode-from-bundle.md) is empty or

[android]\

@ExperimentalSerializationApi

inline fun &lt;[T](decode-from-bundle.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [Parcelable](-parcelable/index.md#1131268509%2FMain%2F-1462739831).[decodeFromBundle](decode-from-bundle.md)(bundle: [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html), flags: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0): [T](decode-from-bundle.md)

Retrieves a value of [T](decode-from-bundle.md) from the deserializer obtained from the [Parcelable.serializersModule](../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcelable/serializers-module.md) from the provided [bundle](decode-from-bundle.md) and [flags](decode-from-bundle.md), or null if the [bundle](decode-from-bundle.md) is empty or
