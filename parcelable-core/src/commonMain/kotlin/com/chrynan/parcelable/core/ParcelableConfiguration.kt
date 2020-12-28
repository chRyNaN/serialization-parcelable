package com.chrynan.parcelable.core

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.modules.EmptySerializersModule
import kotlinx.serialization.modules.SerializersModule

@ExperimentalSerializationApi
data class ParcelableConfiguration internal constructor(
    val serializersModule: SerializersModule = EmptySerializersModule
)
