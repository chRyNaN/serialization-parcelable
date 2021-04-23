//[parcelable-core](../../index.md)/[com.chrynan.parcelable.core](index.md)/[Parcelable](-parcelable.md)



# Parcelable  
[common]  
Content  
fun [Parcelable](-parcelable.md)(from: [Parcelable](-parcelable/index.md) = Parcelable.Default, builderAction: [ParcelableConfigurationBuilder](-parcelable-configuration-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Parcelable](-parcelable/index.md)  
More info  


Creates a custom [Parcelable](-parcelable/index.md) implementation using the provided [from](-parcelable/index.md) as a base for the configuration and the provided [builderAction](-parcelable.md) function to override those configuration values.



#### Return  


A [Parcelable.Custom](-parcelable/-custom/index.md) instance using the provided configuration values.



## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.parcelable.core//Parcelable/#com.chrynan.parcelable.core.Parcelable#kotlin.Function1[com.chrynan.parcelable.core.ParcelableConfigurationBuilder,kotlin.Unit]/PointingToDeclaration/"></a>from| <a name="com.chrynan.parcelable.core//Parcelable/#com.chrynan.parcelable.core.Parcelable#kotlin.Function1[com.chrynan.parcelable.core.ParcelableConfigurationBuilder,kotlin.Unit]/PointingToDeclaration/"></a><br><br>The default [Parcelable](-parcelable/index.md) whose configuration values will be used as defaults. This parameter defaults to [Parcelable.Default](-parcelable/-default/index.md).<br><br>|
| <a name="com.chrynan.parcelable.core//Parcelable/#com.chrynan.parcelable.core.Parcelable#kotlin.Function1[com.chrynan.parcelable.core.ParcelableConfigurationBuilder,kotlin.Unit]/PointingToDeclaration/"></a>builderAction| <a name="com.chrynan.parcelable.core//Parcelable/#com.chrynan.parcelable.core.Parcelable#kotlin.Function1[com.chrynan.parcelable.core.ParcelableConfigurationBuilder,kotlin.Unit]/PointingToDeclaration/"></a><br><br>The function used to provide custom [ParcelableConfiguration](-parcelable-configuration/index.md) values for this instance being created.<br><br>|
  
  



