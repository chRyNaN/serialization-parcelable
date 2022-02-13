package com.chrynan.parcelable.core

actual fun Parcel(): Parcel = ByteArrayParcel()

actual fun Parcel(data: ByteArray): Parcel = ByteArrayParcel(initial = data)
