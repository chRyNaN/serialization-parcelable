//[parcelable-core](../../../index.md)/[com.chrynan.parcelable.core](../index.md)/[Parcelable](index.md)



# Parcelable  
 [common] sealed class [Parcelable](index.md) : SerialFormat

Represents the serialization format for [ParcelEncoder](../-parcel-encoder/index.md)s and [ParcelDecoder](../-parcel-decoder/index.md)s. This is analogous to the Json class for the JSON serialization format.



Note that this is not to be confused with the Android Parcelable interface. However, there is some overlap, and hence the same name, as the Android Parcelable interface provides a means of serializing data between different components and processes, this [Parcelable](index.md) interface performs a similar task. Though they way they perform their tasks differs.

   


## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.parcelable.core/Parcelable///PointingToDeclaration/"></a>| <a name="com.chrynan.parcelable.core/Parcelable///PointingToDeclaration/"></a><br><br>[Android Parcelable (not the same)](https://developer.android.com/reference/android/os/Parcelable))<br><br>|
  


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.parcelable.core/Parcelable.Custom///PointingToDeclaration/"></a>[Custom](-custom/index.md)| <a name="com.chrynan.parcelable.core/Parcelable.Custom///PointingToDeclaration/"></a>[common]  <br>Content  <br>class [Custom](-custom/index.md) : [Parcelable](index.md)  <br>More info  <br>A custom [Parcelable](index.md) implementation using the provided [configuration](../../../../parcelable-core/com.chrynan.parcelable.core/-parcelable/-custom/configuration.md) values.  <br><br><br>|
| <a name="com.chrynan.parcelable.core/Parcelable.Default///PointingToDeclaration/"></a>[Default](-default/index.md)| <a name="com.chrynan.parcelable.core/Parcelable.Default///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Default](-default/index.md) : [Parcelable](index.md)  <br>More info  <br>The default [Parcelable](index.md) implementation using the default [ParcelableConfiguration](../-parcelable-configuration/index.md) values.  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.parcelable.core/Parcelable/decodeFromParcel/#com.chrynan.parcelable.core.Parcel#kotlinx.serialization.DeserializationStrategy[TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[decodeFromParcel](decode-from-parcel.md)| <a name="com.chrynan.parcelable.core/Parcelable/decodeFromParcel/#com.chrynan.parcelable.core.Parcel#kotlinx.serialization.DeserializationStrategy[TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun <[T](decode-from-parcel.md)> [decodeFromParcel](decode-from-parcel.md)(parcel: [Parcel](../-parcel/index.md), deserializer: DeserializationStrategy<[T](decode-from-parcel.md)>): [T](decode-from-parcel.md)  <br>More info  <br>Decodes the value of [T](decode-from-parcel.md) from the provided [parcel](decode-from-parcel.md) using the provided [deserializer](decode-from-parcel.md).  <br><br><br>|
| <a name="com.chrynan.parcelable.core/Parcelable/encodeToParcel/#com.chrynan.parcelable.core.Parcel#kotlinx.serialization.SerializationStrategy[TypeParam(bounds=[kotlin.Any?])]#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[encodeToParcel](encode-to-parcel.md)| <a name="com.chrynan.parcelable.core/Parcelable/encodeToParcel/#com.chrynan.parcelable.core.Parcel#kotlinx.serialization.SerializationStrategy[TypeParam(bounds=[kotlin.Any?])]#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun <[T](encode-to-parcel.md)> [encodeToParcel](encode-to-parcel.md)(parcel: [Parcel](../-parcel/index.md), serializer: SerializationStrategy<[T](encode-to-parcel.md)>, value: [T](encode-to-parcel.md)): [Parcel](../-parcel/index.md)  <br>More info  <br>Encodes the provided [value](encode-to-parcel.md) to the provided [parcel](encode-to-parcel.md) using the provided [serializer](encode-to-parcel.md).  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.parcelable.core/Parcelable/serializersModule/#/PointingToDeclaration/"></a>[serializersModule](serializers-module.md)| <a name="com.chrynan.parcelable.core/Parcelable/serializersModule/#/PointingToDeclaration/"></a> [common] open override val [serializersModule](serializers-module.md): SerializersModule   <br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="com.chrynan.parcelable.core/Parcelable.Default///PointingToDeclaration/"></a>[Parcelable](-default/index.md)|
| <a name="com.chrynan.parcelable.core/Parcelable.Custom///PointingToDeclaration/"></a>[Parcelable](-custom/index.md)|


## Extensions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.parcelable.core//decodeFromParcel/com.chrynan.parcelable.core.Parcelable#com.chrynan.parcelable.core.Parcel/PointingToDeclaration/"></a>[decodeFromParcel](../decode-from-parcel.md)| <a name="com.chrynan.parcelable.core//decodeFromParcel/com.chrynan.parcelable.core.Parcelable#com.chrynan.parcelable.core.Parcel/PointingToDeclaration/"></a>[common]  <br>Content  <br>inline fun <[T](../decode-from-parcel.md)> [Parcelable](index.md).[decodeFromParcel](../decode-from-parcel.md)(parcel: [Parcel](../-parcel/index.md)): [T](../decode-from-parcel.md)  <br>More info  <br>A convenience function to [Parcelable.decodeFromParcel](decode-from-parcel.md) that retrieves the deserializer from the [Parcelable.serializersModule](serializers-module.md).  <br><br><br>|
| <a name="com.chrynan.parcelable.core//encodeToParcel/com.chrynan.parcelable.core.Parcelable#com.chrynan.parcelable.core.Parcel#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[encodeToParcel](../encode-to-parcel.md)| <a name="com.chrynan.parcelable.core//encodeToParcel/com.chrynan.parcelable.core.Parcelable#com.chrynan.parcelable.core.Parcel#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[common]  <br>Content  <br>inline fun <[T](../encode-to-parcel.md)> [Parcelable](index.md).[encodeToParcel](../encode-to-parcel.md)(parcel: [Parcel](../-parcel/index.md), value: [T](../encode-to-parcel.md)): [Parcel](../-parcel/index.md)  <br>More info  <br>A convenience function to [Parcelable.encodeToParcel](encode-to-parcel.md) that retrieves the serializer from the [Parcelable.serializersModule](serializers-module.md).  <br><br><br>|

