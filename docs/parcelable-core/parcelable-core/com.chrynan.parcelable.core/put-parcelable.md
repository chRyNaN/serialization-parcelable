//[parcelable-core](../../index.md)/[com.chrynan.parcelable.core](index.md)/[putParcelable](put-parcelable.md)

# putParcelable

[android]\

@ExperimentalSerializationApi

fun &lt;[T](put-parcelable.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html).[putParcelable](put-parcelable.md)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [T](put-parcelable.md), kClass: [KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)&lt;[T](put-parcelable.md)&gt;, parcelable: [Parcelable](-parcelable/index.md#1131268509%2FMain%2F-1462739831) = Parcelable.Default)

@ExperimentalSerializationApi

fun &lt;[T](put-parcelable.md)&gt; [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html).[putParcelable](put-parcelable.md)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [T](put-parcelable.md), serializer: SerializationStrategy&lt;[T](put-parcelable.md)&gt;, parcelable: [Parcelable](-parcelable/index.md#1131268509%2FMain%2F-1462739831) = Parcelable.Default)

@ExperimentalSerializationApi

inline fun &lt;[T](put-parcelable.md)&gt; [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html).[putParcelable](put-parcelable.md)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [T](put-parcelable.md), parcelable: [Parcelable](-parcelable/index.md#1131268509%2FMain%2F-1462739831) = Parcelable.Default)
