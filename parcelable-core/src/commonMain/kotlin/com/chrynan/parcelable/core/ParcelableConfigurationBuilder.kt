@file:Suppress("unused")

package com.chrynan.parcelable.core

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.modules.SerializersModule

@ExperimentalSerializationApi
class ParcelableConfigurationBuilder internal constructor(configuration: ParcelableConfiguration) {

    var serializersModule: SerializersModule = configuration.serializersModule

    internal fun build(): ParcelableConfiguration = ParcelableConfiguration(serializersModule = serializersModule)
}
