//[parcelable-core](../../../index.md)/[com.chrynan.parcelable.core](../index.md)/[Parcel](index.md)



# Parcel  
 [common] interface [Parcel](index.md) : [InputParcel](../-input-parcel/index.md), [OutputParcel](../-output-parcel/index.md)

An interface representing a component that has the ability for primitive types to be written to and read from it.



Note that this is not meant to represent a persistent storage component. Instead, [Parcel](index.md)s are short-lived and meant to transfer data between different components and processes.



Note that this is based off of the Android Parcel component.

   


## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.parcelable.core/Parcel///PointingToDeclaration/"></a>| <a name="com.chrynan.parcelable.core/Parcel///PointingToDeclaration/"></a><br><br>[Android Parcel](https://developer.android.com/reference/android/os/Parcel)<br><br>|
  


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.parcelable.core/InputParcel/readBoolean/#/PointingToDeclaration/"></a>[readBoolean](../-input-parcel/read-boolean.md)| <a name="com.chrynan.parcelable.core/InputParcel/readBoolean/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [readBoolean](../-input-parcel/read-boolean.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Retrieves a [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) from the Parcel at the current data position.  <br><br><br>|
| <a name="com.chrynan.parcelable.core/InputParcel/readByte/#/PointingToDeclaration/"></a>[readByte](../-input-parcel/read-byte.md)| <a name="com.chrynan.parcelable.core/InputParcel/readByte/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [readByte](../-input-parcel/read-byte.md)(): [Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)  <br>More info  <br>Retrieves a [Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html) from the Parcel at the current data position.  <br><br><br>|
| <a name="com.chrynan.parcelable.core/InputParcel/readChar/#/PointingToDeclaration/"></a>[readChar](../-input-parcel/read-char.md)| <a name="com.chrynan.parcelable.core/InputParcel/readChar/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [readChar](../-input-parcel/read-char.md)(): [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)  <br>More info  <br>Retrieves a [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) from the Parcel at the current data position.  <br><br><br>|
| <a name="com.chrynan.parcelable.core/InputParcel/readDouble/#/PointingToDeclaration/"></a>[readDouble](../-input-parcel/read-double.md)| <a name="com.chrynan.parcelable.core/InputParcel/readDouble/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [readDouble](../-input-parcel/read-double.md)(): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)  <br>More info  <br>Retrieves a [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) from the Parcel at the current data position.  <br><br><br>|
| <a name="com.chrynan.parcelable.core/InputParcel/readFloat/#/PointingToDeclaration/"></a>[readFloat](../-input-parcel/read-float.md)| <a name="com.chrynan.parcelable.core/InputParcel/readFloat/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [readFloat](../-input-parcel/read-float.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  <br>More info  <br>Retrieves a [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) from the Parcel at the current data position.  <br><br><br>|
| <a name="com.chrynan.parcelable.core/InputParcel/readInt/#/PointingToDeclaration/"></a>[readInt](../-input-parcel/read-int.md)| <a name="com.chrynan.parcelable.core/InputParcel/readInt/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [readInt](../-input-parcel/read-int.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br>More info  <br>Retrieves a [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) from the Parcel at the current data position.  <br><br><br>|
| <a name="com.chrynan.parcelable.core/InputParcel/readLong/#/PointingToDeclaration/"></a>[readLong](../-input-parcel/read-long.md)| <a name="com.chrynan.parcelable.core/InputParcel/readLong/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [readLong](../-input-parcel/read-long.md)(): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)  <br>More info  <br>Retrieves a [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) from the Parcel at the current data position.  <br><br><br>|
| <a name="com.chrynan.parcelable.core/InputParcel/readShort/#/PointingToDeclaration/"></a>[readShort](../-input-parcel/read-short.md)| <a name="com.chrynan.parcelable.core/InputParcel/readShort/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [readShort](../-input-parcel/read-short.md)(): [Short](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html)  <br>More info  <br>Retrieves a [Short](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html) from the Parcel at the current data position.  <br><br><br>|
| <a name="com.chrynan.parcelable.core/InputParcel/readString/#/PointingToDeclaration/"></a>[readString](../-input-parcel/read-string.md)| <a name="com.chrynan.parcelable.core/InputParcel/readString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [readString](../-input-parcel/read-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br>More info  <br>Retrieves a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) from the Parcel at the current data position.  <br><br><br>|
| <a name="com.chrynan.parcelable.core/Parcel/recycle/#/PointingToDeclaration/"></a>[recycle](recycle.md)| <a name="com.chrynan.parcelable.core/Parcel/recycle/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [recycle](recycle.md)()  <br>More info  <br>Puts this parcel object back into the pool, removing it's data.  <br><br><br>|
| <a name="com.chrynan.parcelable.core/OutputParcel/writeBoolean/#kotlin.Boolean/PointingToDeclaration/"></a>[writeBoolean](../-output-parcel/write-boolean.md)| <a name="com.chrynan.parcelable.core/OutputParcel/writeBoolean/#kotlin.Boolean/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [writeBoolean](../-output-parcel/write-boolean.md)(value: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))  <br>More info  <br>Writes the [Boolean](../-output-parcel/write-boolean.md) to the Parcel at the current data position.  <br><br><br>|
| <a name="com.chrynan.parcelable.core/OutputParcel/writeByte/#kotlin.Byte/PointingToDeclaration/"></a>[writeByte](../-output-parcel/write-byte.md)| <a name="com.chrynan.parcelable.core/OutputParcel/writeByte/#kotlin.Byte/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [writeByte](../-output-parcel/write-byte.md)(value: [Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html))  <br>More info  <br>Writes the [Byte](../-output-parcel/write-byte.md) to the Parcel at the current data position.  <br><br><br>|
| <a name="com.chrynan.parcelable.core/OutputParcel/writeChar/#kotlin.Char/PointingToDeclaration/"></a>[writeChar](../-output-parcel/write-char.md)| <a name="com.chrynan.parcelable.core/OutputParcel/writeChar/#kotlin.Char/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [writeChar](../-output-parcel/write-char.md)(value: [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html))  <br>More info  <br>Writes the [Char](../-output-parcel/write-char.md) to the Parcel at the current data position.  <br><br><br>|
| <a name="com.chrynan.parcelable.core/OutputParcel/writeDouble/#kotlin.Double/PointingToDeclaration/"></a>[writeDouble](../-output-parcel/write-double.md)| <a name="com.chrynan.parcelable.core/OutputParcel/writeDouble/#kotlin.Double/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [writeDouble](../-output-parcel/write-double.md)(value: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html))  <br>More info  <br>Writes the [Double](../-output-parcel/write-double.md) to the Parcel at the current data position.  <br><br><br>|
| <a name="com.chrynan.parcelable.core/OutputParcel/writeFloat/#kotlin.Float/PointingToDeclaration/"></a>[writeFloat](../-output-parcel/write-float.md)| <a name="com.chrynan.parcelable.core/OutputParcel/writeFloat/#kotlin.Float/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [writeFloat](../-output-parcel/write-float.md)(value: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))  <br>More info  <br>Writes the [Float](../-output-parcel/write-float.md) to the Parcel at the current data position.  <br><br><br>|
| <a name="com.chrynan.parcelable.core/OutputParcel/writeInt/#kotlin.Int/PointingToDeclaration/"></a>[writeInt](../-output-parcel/write-int.md)| <a name="com.chrynan.parcelable.core/OutputParcel/writeInt/#kotlin.Int/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [writeInt](../-output-parcel/write-int.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br>More info  <br>Writes the [Int](../-output-parcel/write-int.md) to the Parcel at the current data position.  <br><br><br>|
| <a name="com.chrynan.parcelable.core/OutputParcel/writeLong/#kotlin.Long/PointingToDeclaration/"></a>[writeLong](../-output-parcel/write-long.md)| <a name="com.chrynan.parcelable.core/OutputParcel/writeLong/#kotlin.Long/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [writeLong](../-output-parcel/write-long.md)(value: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html))  <br>More info  <br>Writes the [Long](../-output-parcel/write-long.md) to the Parcel at the current data position.  <br><br><br>|
| <a name="com.chrynan.parcelable.core/OutputParcel/writeShort/#kotlin.Short/PointingToDeclaration/"></a>[writeShort](../-output-parcel/write-short.md)| <a name="com.chrynan.parcelable.core/OutputParcel/writeShort/#kotlin.Short/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [writeShort](../-output-parcel/write-short.md)(value: [Short](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html))  <br>More info  <br>Writes the [Short](../-output-parcel/write-short.md) to the Parcel at the current data position.  <br><br><br>|
| <a name="com.chrynan.parcelable.core/OutputParcel/writeString/#kotlin.String/PointingToDeclaration/"></a>[writeString](../-output-parcel/write-string.md)| <a name="com.chrynan.parcelable.core/OutputParcel/writeString/#kotlin.String/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [writeString](../-output-parcel/write-string.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>More info  <br>Writes the [String](../-output-parcel/write-string.md) to the Parcel at the current data position.  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.parcelable.core/Parcel/dataBufferCapacity/#/PointingToDeclaration/"></a>[dataBufferCapacity](data-buffer-capacity.md)| <a name="com.chrynan.parcelable.core/Parcel/dataBufferCapacity/#/PointingToDeclaration/"></a> [common] abstract val [dataBufferCapacity](data-buffer-capacity.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)The total amount of space available in this parcel.   <br>|
| <a name="com.chrynan.parcelable.core/Parcel/dataPosition/#/PointingToDeclaration/"></a>[dataPosition](data-position.md)| <a name="com.chrynan.parcelable.core/Parcel/dataPosition/#/PointingToDeclaration/"></a> [common] abstract val [dataPosition](data-position.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)The current index position in the data buffer.   <br>|
| <a name="com.chrynan.parcelable.core/Parcel/dataRemaining/#/PointingToDeclaration/"></a>[dataRemaining](data-remaining.md)| <a name="com.chrynan.parcelable.core/Parcel/dataRemaining/#/PointingToDeclaration/"></a> [common] open val [dataRemaining](data-remaining.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)The remaining amount of data to be read ([dataSize](data-size.md) - [dataPosition](data-position.md)).   <br>|
| <a name="com.chrynan.parcelable.core/Parcel/dataSize/#/PointingToDeclaration/"></a>[dataSize](data-size.md)| <a name="com.chrynan.parcelable.core/Parcel/dataSize/#/PointingToDeclaration/"></a> [common] abstract val [dataSize](data-size.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)The total amount of data contained in this parcel.   <br>|
