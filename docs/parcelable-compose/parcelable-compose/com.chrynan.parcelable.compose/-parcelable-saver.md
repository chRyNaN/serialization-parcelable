//[parcelable-compose](../../index.md)/[com.chrynan.parcelable.compose](index.md)/[ParcelableSaver](-parcelable-saver.md)

# ParcelableSaver

[common]\

@ExperimentalSerializationApi

fun &lt;[T](-parcelable-saver.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [ParcelableSaver](-parcelable-saver.md)(parcelable: [Parcelable](../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcelable/index.md) = Parcelable.Default, serializer: KSerializer&lt;[T](-parcelable-saver.md)&gt;): [Saver](-saver/index.md)&lt;[T](-parcelable-saver.md), *&gt;

Creates a [Saver](-saver/index.md) that uses the provided [parcelable](-parcelable-saver.md) and [serializer](-parcelable-saver.md) to save and restore the value.
