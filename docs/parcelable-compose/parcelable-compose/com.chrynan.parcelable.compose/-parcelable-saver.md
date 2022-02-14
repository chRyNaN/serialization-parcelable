//[parcelable-compose](../../index.md)/[com.chrynan.parcelable.compose](index.md)/[ParcelableSaver](-parcelable-saver.md)

# ParcelableSaver

[common]\
fun &lt;[T](-parcelable-saver.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [ParcelableSaver](-parcelable-saver.md)(parcelable: [Parcelable](../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcelable/index.md) = Parcelable.Default, serializer: KSerializer&lt;[T](-parcelable-saver.md)&gt;): Saver&lt;[T](-parcelable-saver.md), *&gt;

Creates a Saver that uses the provided [parcelable](-parcelable-saver.md) and [serializer](-parcelable-saver.md) to save and restore the value.
