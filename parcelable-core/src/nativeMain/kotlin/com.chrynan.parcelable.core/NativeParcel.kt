package com.chrynan.parcelable.core

public actual fun Parcel(): Parcel = ByteArrayParcel()

public actual fun Parcel(data: ByteArray): Parcel = ByteArrayParcel(initial = data)
