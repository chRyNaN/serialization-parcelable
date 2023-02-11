//[parcelable-core](../../../index.md)/[com.chrynan.parcelable.core](../index.md)/[ByteArrayParcel](index.md)/[dataItemCount](data-item-count.md)

# dataItemCount

[common]\
val [dataItemCount](data-item-count.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

Retrieves the amount of items stored within this data structure. This is different from [dataSize](data-size.md) as that represents the total amount of bytes stored and this [dataItemCount](data-item-count.md) represents the total amount of items stored. For instance, if there are two [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) values stored, then this [dataItemCount](data-item-count.md) will return a value of two, whereas the [dataSize](data-size.md) will return a value of eight (each [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) has four bytes).
