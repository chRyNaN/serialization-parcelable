//[parcelable-core](../../../index.md)/[com.chrynan.parcelable.core](../index.md)/[Parcel](index.md)/[isRecycled](is-recycled.md)

# isRecycled

[common]\
abstract val [isRecycled](is-recycled.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Determines whether this [Parcel](index.md)s [recycle](recycle.md) function has been called already. A parcel object should not be used after it is recycled.

Note that this property is unstable between processes.
