package com.chrynan.parcelable.compose

import com.chrynan.parcelable.core.Parcel
import com.chrynan.parcelable.core.Parcelable
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer

@ExperimentalSerializationApi
internal class JsParcelableSaver<T>(
    private val parcelable: Parcelable = Parcelable.Default,
    private val serializer: KSerializer<T>
) : Saver<T, ByteArray> {

    override fun SaverScope.save(value: T): ByteArray {
        val parcel = Parcel()

        parcelable.encodeToParcel(parcel = parcel, serializer = serializer, value = value)

        return parcel.toByteArray()
    }

    override fun restore(value: ByteArray): T? {
        val parcel = Parcel(value)

        return parcelable.decodeFromParcel(parcel = parcel, deserializer = serializer)
    }
}

@Suppress("FunctionName")
@ExperimentalSerializationApi
internal actual fun <T : Any> InternalParcelableSaver(
    parcelable: Parcelable,
    serializer: KSerializer<T>
): Saver<T, *> =
    JsParcelableSaver(
        parcelable = parcelable,
        serializer = serializer
    )
