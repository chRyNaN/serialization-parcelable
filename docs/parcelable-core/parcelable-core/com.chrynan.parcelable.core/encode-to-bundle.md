//[parcelable-core](../../index.md)/[com.chrynan.parcelable.core](index.md)/[encodeToBundle](encode-to-bundle.md)

# encodeToBundle

[android]\

@ExperimentalSerializationApi

fun &lt;[T](encode-to-bundle.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [Parcelable](-parcelable/index.md).[encodeToBundle](encode-to-bundle.md)(value: [T](encode-to-bundle.md), kClass: [KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)&lt;[T](encode-to-bundle.md)&gt;): [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html)

Writes the provided [value](encode-to-bundle.md) of [kClass](encode-to-bundle.md) into a [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html) and returns it. The returned [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html) can then be used as extras in [Intent](https://developer.android.com/reference/kotlin/android/content/Intent.html)s or other [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html)s.

[android]\

@ExperimentalSerializationApi

fun &lt;[T](encode-to-bundle.md)&gt; [Parcelable](-parcelable/index.md).[encodeToBundle](encode-to-bundle.md)(value: [T](encode-to-bundle.md), serializer: SerializationStrategy&lt;[T](encode-to-bundle.md)&gt;): [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html)

Writes the provided [value](encode-to-bundle.md) of [serializer](encode-to-bundle.md) into a [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html) and returns it. The returned [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html) can then be used as extras in [Intent](https://developer.android.com/reference/kotlin/android/content/Intent.html)s or other [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html)s.

[android]\

@ExperimentalSerializationApi

inline fun &lt;[T](encode-to-bundle.md)&gt; [Parcelable](-parcelable/index.md).[encodeToBundle](encode-to-bundle.md)(value: [T](encode-to-bundle.md)): [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html)

Writes the provided [value](encode-to-bundle.md) of serializer obtained from this [Parcelable.serializersModule](-parcelable/serializers-module.md) into a [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html) and returns it. The returned [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html) can then be used as extras in [Intent](https://developer.android.com/reference/kotlin/android/content/Intent.html)s or other [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html)s.
