//[parcelable-compose](../../index.md)/[com.chrynan.parcelable.compose](index.md)/[rememberSavable](remember-savable.md)

# rememberSavable

[common]\

@Composable

fun &lt;[T](remember-savable.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [rememberSavable](remember-savable.md)(vararg inputs: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?, parcelable: [Parcelable](../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcelable/index.md) = Parcelable.Default, serializer: KSerializer&lt;[T](remember-savable.md)&gt;, key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, init: () -&gt; [T](remember-savable.md)): [T](remember-savable.md)

Calls rememberSaveable using a [ParcelableSaver](-parcelable-saver.md) created using the provided [parcelable](remember-savable.md) and [serializer](remember-savable.md).
