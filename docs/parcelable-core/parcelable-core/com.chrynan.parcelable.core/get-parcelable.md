//[parcelable-core](../../index.md)/[com.chrynan.parcelable.core](index.md)/[getParcelable](get-parcelable.md)

# getParcelable

[android]\

@ExperimentalSerializationApi

fun &lt;[T](get-parcelable.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html).[getParcelable](get-parcelable.md)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), kClass: [KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)&lt;[T](get-parcelable.md)&gt;, flags: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, parcelable: [Parcelable](-parcelable/index.md) = Parcelable.Default): [T](get-parcelable.md)?

@ExperimentalSerializationApi

fun &lt;[T](get-parcelable.md)&gt; [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html).[getParcelable](get-parcelable.md)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), deserializer: DeserializationStrategy&lt;[T](get-parcelable.md)&gt;, flags: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, parcelable: [Parcelable](-parcelable/index.md) = Parcelable.Default): [T](get-parcelable.md)?

@ExperimentalSerializationApi

inline fun &lt;[T](get-parcelable.md)&gt; [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html).[getParcelable](get-parcelable.md)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), flags: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, parcelable: [Parcelable](-parcelable/index.md) = Parcelable.Default): [T](get-parcelable.md)?
