//[parcelable-core](../../../index.md)/[com.chrynan.parcelable.core](../index.md)/[ByteArrayParcel](index.md)/[dataIndex](data-index.md)

# dataIndex

[common]\
var [dataIndex](data-index.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0

Represents the current item index within the data structure. This is different from [dataPosition](data-position.md) as that represents the byte value position, whereas this represents the item position. For instance, a [ByteArrayParcel](index.md) containing two [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) values will have a [dataSize](data-size.md) of eight (four bytes for each [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)). If the [dataIndex](data-index.md) equals one, the [dataPosition](data-position.md) should equal four.
