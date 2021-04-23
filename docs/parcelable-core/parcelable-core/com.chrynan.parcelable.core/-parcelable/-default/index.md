//[parcelable-core](../../../../index.md)/[com.chrynan.parcelable.core](../../index.md)/[Parcelable](../index.md)/[Default](index.md)



# Default  
 [common] object [Default](index.md) : [Parcelable](../index.md)

The default [Parcelable](../index.md) implementation using the default [ParcelableConfiguration](../../-parcelable-configuration/index.md) values. This class can be used when no custom configuration is needed.

   


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.parcelable.core/Parcelable/decodeFromParcel/#com.chrynan.parcelable.core.Parcel#kotlinx.serialization.DeserializationStrategy[TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[decodeFromParcel](../decode-from-parcel.md)| <a name="com.chrynan.parcelable.core/Parcelable/decodeFromParcel/#com.chrynan.parcelable.core.Parcel#kotlinx.serialization.DeserializationStrategy[TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun <[T](../decode-from-parcel.md)> [decodeFromParcel](../decode-from-parcel.md)(parcel: [Parcel](../../-parcel/index.md), deserializer: DeserializationStrategy<[T](../decode-from-parcel.md)>): [T](../decode-from-parcel.md)  <br>More info  <br>Decodes the value of [T](../decode-from-parcel.md) from the provided [parcel](../decode-from-parcel.md) using the provided [deserializer](../decode-from-parcel.md).  <br><br><br>|
| <a name="com.chrynan.parcelable.core/Parcelable/encodeToParcel/#com.chrynan.parcelable.core.Parcel#kotlinx.serialization.SerializationStrategy[TypeParam(bounds=[kotlin.Any?])]#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[encodeToParcel](../encode-to-parcel.md)| <a name="com.chrynan.parcelable.core/Parcelable/encodeToParcel/#com.chrynan.parcelable.core.Parcel#kotlinx.serialization.SerializationStrategy[TypeParam(bounds=[kotlin.Any?])]#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun <[T](../encode-to-parcel.md)> [encodeToParcel](../encode-to-parcel.md)(parcel: [Parcel](../../-parcel/index.md), serializer: SerializationStrategy<[T](../encode-to-parcel.md)>, value: [T](../encode-to-parcel.md)): [Parcel](../../-parcel/index.md)  <br>More info  <br>Encodes the provided [value](../encode-to-parcel.md) to the provided [parcel](../encode-to-parcel.md) using the provided [serializer](../encode-to-parcel.md).  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.parcelable.core/Parcelable.Default/serializersModule/#/PointingToDeclaration/"></a>[serializersModule](index.md#%5Bcom.chrynan.parcelable.core%2FParcelable.Default%2FserializersModule%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F609466861)| <a name="com.chrynan.parcelable.core/Parcelable.Default/serializersModule/#/PointingToDeclaration/"></a> [common] open override val [serializersModule](index.md#%5Bcom.chrynan.parcelable.core%2FParcelable.Default%2FserializersModule%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F609466861): SerializersModule   <br>|

