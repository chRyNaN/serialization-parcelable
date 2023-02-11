//[parcelable-core](../../index.md)/[com.chrynan.parcelable.core](index.md)/[getParcelableExtra](get-parcelable-extra.md)

# getParcelableExtra

[android]\

@ExperimentalSerializationApi

fun &lt;[T](get-parcelable-extra.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [Intent](https://developer.android.com/reference/kotlin/android/content/Intent.html).[getParcelableExtra](get-parcelable-extra.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), kClass: [KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)&lt;[T](get-parcelable-extra.md)&gt;, flags: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, parcelable: [Parcelable](-parcelable/index.md#1131268509%2FExtensions%2F-1462739831) = Parcelable.Default): [T](get-parcelable-extra.md)?

@ExperimentalSerializationApi

fun &lt;[T](get-parcelable-extra.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [Intent](https://developer.android.com/reference/kotlin/android/content/Intent.html).[getParcelableExtra](get-parcelable-extra.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), deserializer: DeserializationStrategy&lt;[T](get-parcelable-extra.md)&gt;, flags: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, parcelable: [Parcelable](-parcelable/index.md#1131268509%2FExtensions%2F-1462739831) = Parcelable.Default): [T](get-parcelable-extra.md)?

@ExperimentalSerializationApi

inline fun &lt;[T](get-parcelable-extra.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [Intent](https://developer.android.com/reference/kotlin/android/content/Intent.html).[getParcelableExtra](get-parcelable-extra.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), flags: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, parcelable: [Parcelable](-parcelable/index.md#1131268509%2FExtensions%2F-1462739831) = Parcelable.Default): [T](get-parcelable-extra.md)?
