@file:Suppress("unused", "FunctionName")

package com.chrynan.parcelable.compose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.compose.runtime.Stable
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.SaverScope
import com.chrynan.parcelable.core.Parcelable
import com.chrynan.parcelable.core.decodeFromBundle
import com.chrynan.parcelable.core.encodeToBundle
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer

@Stable
@ExperimentalSerializationApi
internal class AndroidParcelableSaver<T>(
    private val parcelable: Parcelable = Parcelable.Default,
    private val serializer: KSerializer<T>
) : Saver<T, Bundle> {

    override fun SaverScope.save(value: T): Bundle = parcelable.encodeToBundle(value = value, serializer = serializer)

    override fun restore(value: Bundle): T = parcelable.decodeFromBundle(bundle = value, deserializer = serializer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AndroidParcelableSaver<*>) return false

        if (parcelable != other.parcelable) return false

        return serializer == other.serializer
    }

    override fun hashCode(): Int {
        var result = parcelable.hashCode()
        result = 31 * result + serializer.hashCode()
        return result
    }

    override fun toString(): String =
        "AndroidParcelableSaver(parcelable=$parcelable, serializer=$serializer)"
}

@SuppressLint("ComposableNaming")
@ExperimentalSerializationApi
internal actual fun <T : Any> InternalParcelableSaver(
    parcelable: Parcelable,
    serializer: KSerializer<T>
): Saver<T, *> =
    AndroidParcelableSaver(
        parcelable = parcelable,
        serializer = serializer
    )
