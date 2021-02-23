//[parcelable-android](../index.md)/[com.chrynan.parcelable.android](index.md)/[decodeFromBundle](decode-from-bundle.md)



# decodeFromBundle  
[androidJvm]  
Content  
inline fun <[T](decode-from-bundle.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> [AndroidParceler](-android-parceler/index.md).[decodeFromBundle](decode-from-bundle.md)(bundle: [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html), flags: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0): [T](decode-from-bundle.md)?  
fun <[T](decode-from-bundle.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> Parcelable.[decodeFromBundle](decode-from-bundle.md)(bundle: [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html), kClass: [KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)<[T](decode-from-bundle.md)>, flags: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0): [T](decode-from-bundle.md)?  
inline fun <[T](decode-from-bundle.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> Parcelable.[decodeFromBundle](decode-from-bundle.md)(bundle: [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html), flags: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0): [T](decode-from-bundle.md)?  


[androidJvm]  
Content  
fun <[T](decode-from-bundle.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> [AndroidParceler](-android-parceler/index.md).[decodeFromBundle](decode-from-bundle.md)(bundle: [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html), kClass: [KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)<[T](decode-from-bundle.md)>, flags: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0): [T](decode-from-bundle.md)?  
More info  


Retrieves a value of [T](decode-from-bundle.md) of kClass from the provided bundle and flags, or null if the bundle is empty or

  



