# parcelable

Android Parceling support for the [Kotlinx Serialization library](https://github.com/Kotlin/kotlinx.serialization). \
![GitHub tag (latest SemVer)](https://img.shields.io/github/v/tag/chrynan/parcelable)

```kotlin
parcelable.encodeToBundle(myModel)
val myModel = parcelable.decodeFromBundle(bundle)
```

Now all the serialization can be handled from a single library, no need to create both custom Parcelers and Serializers.
Have a custom class that requires specific serialization? Use
the [Kotlinx Serialization library](https://github.com/Kotlin/kotlinx.serialization) and it will automatically work with
Android's `Parcel`.

## Building the library

The library is provided through [Bintray](https://bintray.com/). Checkout
the [releases page](https://github.com/chRyNaN/parcelable/releases) to get the latest version.

### Repository

```groovy
repositories {
    maven {
        url = uri("https://dl.bintray.com/chrynan/chrynan")
    }
}
```

### Dependency

```groovy
implementation "com.chrynan.parcelable:parcelable-android:$VERSION"
```

## Using the library

* Setup the `Parcelable` object:

```kotlin
val parcelable = Parcelable {
    serializersModule = mySerializersModule
}
```

* Use [Kotlinx Serialization](https://github.com/Kotlin/kotlinx.serialization) to serialize your model class:

```kotlin
@Serializable
data class MyModel(
    val intField: Int,
    val stringField: String,
    val nullableStringField: String? = null
)
```

* Pass your model through `Intents` and `Bundles`:

```kotlin
// Put
intent.putExtra(key, myModel, parcelable)
bundle.putParcelable(key, myModel, parcelable)

// Get
val myModel = intent.getParcelableExtra(key, parcelable)
val myModel = bundle.getParcelable(key, parcelable)
```

* Or serialize to and from `Parcels` and `Bundles`:

```kotlin
// To
parcelable.encodeToParcel(parcel, myModel)
val bundle = parcelable.encodeToBundle(myModel)

// From
val myModel = parcelable.decodeFromParcel(parcel)
val myModel = parcelable.decodeFromBundle(bundle)
```

## License

```
Copyright 2021 chRyNaN

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
