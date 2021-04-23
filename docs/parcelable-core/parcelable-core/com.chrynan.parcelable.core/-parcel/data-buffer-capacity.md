//[parcelable-core](../../../index.md)/[com.chrynan.parcelable.core](../index.md)/[Parcel](index.md)/[dataBufferCapacity](data-buffer-capacity.md)



# dataBufferCapacity  
[common]  
Content  
abstract val [dataBufferCapacity](data-buffer-capacity.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  
More info  


The total amount of space available in this parcel. This should always be greater than or equal to [dataSize](data-size.md). There may be more space available ([dataBufferCapacity](data-buffer-capacity.md)) in the underlying data buffer than there is data available ([dataSize](data-size.md)). The difference between [dataBufferCapacity](data-buffer-capacity.md) and [dataSize](data-size.md) indicates the amount of room remaining in the underlying data buffer until more space needs to be allocated.

  



