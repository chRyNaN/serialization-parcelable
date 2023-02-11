//[parcelable-core](../../../index.md)/[com.chrynan.parcelable.core](../index.md)/[InvalidParcelValueException](index.md)

# InvalidParcelValueException

[common]\
class [InvalidParcelValueException](index.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : SerializationException

An exception that is thrown when an unexpected [Parcel](../-parcel/index.md) value was retrieved or stored.

For instance, if we expect an [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) but we got a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), this exception will be thrown.

## Constructors

| | |
|---|---|
| [InvalidParcelValueException](-invalid-parcel-value-exception.md) | [common]<br>fun [InvalidParcelValueException](-invalid-parcel-value-exception.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
