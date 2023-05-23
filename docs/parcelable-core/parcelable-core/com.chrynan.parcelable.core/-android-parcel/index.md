//[parcelable-core](../../../index.md)/[com.chrynan.parcelable.core](../index.md)/[AndroidParcel](index.md)

# AndroidParcel

class [AndroidParcel](index.md) : [Parcel](../../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/index.md)

An Android implementation of the [Parcel](../../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/index.md) interface. This class wraps the provided [android.os.Parcel](../../../../parcelable-core/com.chrynan.parcelable.core/-android-parcel/parcel.md) and delegates the reading and writing to it.

Note that this class should not be confused with the [android.os.Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html). Instead, this class wraps that class and implements the [Parcel](../../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/index.md) interface of this library.

#### See also

| |
|---|
| [Parcel](../../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/index.md) |
| [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html) |

## Functions

| Name | Summary |
|---|---|
| [equals](equals.md) | [android]<br>open operator override fun [equals](equals.md)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hashCode](hash-code.md) | [android]<br>open override fun [hashCode](hash-code.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [readBoolean](read-boolean.md) | [android]<br>open override fun [readBoolean](read-boolean.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Retrieves a [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) from the Parcel at the current data position. |
| [readByte](read-byte.md) | [android]<br>open override fun [readByte](read-byte.md)(): [Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)<br>Retrieves a [Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html) from the Parcel at the current data position. |
| [readChar](read-char.md) | [android]<br>open override fun [readChar](read-char.md)(): [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)<br>Retrieves a [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) from the Parcel at the current data position. |
| [readDouble](read-double.md) | [android]<br>open override fun [readDouble](read-double.md)(): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>Retrieves a [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) from the Parcel at the current data position. |
| [readFloat](read-float.md) | [android]<br>open override fun [readFloat](read-float.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Retrieves a [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) from the Parcel at the current data position. |
| [readInt](read-int.md) | [android]<br>open override fun [readInt](read-int.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Retrieves a [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) from the Parcel at the current data position. |
| [readLong](read-long.md) | [android]<br>open override fun [readLong](read-long.md)(): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>Retrieves a [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) from the Parcel at the current data position. |
| [readShort](read-short.md) | [android]<br>open override fun [readShort](read-short.md)(): [Short](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html)<br>Retrieves a [Short](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html) from the Parcel at the current data position. |
| [readString](read-string.md) | [android]<br>open override fun [readString](read-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Retrieves a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) from the Parcel at the current data position. |
| [recycle](recycle.md) | [android]<br>open override fun [recycle](recycle.md)()<br>Puts this parcel object back into the pool, removing its data. This parcel object should not be used after it is recycled. Attempting to write or read from a recycled [Parcel](../../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/index.md) may cause an exception to be thrown. |
| [resetDataPosition](../reset-data-position.md) | [common]<br>inline fun [Parcel](../-parcel/index.md).[resetDataPosition](../reset-data-position.md)()<br>A convenience function for calling the [Parcel.setDataPosition](../-parcel/set-data-position.md) with an index value of zero. |
| [setDataPosition](set-data-position.md) | [android]<br>open override fun [setDataPosition](set-data-position.md)(position: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>Sets the [dataPosition](data-position.md) to the provided [position](set-data-position.md) value. This will throw an exception if the provided [position](set-data-position.md) value is less than zero or exceeds [dataSize](data-size.md). |
| [toByteArray](to-byte-array.md) | [android]<br>open override fun [toByteArray](to-byte-array.md)(): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Obtains a [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) of the underlying values of this [Parcel](../../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/index.md). Note that the returned [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) data is structured in a way that is meaningful for this implementation, but doesn't guarantee any structure for outside usage or usage between different implementations. |
| [toString](to-string.md) | [android]<br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [writeBoolean](write-boolean.md) | [android]<br>open override fun [writeBoolean](write-boolean.md)(value: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))<br>Writes the [Boolean](write-boolean.md) to the Parcel at the current data position. |
| [writeByte](write-byte.md) | [android]<br>open override fun [writeByte](write-byte.md)(value: [Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html))<br>Writes the [Byte](write-byte.md) to the Parcel at the current data position. |
| [writeChar](write-char.md) | [android]<br>open override fun [writeChar](write-char.md)(value: [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html))<br>Writes the [Char](write-char.md) to the Parcel at the current data position. |
| [writeDouble](write-double.md) | [android]<br>open override fun [writeDouble](write-double.md)(value: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html))<br>Writes the [Double](write-double.md) to the Parcel at the current data position. |
| [writeFloat](write-float.md) | [android]<br>open override fun [writeFloat](write-float.md)(value: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))<br>Writes the [Float](write-float.md) to the Parcel at the current data position. |
| [writeInt](write-int.md) | [android]<br>open override fun [writeInt](write-int.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>Writes the [Int](write-int.md) to the Parcel at the current data position. |
| [writeLong](write-long.md) | [android]<br>open override fun [writeLong](write-long.md)(value: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html))<br>Writes the [Long](write-long.md) to the Parcel at the current data position. |
| [writeShort](write-short.md) | [android]<br>open override fun [writeShort](write-short.md)(value: [Short](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html))<br>Writes the [Short](write-short.md) to the Parcel at the current data position. |
| [writeString](write-string.md) | [android]<br>open override fun [writeString](write-string.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Writes the [String](write-string.md) to the Parcel at the current data position. |

## Properties

| Name | Summary |
|---|---|
| [dataBufferCapacity](data-buffer-capacity.md) | [android]<br>open override val [dataBufferCapacity](data-buffer-capacity.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The total amount of space available in this parcel. This should always be greater than or equal to [dataSize](data-size.md). There may be more space available ([dataBufferCapacity](data-buffer-capacity.md)) in the underlying data buffer than there is data available ([dataSize](data-size.md)). The difference between [dataBufferCapacity](data-buffer-capacity.md) and [dataSize](data-size.md) indicates the amount of room remaining in the underlying data buffer until more space needs to be allocated. |
| [dataPosition](data-position.md) | [android]<br>open override val [dataPosition](data-position.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The current index position in the data buffer. Should never be more than [dataSize](data-size.md). |
| [dataRemaining](index.md#-139993914%2FProperties%2F-1462739831) | [android]<br>open val [dataRemaining](index.md#-139993914%2FProperties%2F-1462739831): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The remaining amount of data to be read ([dataSize](../../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/data-size.md) - [dataPosition](../../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/data-position.md)). |
| [dataSize](data-size.md) | [android]<br>open override val [dataSize](data-size.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The total amount of data contained in this parcel. |
| [isRecycled](is-recycled.md) | [android]<br>open override var [isRecycled](is-recycled.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Determines whether this [Parcel](../../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/index.md)s [recycle](recycle.md) function has been called already. A parcel object should not be used after it is recycled. |
