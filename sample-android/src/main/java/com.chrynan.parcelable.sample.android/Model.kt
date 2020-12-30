package com.chrynan.parcelable.sample.android

import kotlinx.serialization.Serializable

@Serializable
data class Model(
    val char: Char,
    val string: String,
    val boolean: Boolean,
    val byte: Byte,
    val short: Short,
    val integer: Int,
    val long: Long,
    val float: Float,
    val double: Double,
    val nullableString: String? = null,
    val integerList: List<Int> = emptyList()
)
