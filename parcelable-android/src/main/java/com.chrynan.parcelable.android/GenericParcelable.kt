package com.chrynan.parcelable.android

import android.os.Parcelable

abstract class GenericParcelable<T : Any> : Parcelable {

    abstract val item: T
}
