//[parcelable-core](../../../index.md)/[com.chrynan.parcelable.core](../index.md)/[AndroidParceler](index.md)/[createFromParcel](create-from-parcel.md)

# createFromParcel

[android]\
fun &lt;[T](create-from-parcel.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [createFromParcel](create-from-parcel.md)(source: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), kClass: [KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)&lt;[T](create-from-parcel.md)&gt;): [T](create-from-parcel.md)

Retrieves the value of [T](create-from-parcel.md) represented by the provided [kClass](create-from-parcel.md) from the underlying [android.os.Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html) using the [parcelable](../../../../parcelable-core/com.chrynan.parcelable.core/-android-parceler/parcelable.md) instance.

[android]\
fun &lt;[T](create-from-parcel.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [createFromParcel](create-from-parcel.md)(source: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), deserializer: DeserializationStrategy&lt;[T](create-from-parcel.md)&gt;): [T](create-from-parcel.md)

Retrieves the value of [T](create-from-parcel.md) represented by the provided [deserializer](create-from-parcel.md) from the underlying [android.os.Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html) using the [parcelable](../../../../parcelable-core/com.chrynan.parcelable.core/-android-parceler/parcelable.md) instance.
