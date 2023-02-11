//[parcelable-core](../../../index.md)/[com.chrynan.parcelable.core](../index.md)/[Parcel](index.md)/[setDataPosition](set-data-position.md)

# setDataPosition

[common]\
abstract fun [setDataPosition](set-data-position.md)(position: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))

Sets the [dataPosition](data-position.md) to the provided [position](set-data-position.md) value. This will throw an exception if the provided [position](set-data-position.md) value is less than zero or exceeds [dataSize](data-size.md).

The position value represents an amount of bytes. For instance, an [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) is a 32-bit (4 byte) integer value, when it is stored in this [Parcel](index.md), the [dataSize](data-size.md) will increase by a value of four. To skip over the integer value to the next item, call this function with the current value plus four.
