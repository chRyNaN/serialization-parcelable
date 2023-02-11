//[parcelable-core](../../index.md)/[com.chrynan.parcelable.core](index.md)/[putExtra](put-extra.md)

# putExtra

[android]\

@ExperimentalSerializationApi

fun &lt;[T](put-extra.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [Intent](https://developer.android.com/reference/kotlin/android/content/Intent.html).[putExtra](put-extra.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [T](put-extra.md), kClass: [KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)&lt;[T](put-extra.md)&gt;, parcelable: [Parcelable](-parcelable/index.md#1131268509%2FExtensions%2F-1462739831) = Parcelable.Default): [Intent](https://developer.android.com/reference/kotlin/android/content/Intent.html)

@ExperimentalSerializationApi

fun &lt;[T](put-extra.md)&gt; [Intent](https://developer.android.com/reference/kotlin/android/content/Intent.html).[putExtra](put-extra.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [T](put-extra.md), serializer: SerializationStrategy&lt;[T](put-extra.md)&gt;, parcelable: [Parcelable](-parcelable/index.md#1131268509%2FExtensions%2F-1462739831) = Parcelable.Default): [Intent](https://developer.android.com/reference/kotlin/android/content/Intent.html)

@ExperimentalSerializationApi

inline fun &lt;[T](put-extra.md)&gt; [Intent](https://developer.android.com/reference/kotlin/android/content/Intent.html).[putExtra](put-extra.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [T](put-extra.md), parcelable: [Parcelable](-parcelable/index.md#1131268509%2FExtensions%2F-1462739831) = Parcelable.Default): [Intent](https://developer.android.com/reference/kotlin/android/content/Intent.html)
