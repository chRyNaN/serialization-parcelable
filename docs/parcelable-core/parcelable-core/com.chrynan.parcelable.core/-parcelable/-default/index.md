//[parcelable-core](../../../index.md)/[com.chrynan.parcelable.core](../../index.md)/[Parcelable](../index.md)/[Default](index.md)



# Default  
 [common] object [Default](index.md) : [Parcelable](../index.md)

The default [Parcelable](../index.md) implementation using the default [ParcelableConfiguration](../../-parcelable-configuration/index.md) values. This class can be used when no custom configuration is needed.

   


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.chrynan.parcelable.core/Parcelable/decodeFromParcel/#com.chrynan.parcelable.core.Parcel#kotlinx.serialization.DeserializationStrategy[TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[decodeFromParcel](../decode-from-parcel.md)| <a name="com.chrynan.parcelable.core/Parcelable/decodeFromParcel/#com.chrynan.parcelable.core.Parcel#kotlinx.serialization.DeserializationStrategy[TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun <[T](../decode-from-parcel.md)> [decodeFromParcel](../decode-from-parcel.md)(parcel: [Parcel](../../-parcel/index.md), deserializer: DeserializationStrategy<[T](../decode-from-parcel.md)>): [T](../decode-from-parcel.md)  <br>More info  <br>Decodes the value of [T](../decode-from-parcel.md) from the provided parcel using the provided deserializer.  <br><br><br>
| <a name="com.chrynan.parcelable.core/Parcelable/encodeToParcel/#com.chrynan.parcelable.core.Parcel#kotlinx.serialization.SerializationStrategy[TypeParam(bounds=[kotlin.Any?])]#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[encodeToParcel](../encode-to-parcel.md)| <a name="com.chrynan.parcelable.core/Parcelable/encodeToParcel/#com.chrynan.parcelable.core.Parcel#kotlinx.serialization.SerializationStrategy[TypeParam(bounds=[kotlin.Any?])]#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun <[T](../encode-to-parcel.md)> [encodeToParcel](../encode-to-parcel.md)(parcel: [Parcel](../../-parcel/index.md), serializer: SerializationStrategy<[T](../encode-to-parcel.md)>, value: [T](../encode-to-parcel.md)): [Parcel](../../-parcel/index.md)  <br>More info  <br>Encodes the provided value to the provided parcel using the provided serializer.  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../-parcelable-configuration-builder/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F2047750252)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator fun [equals](../../-parcelable-configuration-builder/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F2047750252)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../-parcelable-configuration-builder/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F2047750252)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [hashCode](../../-parcelable-configuration-builder/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F2047750252)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../-parcelable-configuration-builder/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F2047750252)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [toString](../../-parcelable-configuration-builder/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F2047750252)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.chrynan.parcelable.core/Parcelable.Default/serializersModule/#/PointingToDeclaration/"></a>[serializersModule](index.md#%5Bcom.chrynan.parcelable.core%2FParcelable.Default%2FserializersModule%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F2047750252)| <a name="com.chrynan.parcelable.core/Parcelable.Default/serializersModule/#/PointingToDeclaration/"></a> [common] open override val [serializersModule](index.md#%5Bcom.chrynan.parcelable.core%2FParcelable.Default%2FserializersModule%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F2047750252): SerializersModule   <br>

