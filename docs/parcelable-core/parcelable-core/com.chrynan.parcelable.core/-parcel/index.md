//[parcelable-core](../../../index.md)/[com.chrynan.parcelable.core](../index.md)/[Parcel](index.md)

# Parcel

interface [Parcel](index.md) : [InputParcel](../-input-parcel/index.md), [OutputParcel](../-output-parcel/index.md)

An interface representing a component that has the ability for primitive types to be written to and read from it.

Note that this is not meant to represent a persistent storage component. Instead, [Parcel](index.md)s are short-lived and meant to transfer data between different components and processes.

Note that this is based off of the Android Parcel component.

#### See also

| | |
|---|---|
|  | [Android Parcel](https://developer.android.com/reference/android/os/Parcel) |

#### Inheritors

| |
|---|
| [AndroidParcel](../-android-parcel/index.md#-638012278%2FMain%2F1557879601) |
| [ByteArrayParcel](../-byte-array-parcel/index.md) |

## Functions

| Name | Summary |
|---|---|
| [readBoolean](../-input-parcel/read-boolean.md) | [common]<br>abstract fun [readBoolean](../-input-parcel/read-boolean.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Retrieves a [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) from the Parcel at the current data position. |
| [readByte](../-input-parcel/read-byte.md) | [common]<br>abstract fun [readByte](../-input-parcel/read-byte.md)(): [Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)<br>Retrieves a [Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html) from the Parcel at the current data position. |
| [readChar](../-input-parcel/read-char.md) | [common]<br>abstract fun [readChar](../-input-parcel/read-char.md)(): [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)<br>Retrieves a [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) from the Parcel at the current data position. |
| [readDouble](../-input-parcel/read-double.md) | [common]<br>abstract fun [readDouble](../-input-parcel/read-double.md)(): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>Retrieves a [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) from the Parcel at the current data position. |
| [readFloat](../-input-parcel/read-float.md) | [common]<br>abstract fun [readFloat](../-input-parcel/read-float.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Retrieves a [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) from the Parcel at the current data position. |
| [readInt](../-input-parcel/read-int.md) | [common]<br>abstract fun [readInt](../-input-parcel/read-int.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Retrieves a [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) from the Parcel at the current data position. |
| [readLong](../-input-parcel/read-long.md) | [common]<br>abstract fun [readLong](../-input-parcel/read-long.md)(): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>Retrieves a [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) from the Parcel at the current data position. |
| [readShort](../-input-parcel/read-short.md) | [common]<br>abstract fun [readShort](../-input-parcel/read-short.md)(): [Short](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html)<br>Retrieves a [Short](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html) from the Parcel at the current data position. |
| [readString](../-input-parcel/read-string.md) | [common]<br>abstract fun [readString](../-input-parcel/read-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Retrieves a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) from the Parcel at the current data position. |
| [recycle](recycle.md) | [common]<br>abstract fun [recycle](recycle.md)()<br>Puts this parcel object back into the pool, removing its data. This parcel object should not be used after it is recycled. Attempting to write or read from a recycled [Parcel](index.md) may cause an exception to be thrown. |
| [resetDataPosition](../reset-data-position.md) | [common]<br>inline fun [Parcel](index.md).[resetDataPosition](../reset-data-position.md)()<br>A convenience function for calling the [Parcel.setDataPosition](set-data-position.md) with an index value of zero. |
| [setDataPosition](set-data-position.md) | [common]<br>abstract fun [setDataPosition](set-data-position.md)(position: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>Sets the [dataPosition](data-position.md) to the provided [position](set-data-position.md) value. This will throw an exception if the provided [position](set-data-position.md) value is less than zero or exceeds [dataSize](data-size.md). |
| [toByteArray](to-byte-array.md) | [common]<br>abstract fun [toByteArray](to-byte-array.md)(): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Obtains a [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) of the underlying values of this [Parcel](index.md). Note that the returned [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) data is structured in a way that is meaningful for this implementation, but doesn't guarantee any structure for outside usage or usage between different implementations. |
| [writeBoolean](../-output-parcel/write-boolean.md) | [common]<br>abstract fun [writeBoolean](../-output-parcel/write-boolean.md)(value: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))<br>Writes the [Boolean](../-output-parcel/write-boolean.md) to the Parcel at the current data position. |
| [writeByte](../-output-parcel/write-byte.md) | [common]<br>abstract fun [writeByte](../-output-parcel/write-byte.md)(value: [Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html))<br>Writes the [Byte](../-output-parcel/write-byte.md) to the Parcel at the current data position. |
| [writeChar](../-output-parcel/write-char.md) | [common]<br>abstract fun [writeChar](../-output-parcel/write-char.md)(value: [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html))<br>Writes the [Char](../-output-parcel/write-char.md) to the Parcel at the current data position. |
| [writeDouble](../-output-parcel/write-double.md) | [common]<br>abstract fun [writeDouble](../-output-parcel/write-double.md)(value: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html))<br>Writes the [Double](../-output-parcel/write-double.md) to the Parcel at the current data position. |
| [writeFloat](../-output-parcel/write-float.md) | [common]<br>abstract fun [writeFloat](../-output-parcel/write-float.md)(value: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))<br>Writes the [Float](../-output-parcel/write-float.md) to the Parcel at the current data position. |
| [writeInt](../-output-parcel/write-int.md) | [common]<br>abstract fun [writeInt](../-output-parcel/write-int.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>Writes the [Int](../-output-parcel/write-int.md) to the Parcel at the current data position. |
| [writeLong](../-output-parcel/write-long.md) | [common]<br>abstract fun [writeLong](../-output-parcel/write-long.md)(value: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html))<br>Writes the [Long](../-output-parcel/write-long.md) to the Parcel at the current data position. |
| [writeShort](../-output-parcel/write-short.md) | [common]<br>abstract fun [writeShort](../-output-parcel/write-short.md)(value: [Short](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html))<br>Writes the [Short](../-output-parcel/write-short.md) to the Parcel at the current data position. |
| [writeString](../-output-parcel/write-string.md) | [common]<br>abstract fun [writeString](../-output-parcel/write-string.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Writes the [String](../-output-parcel/write-string.md) to the Parcel at the current data position. |

## Properties

| Name | Summary |
|---|---|
| [dataBufferCapacity](data-buffer-capacity.md) | [common]<br>abstract val [dataBufferCapacity](data-buffer-capacity.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The total amount of space available in this parcel. This should always be greater than or equal to [dataSize](data-size.md). There may be more space available ([dataBufferCapacity](data-buffer-capacity.md)) in the underlying data buffer than there is data available ([dataSize](data-size.md)). The difference between [dataBufferCapacity](data-buffer-capacity.md) and [dataSize](data-size.md) indicates the amount of room remaining in the underlying data buffer until more space needs to be allocated. |
| [dataPosition](data-position.md) | [common]<br>abstract val [dataPosition](data-position.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The current index position in the data buffer. Should never be more than [dataSize](data-size.md). |
| [dataRemaining](data-remaining.md) | [common]<br>open val [dataRemaining](data-remaining.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The remaining amount of data to be read ([dataSize](data-size.md) - [dataPosition](data-position.md)). |
| [dataSize](data-size.md) | [common]<br>abstract val [dataSize](data-size.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The total amount of data contained in this parcel. |
| [isRecycled](is-recycled.md) | [common]<br>abstract val [isRecycled](is-recycled.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Determines whether this [Parcel](index.md)s [recycle](recycle.md) function has been called already. A parcel object should not be used after it is recycled. |
