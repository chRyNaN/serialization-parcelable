package com.chrynan.parcelable.core

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.modules.EmptySerializersModule
import kotlinx.serialization.modules.SerializersModule

/**
 * A class containing configuration values used in a [Parcelable] instance.
 *
 * Note that this class has an internal constructor and can be obtained using the [ParcelableConfigurationBuilder] via
 * the [Parcelable] function call.
 */
@ExperimentalSerializationApi
data class ParcelableConfiguration internal constructor(
    val serializersModule: SerializersModule = EmptySerializersModule()
)
