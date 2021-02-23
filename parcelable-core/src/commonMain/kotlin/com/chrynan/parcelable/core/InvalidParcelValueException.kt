package com.chrynan.parcelable.core

import kotlinx.serialization.SerializationException

/**
 * An exception that is thrown when an unexpected [Parcel] value was retrieved or stored.
 *
 * For instance, if we expect an [Int] but we got a [String], this exception will be thrown.
 */
class InvalidParcelValueException(message: String) : SerializationException(message)
