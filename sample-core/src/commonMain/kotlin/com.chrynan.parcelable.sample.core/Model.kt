@file:Suppress("unused")

package com.chrynan.parcelable.sample.core

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
    val integerList: List<Int> = emptyList(),
    val subModel: SubModel? = null,
    val map: Map<String, Int?>? = null,
    val enum: SomeEnum = SomeEnum.ONE,
    val enumSet: Set<SomeEnum> = emptySet()
)

@Serializable
data class SubModel(
    val text: String,
    val nullableMap: Map<String?, String> = emptyMap()
)

@Serializable
enum class SomeEnum {

    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE
}
