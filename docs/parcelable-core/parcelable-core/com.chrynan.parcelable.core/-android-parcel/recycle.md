//[parcelable-core](../../../index.md)/[com.chrynan.parcelable.core](../index.md)/[AndroidParcel](index.md)/[recycle](recycle.md)

# recycle

[android]\
open override fun [recycle](recycle.md)()

Puts this parcel object back into the pool, removing its data. This parcel object should not be used after it is recycled. Attempting to write or read from a recycled [Parcel](../-parcel/index.md) may cause an exception to be thrown.
