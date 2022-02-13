//[parcelable-core](../../../index.md)/[com.chrynan.parcelable.core](../index.md)/[AndroidParceler](index.md)/[writeToParcel](write-to-parcel.md)

# writeToParcel

[android]\
fun &lt;[T](write-to-parcel.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [writeToParcel](write-to-parcel.md)(value: [T](write-to-parcel.md), dest: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), kClass: [KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)&lt;[T](write-to-parcel.md)&gt;): [Parcel](../../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/index.md)

Writes the provided [value](write-to-parcel.md), represented by the provided [kClass](write-to-parcel.md), to the [dest](https://developer.android.com/reference/kotlin/android/os/Parcel.html) using the [parcelable](../../../../parcelable-core/com.chrynan.parcelable.core/-android-parceler/parcelable.md) instance.

[android]\
fun &lt;[T](write-to-parcel.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [writeToParcel](write-to-parcel.md)(value: [T](write-to-parcel.md), dest: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), serializer: SerializationStrategy&lt;[T](write-to-parcel.md)&gt;): [Parcel](../../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/index.md)

Writes the provided [value](write-to-parcel.md), represented by the provided [serializer](write-to-parcel.md), to the [dest](https://developer.android.com/reference/kotlin/android/os/Parcel.html) using the [parcelable](../../../../parcelable-core/com.chrynan.parcelable.core/-android-parceler/parcelable.md) instance.
