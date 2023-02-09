@file:Suppress("unused")

package com.chrynan.parcelable.core

import android.os.Bundle
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.serializer

@ExperimentalSerializationApi
inline fun <reified T> Parcelable.encodeToBundle(value: T): Bundle =
    encodeToBundle(value, serializersModule.serializer())
