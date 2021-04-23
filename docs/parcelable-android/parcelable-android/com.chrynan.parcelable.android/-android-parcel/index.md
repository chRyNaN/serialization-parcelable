//[parcelable-android](../../../index.md)/[com.chrynan.parcelable.android](../index.md)/[AndroidParcel](index.md)



# AndroidParcel  
 [androidJvm] class [AndroidParcel](index.md)(**parcel**: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html)) : [Parcel](../../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/index.md)

An Android implementation of the [Parcel](../../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/index.md) interface. This class wraps the provided [android.os.Parcel](../../../../parcelable-android/com.chrynan.parcelable.android/-android-parcel/parcel.md) and delegates the reading and writing to it.



Note that this class should not be confused with the [android.os.Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html). Instead, this class wraps that class and implements the [Parcel](../../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/index.md) interface of this library.

   


## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.chrynan.parcelable.android/AndroidParcel///PointingToDeclaration/"></a>[com.chrynan.parcelable.core.Parcel](../../../../parcelable-core/parcelable-core/com.chrynan.parcelable.core/-parcel/index.md)| <a name="com.chrynan.parcelable.android/AndroidParcel///PointingToDeclaration/"></a>|
| <a name="com.chrynan.parcelable.android/AndroidParcel///PointingToDeclaration/"></a>[android.os.Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html)| <a name="com.chrynan.parcelable.android/AndroidParcel///PointingToDeclaration/"></a>|
  


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.parcelable.android/AndroidParcel/AndroidParcel/#android.os.Parcel/PointingToDeclaration/"></a>[AndroidParcel](-android-parcel.md)| <a name="com.chrynan.parcelable.android/AndroidParcel/AndroidParcel/#android.os.Parcel/PointingToDeclaration/"></a> [androidJvm] fun [AndroidParcel](-android-parcel.md)(parcel: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html))   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.parcelable.android/AndroidParcel/readBoolean/#/PointingToDeclaration/"></a>[readBoolean](read-boolean.md)| <a name="com.chrynan.parcelable.android/AndroidParcel/readBoolean/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [readBoolean](read-boolean.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>|
| <a name="com.chrynan.parcelable.android/AndroidParcel/readByte/#/PointingToDeclaration/"></a>[readByte](read-byte.md)| <a name="com.chrynan.parcelable.android/AndroidParcel/readByte/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [readByte](read-byte.md)(): [Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)  <br><br><br>|
| <a name="com.chrynan.parcelable.android/AndroidParcel/readChar/#/PointingToDeclaration/"></a>[readChar](read-char.md)| <a name="com.chrynan.parcelable.android/AndroidParcel/readChar/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [readChar](read-char.md)(): [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)  <br><br><br>|
| <a name="com.chrynan.parcelable.android/AndroidParcel/readDouble/#/PointingToDeclaration/"></a>[readDouble](read-double.md)| <a name="com.chrynan.parcelable.android/AndroidParcel/readDouble/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [readDouble](read-double.md)(): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)  <br><br><br>|
| <a name="com.chrynan.parcelable.android/AndroidParcel/readFloat/#/PointingToDeclaration/"></a>[readFloat](read-float.md)| <a name="com.chrynan.parcelable.android/AndroidParcel/readFloat/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [readFloat](read-float.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  <br><br><br>|
| <a name="com.chrynan.parcelable.android/AndroidParcel/readInt/#/PointingToDeclaration/"></a>[readInt](read-int.md)| <a name="com.chrynan.parcelable.android/AndroidParcel/readInt/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [readInt](read-int.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>|
| <a name="com.chrynan.parcelable.android/AndroidParcel/readLong/#/PointingToDeclaration/"></a>[readLong](read-long.md)| <a name="com.chrynan.parcelable.android/AndroidParcel/readLong/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [readLong](read-long.md)(): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)  <br><br><br>|
| <a name="com.chrynan.parcelable.android/AndroidParcel/readShort/#/PointingToDeclaration/"></a>[readShort](read-short.md)| <a name="com.chrynan.parcelable.android/AndroidParcel/readShort/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [readShort](read-short.md)(): [Short](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html)  <br><br><br>|
| <a name="com.chrynan.parcelable.android/AndroidParcel/readString/#/PointingToDeclaration/"></a>[readString](read-string.md)| <a name="com.chrynan.parcelable.android/AndroidParcel/readString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [readString](read-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>|
| <a name="com.chrynan.parcelable.android/AndroidParcel/recycle/#/PointingToDeclaration/"></a>[recycle](recycle.md)| <a name="com.chrynan.parcelable.android/AndroidParcel/recycle/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [recycle](recycle.md)()  <br><br><br>|
| <a name="com.chrynan.parcelable.android/AndroidParcel/writeBoolean/#kotlin.Boolean/PointingToDeclaration/"></a>[writeBoolean](write-boolean.md)| <a name="com.chrynan.parcelable.android/AndroidParcel/writeBoolean/#kotlin.Boolean/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [writeBoolean](write-boolean.md)(value: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))  <br><br><br>|
| <a name="com.chrynan.parcelable.android/AndroidParcel/writeByte/#kotlin.Byte/PointingToDeclaration/"></a>[writeByte](write-byte.md)| <a name="com.chrynan.parcelable.android/AndroidParcel/writeByte/#kotlin.Byte/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [writeByte](write-byte.md)(value: [Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html))  <br><br><br>|
| <a name="com.chrynan.parcelable.android/AndroidParcel/writeChar/#kotlin.Char/PointingToDeclaration/"></a>[writeChar](write-char.md)| <a name="com.chrynan.parcelable.android/AndroidParcel/writeChar/#kotlin.Char/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [writeChar](write-char.md)(value: [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html))  <br><br><br>|
| <a name="com.chrynan.parcelable.android/AndroidParcel/writeDouble/#kotlin.Double/PointingToDeclaration/"></a>[writeDouble](write-double.md)| <a name="com.chrynan.parcelable.android/AndroidParcel/writeDouble/#kotlin.Double/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [writeDouble](write-double.md)(value: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html))  <br><br><br>|
| <a name="com.chrynan.parcelable.android/AndroidParcel/writeFloat/#kotlin.Float/PointingToDeclaration/"></a>[writeFloat](write-float.md)| <a name="com.chrynan.parcelable.android/AndroidParcel/writeFloat/#kotlin.Float/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [writeFloat](write-float.md)(value: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))  <br><br><br>|
| <a name="com.chrynan.parcelable.android/AndroidParcel/writeInt/#kotlin.Int/PointingToDeclaration/"></a>[writeInt](write-int.md)| <a name="com.chrynan.parcelable.android/AndroidParcel/writeInt/#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [writeInt](write-int.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>|
| <a name="com.chrynan.parcelable.android/AndroidParcel/writeLong/#kotlin.Long/PointingToDeclaration/"></a>[writeLong](write-long.md)| <a name="com.chrynan.parcelable.android/AndroidParcel/writeLong/#kotlin.Long/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [writeLong](write-long.md)(value: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html))  <br><br><br>|
| <a name="com.chrynan.parcelable.android/AndroidParcel/writeShort/#kotlin.Short/PointingToDeclaration/"></a>[writeShort](write-short.md)| <a name="com.chrynan.parcelable.android/AndroidParcel/writeShort/#kotlin.Short/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [writeShort](write-short.md)(value: [Short](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html))  <br><br><br>|
| <a name="com.chrynan.parcelable.android/AndroidParcel/writeString/#kotlin.String/PointingToDeclaration/"></a>[writeString](write-string.md)| <a name="com.chrynan.parcelable.android/AndroidParcel/writeString/#kotlin.String/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [writeString](write-string.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.parcelable.android/AndroidParcel/dataBufferCapacity/#/PointingToDeclaration/"></a>[dataBufferCapacity](data-buffer-capacity.md)| <a name="com.chrynan.parcelable.android/AndroidParcel/dataBufferCapacity/#/PointingToDeclaration/"></a> [androidJvm] open override val [dataBufferCapacity](data-buffer-capacity.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)   <br>|
| <a name="com.chrynan.parcelable.android/AndroidParcel/dataPosition/#/PointingToDeclaration/"></a>[dataPosition](data-position.md)| <a name="com.chrynan.parcelable.android/AndroidParcel/dataPosition/#/PointingToDeclaration/"></a> [androidJvm] open override val [dataPosition](data-position.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)   <br>|
| <a name="com.chrynan.parcelable.android/AndroidParcel/dataRemaining/#/PointingToDeclaration/"></a>[dataRemaining](index.md#%5Bcom.chrynan.parcelable.android%2FAndroidParcel%2FdataRemaining%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1463452149)| <a name="com.chrynan.parcelable.android/AndroidParcel/dataRemaining/#/PointingToDeclaration/"></a> [androidJvm] open val [dataRemaining](index.md#%5Bcom.chrynan.parcelable.android%2FAndroidParcel%2FdataRemaining%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1463452149): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)   <br>|
| <a name="com.chrynan.parcelable.android/AndroidParcel/dataSize/#/PointingToDeclaration/"></a>[dataSize](data-size.md)| <a name="com.chrynan.parcelable.android/AndroidParcel/dataSize/#/PointingToDeclaration/"></a> [androidJvm] open override val [dataSize](data-size.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)   <br>|

