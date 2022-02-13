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
        subModel = SubModel(text = "Text")
    )
}
