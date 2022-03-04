package com.chrynan.parcelable.sample.android

object ExpectedModel {

    val model: Model = Model(
        char = 'C',
        string = "String",
        boolean = false,
        byte = 1,
        short = 2,
        integer = -500,
        long = 500000L,
        float = 10f,
        double = 10.5647,
        nullableString = null,
        integerList = emptyList(),
        subModel = SubModel(text = "Text", nullableMap = mapOf(null to "Testing123")),
        map = mapOf("Key1" to 1, "Key2" to 2, "Key3" to 3, "Null" to null),
        enum = SomeEnum.ONE,
        enumSet = setOf(SomeEnum.ONE, SomeEnum.TWO, SomeEnum.THREE, SomeEnum.FOUR, SomeEnum.FIVE)
    )
}
