//[parcelable-compose](../../index.md)/[com.chrynan.parcelable.compose](index.md)

# Package com.chrynan.parcelable.compose

## Functions

| Name | Summary |
|---|---|
| [ParcelableSaver](-parcelable-saver.md) | [common]<br>fun &lt;[T](-parcelable-saver.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [ParcelableSaver](-parcelable-saver.md)(parcelable: [Parcelable](../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcelable/index.md) = Parcelable.Default, serializer: KSerializer&lt;[T](-parcelable-saver.md)&gt;): Saver&lt;[T](-parcelable-saver.md), *&gt;<br>Creates a Saver that uses the provided [parcelable](-parcelable-saver.md) and [serializer](-parcelable-saver.md) to save and restore the value. |
| [rememberSavable](remember-savable.md) | [common]<br>@Composable<br>fun &lt;[T](remember-savable.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [rememberSavable](remember-savable.md)(vararg inputs: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?, parcelable: [Parcelable](../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcelable/index.md) = Parcelable.Default, serializer: KSerializer&lt;[T](remember-savable.md)&gt;, key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, init: () -&gt; [T](remember-savable.md)): [T](remember-savable.md)<br>Calls rememberSaveable using a [ParcelableSaver](-parcelable-saver.md) created using the provided [parcelable](remember-savable.md) and [serializer](remember-savable.md). |
