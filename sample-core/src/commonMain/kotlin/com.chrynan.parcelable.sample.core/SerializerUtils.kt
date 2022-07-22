@file:Suppress("unused")

package com.chrynan.parcelable.sample.core

import com.chrynan.parcelable.core.Parcelable
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json

@ExperimentalSerializationApi
object SerializerUtils {

    val parcelable: Parcelable = Parcelable.Default

    val json: Json = Json {
        prettyPrint = true
        encodeDefaults = true
    }
}
