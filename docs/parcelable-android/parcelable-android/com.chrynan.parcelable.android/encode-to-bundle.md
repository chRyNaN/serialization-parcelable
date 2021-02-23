//[parcelable-android](../index.md)/[com.chrynan.parcelable.android](index.md)/[encodeToBundle](encode-to-bundle.md)



# encodeToBundle  
[androidJvm]  
Content  
inline fun <[T](encode-to-bundle.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> [AndroidParceler](-android-parceler/index.md).[encodeToBundle](encode-to-bundle.md)(value: [T](encode-to-bundle.md)): [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html)  
fun <[T](encode-to-bundle.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> Parcelable.[encodeToBundle](encode-to-bundle.md)(value: [T](encode-to-bundle.md), kClass: [KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)<[T](encode-to-bundle.md)>): [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html)  
inline fun <[T](encode-to-bundle.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> Parcelable.[encodeToBundle](encode-to-bundle.md)(value: [T](encode-to-bundle.md)): [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html)  


[androidJvm]  
Content  
fun <[T](encode-to-bundle.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> [AndroidParceler](-android-parceler/index.md).[encodeToBundle](encode-to-bundle.md)(value: [T](encode-to-bundle.md), kClass: [KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)<[T](encode-to-bundle.md)>): [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html)  
More info  


Writes the provide value of kClass into a [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html) and returns it. The returned [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html) can then be used as extras in [Intent](https://developer.android.com/reference/kotlin/android/content/Intent.html)s or other [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html)s.

  



