package com.chrynan.parcelable.core

import kotlinx.serialization.SerializationException

class InvalidParcelValueException(message: String) : SerializationException(message)
