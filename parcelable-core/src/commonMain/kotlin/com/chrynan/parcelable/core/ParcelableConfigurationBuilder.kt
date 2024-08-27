@file:Suppress("unused")

package com.chrynan.parcelable.core

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.modules.SerializersModule

/**
 * A builder class to create an instance of [ParcelableConfiguration].
 *
 * Note that this class has an internal constructor and is used internally to create a [ParcelableConfiguration]. This
 * class is used in the [Parcelable] function to retrieve a custom [ParcelableConfiguration].
 */
@ExperimentalSerializationApi
public class ParcelableConfigurationBuilder internal constructor(configuration: ParcelableConfiguration) {

    @Suppress("MemberVisibilityCanBePrivate")
    public var serializersModule: SerializersModule = configuration.serializersModule

    internal fun build(): ParcelableConfiguration = ParcelableConfiguration(serializersModule = serializersModule)
}
