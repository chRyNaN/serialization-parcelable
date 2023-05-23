//[parcelable-core](../../index.md)/[com.chrynan.parcelable.core](index.md)/[decodeFromIntent](decode-from-intent.md)

# decodeFromIntent

[android]\

@ExperimentalSerializationApi

fun &lt;[T](decode-from-intent.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [Parcelable](-parcelable/index.md#1131268509%2FMain%2F-1462739831).[decodeFromIntent](decode-from-intent.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), kClass: [KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)&lt;[T](decode-from-intent.md)&gt;, flags: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, intent: [Intent](https://developer.android.com/reference/kotlin/android/content/Intent.html)): [T](decode-from-intent.md)?

@ExperimentalSerializationApi

fun &lt;[T](decode-from-intent.md)&gt; [Parcelable](-parcelable/index.md#1131268509%2FMain%2F-1462739831).[decodeFromIntent](decode-from-intent.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), deserializer: DeserializationStrategy&lt;[T](decode-from-intent.md)&gt;, flags: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, intent: [Intent](https://developer.android.com/reference/kotlin/android/content/Intent.html)): [T](decode-from-intent.md)?

@ExperimentalSerializationApi

inline fun &lt;[T](decode-from-intent.md)&gt; [Parcelable](-parcelable/index.md#1131268509%2FMain%2F-1462739831).[decodeFromIntent](decode-from-intent.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), flags: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, intent: [Intent](https://developer.android.com/reference/kotlin/android/content/Intent.html)): [T](decode-from-intent.md)?
