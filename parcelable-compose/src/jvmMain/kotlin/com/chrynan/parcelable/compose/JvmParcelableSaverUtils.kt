@file:Suppress("unused", "FunctionName")

package com.chrynan.parcelable.compose

import androidx.compose.runtime.Stable
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.SaverScope
import com.chrynan.parcelable.core.Parcel
import com.chrynan.parcelable.core.Parcelable
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer

@Stable
@ExperimentalSerializationApi
internal class JvmParcelableSaver<T>(
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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JvmParcelableSaver<*>) return false

        if (parcelable != other.parcelable) return false
        if (serializer != other.serializer) return false

        return true
    }

    override fun hashCode(): Int {
        var result = parcelable.hashCode()
        result = 31 * result + serializer.hashCode()
        return result
    }

    override fun toString(): String =
        "JvmParcelableSaver(parcelable=$parcelable, serializer=$serializer)"
}

@ExperimentalSerializationApi
internal actual fun <T : Any> InternalParcelableSaver(
    parcelable: Parcelable,
    serializer: KSerializer<T>
): Saver<T, *> =
    JvmParcelableSaver(
        parcelable = parcelable,
        serializer = serializer
    )
