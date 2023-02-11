//[parcelable-core](../../index.md)/[com.chrynan.parcelable.core](index.md)/[Parcel](-parcel.md)

# Parcel

[android]\
inline fun [Parcel](-parcel.md)(androidParcel: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html)): [Parcel](../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/index.md)

Creates a [com.chrynan.parcelable.core.Parcel](../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/index.md) instance from the provided [android.os.Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html) class.

[common]\
expect fun [Parcel](-parcel.md)(): [Parcel](-parcel/index.md)

Creates an empty [Parcel](-parcel/index.md) instance.

[android, ios, js, jvm]\
[android, ios, js, jvm]\
actual fun [Parcel](-parcel.md)(): [Parcel](../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/index.md)

[android, ios, js, jvm]\
actual fun [Parcel](-parcel.md)(data: [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)): [Parcel](../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/index.md)

[common]\
expect fun [Parcel](-parcel.md)(data: [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)): [Parcel](-parcel/index.md)

Creates a [Parcel](-parcel/index.md) instance containing the provided [data](-parcel.md).

Note that data coming from different target platforms, or different [Parcel](-parcel/index.md) implementations, is not inter-operable.
