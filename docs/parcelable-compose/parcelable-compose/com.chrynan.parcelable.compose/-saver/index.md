//[parcelable-compose](../../../index.md)/[com.chrynan.parcelable.compose](../index.md)/[Saver](index.md)

# Saver

[common]\
expect interface [Saver](index.md)&lt;[Original](index.md), [Saveable](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;

[js]\
actual interface [Saver](index.md)&lt;[Original](index.md), [Saveable](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;

[android, jvm]\
actual typealias [Saver](index.md) = [Saver](https://developer.android.com/reference/kotlin/androidx/compose/runtime/saveable/Saver.html)&lt;[Original](index.md), [Saveable](index.md)&gt;

## Functions

| Name | Summary |
|---|---|
| [restore](restore.md) | [common, js]<br>[common]<br>expect abstract fun [restore](restore.md)(value: [Saveable](index.md)): [Original](index.md)?<br>[js]<br>actual abstract fun [restore](restore.md)(value: [Saveable](index.md)): [Original](index.md)? |
| [save](save.md) | [common, js]<br>[common]<br>expect abstract fun [SaverScope](../-saver-scope/index.md).[save](save.md)(value: [Original](index.md)): [Saveable](index.md)?<br>[js]<br>actual abstract fun [SaverScope](../-saver-scope/index.md).[save](save.md)(value: [Original](index.md)): [Saveable](index.md)? |
