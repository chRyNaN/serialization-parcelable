//[parcelable-core](../../../index.md)/[com.chrynan.parcelable.core](../index.md)/[AndroidParcel](index.md)/[isRecycled](is-recycled.md)

# isRecycled

[android]\
open override var [isRecycled](is-recycled.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false

Determines whether this [Parcel](../../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/index.md)s [recycle](recycle.md) function has been called already. A parcel object should not be used after it is recycled.

Note that this property is unstable between processes.
