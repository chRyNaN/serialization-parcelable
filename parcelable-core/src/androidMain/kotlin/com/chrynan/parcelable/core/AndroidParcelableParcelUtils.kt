@file:Suppress("unused")

package com.chrynan.parcelable.core

import android.os.Bundle
import kotlinx.serialization.*

/**
 * Reads the Parcel contents into this Bundle, typically in order for it to be passed through an IBinder connection.
 * Params:
 * parcel – The parcel to overwrite this bundle from.
 */
fun Bundle.readFromParcel(parcel: Parcel) {
    require(parcel is AndroidParcel) { "parcel must be an AndroidParcel instance for the Bundle.readFromParcel function." }

    this.readFromParcel(parcel.toAndroidParcel())
}
