//[parcelable-core](../../index.md)/[com.chrynan.parcelable.core](../index.md)/[OutputParcel](index.md)



# OutputParcel  
 [common] interface [OutputParcel](index.md)

An interface that provides a way to write to a basic output source. This interface provides the writing functionality of the [Parcel](../-parcel/index.md) interface.

   


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../-parcelable-configuration-builder/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F2047750252)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator fun [equals](../-parcelable-configuration-builder/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F2047750252)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../-parcelable-configuration-builder/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F2047750252)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [hashCode](../-parcelable-configuration-builder/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F2047750252)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../-parcelable-configuration-builder/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F2047750252)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [toString](../-parcelable-configuration-builder/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F2047750252)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.chrynan.parcelable.core/OutputParcel/writeBoolean/#kotlin.Boolean/PointingToDeclaration/"></a>[writeBoolean](write-boolean.md)| <a name="com.chrynan.parcelable.core/OutputParcel/writeBoolean/#kotlin.Boolean/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [writeBoolean](write-boolean.md)(value: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))  <br>More info  <br>Writes the Boolean to the Parcel at the current data position.  <br><br><br>
| <a name="com.chrynan.parcelable.core/OutputParcel/writeByte/#kotlin.Byte/PointingToDeclaration/"></a>[writeByte](write-byte.md)| <a name="com.chrynan.parcelable.core/OutputParcel/writeByte/#kotlin.Byte/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [writeByte](write-byte.md)(value: [Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html))  <br>More info  <br>Writes the Byte to the Parcel at the current data position.  <br><br><br>
| <a name="com.chrynan.parcelable.core/OutputParcel/writeChar/#kotlin.Char/PointingToDeclaration/"></a>[writeChar](write-char.md)| <a name="com.chrynan.parcelable.core/OutputParcel/writeChar/#kotlin.Char/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [writeChar](write-char.md)(value: [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html))  <br>More info  <br>Writes the Char to the Parcel at the current data position.  <br><br><br>
| <a name="com.chrynan.parcelable.core/OutputParcel/writeDouble/#kotlin.Double/PointingToDeclaration/"></a>[writeDouble](write-double.md)| <a name="com.chrynan.parcelable.core/OutputParcel/writeDouble/#kotlin.Double/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [writeDouble](write-double.md)(value: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html))  <br>More info  <br>Writes the Double to the Parcel at the current data position.  <br><br><br>
| <a name="com.chrynan.parcelable.core/OutputParcel/writeFloat/#kotlin.Float/PointingToDeclaration/"></a>[writeFloat](write-float.md)| <a name="com.chrynan.parcelable.core/OutputParcel/writeFloat/#kotlin.Float/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [writeFloat](write-float.md)(value: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))  <br>More info  <br>Writes the Float to the Parcel at the current data position.  <br><br><br>
| <a name="com.chrynan.parcelable.core/OutputParcel/writeInt/#kotlin.Int/PointingToDeclaration/"></a>[writeInt](write-int.md)| <a name="com.chrynan.parcelable.core/OutputParcel/writeInt/#kotlin.Int/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [writeInt](write-int.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br>More info  <br>Writes the Int to the Parcel at the current data position.  <br><br><br>
| <a name="com.chrynan.parcelable.core/OutputParcel/writeLong/#kotlin.Long/PointingToDeclaration/"></a>[writeLong](write-long.md)| <a name="com.chrynan.parcelable.core/OutputParcel/writeLong/#kotlin.Long/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [writeLong](write-long.md)(value: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html))  <br>More info  <br>Writes the Long to the Parcel at the current data position.  <br><br><br>
| <a name="com.chrynan.parcelable.core/OutputParcel/writeShort/#kotlin.Short/PointingToDeclaration/"></a>[writeShort](write-short.md)| <a name="com.chrynan.parcelable.core/OutputParcel/writeShort/#kotlin.Short/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [writeShort](write-short.md)(value: [Short](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html))  <br>More info  <br>Writes the Short to the Parcel at the current data position.  <br><br><br>
| <a name="com.chrynan.parcelable.core/OutputParcel/writeString/#kotlin.String/PointingToDeclaration/"></a>[writeString](write-string.md)| <a name="com.chrynan.parcelable.core/OutputParcel/writeString/#kotlin.String/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [writeString](write-string.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>More info  <br>Writes the String to the Parcel at the current data position.  <br><br><br>


## Inheritors  
  
|  Name| 
|---|
| <a name="com.chrynan.parcelable.core/Parcel///PointingToDeclaration/"></a>[Parcel](../-parcel/index.md)

