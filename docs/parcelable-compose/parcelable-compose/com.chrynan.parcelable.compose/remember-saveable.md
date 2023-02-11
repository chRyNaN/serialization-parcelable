//[parcelable-compose](../../index.md)/[com.chrynan.parcelable.compose](index.md)/[rememberSaveable](remember-saveable.md)

# rememberSaveable

[common]\

@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)

@ExperimentalSerializationApi

fun &lt;[T](remember-saveable.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [rememberSaveable](remember-saveable.md)(vararg inputs: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?, parcelable: [Parcelable](../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcelable/index.md) = Parcelable.Default, serializer: KSerializer&lt;[T](remember-saveable.md)&gt;, key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, init: () -&gt; [MutableState](https://developer.android.com/reference/kotlin/androidx/compose/runtime/MutableState.html)&lt;[T](remember-saveable.md)&gt;): [MutableState](https://developer.android.com/reference/kotlin/androidx/compose/runtime/MutableState.html)&lt;[T](remember-saveable.md)&gt;

Calls [rememberSaveable](remember-saveable.md) using a [ParcelableSaver](-parcelable-saver.md) created using the provided [parcelable](remember-saveable.md) and [serializer](remember-saveable.md).

[common]\

@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)

fun &lt;[T](remember-saveable.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [rememberSaveable](remember-saveable.md)(vararg inputs: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?, saver: [Saver](-saver/index.md)&lt;[T](remember-saveable.md), out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; = autoSaver(), key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, init: () -&gt; [T](remember-saveable.md)): [T](remember-saveable.md)

@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)

fun &lt;[T](remember-saveable.md)&gt; [rememberSaveable](remember-saveable.md)(vararg inputs: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?, stateSaver: [Saver](-saver/index.md)&lt;[T](remember-saveable.md), out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;, key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, init: () -&gt; [MutableState](https://developer.android.com/reference/kotlin/androidx/compose/runtime/MutableState.html)&lt;[T](remember-saveable.md)&gt;): [MutableState](https://developer.android.com/reference/kotlin/androidx/compose/runtime/MutableState.html)&lt;[T](remember-saveable.md)&gt;
