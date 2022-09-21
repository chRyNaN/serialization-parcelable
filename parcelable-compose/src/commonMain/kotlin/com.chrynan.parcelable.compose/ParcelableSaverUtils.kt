@file:Suppress("FunctionName", "unused")

package com.chrynan.parcelable.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import com.chrynan.parcelable.core.Parcelable
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer

@ExperimentalSerializationApi
internal expect fun <T> InternalParcelableSaver(
    parcelable: Parcelable = Parcelable.Default,
    serializer: KSerializer<T>
): Saver<T, *>

/**
 * Creates a [Saver] that uses the provided [parcelable] and [serializer] to save and restore the value.
 */
@ExperimentalSerializationApi
fun <T> ParcelableSaver(
    parcelable: Parcelable = Parcelable.Default,
    serializer: KSerializer<T>
): Saver<T, *> = InternalParcelableSaver(
    parcelable = parcelable,
    serializer = serializer
)

/**
 * Calls [rememberSaveable] using a [ParcelableSaver] created using the provided [parcelable] and [serializer].
 */
@Composable
@ExperimentalSerializationApi
fun <T : Any> rememberSavable(
    vararg inputs: Any?,
    parcelable: Parcelable = Parcelable.Default,
    serializer: KSerializer<T>,
    key: String? = null,
    init: () -> T
): T {
    val saver = ParcelableSaver(parcelable = parcelable, serializer = serializer)

    return rememberSaveable(saver = saver, key = key, init = init, inputs = inputs)
}

/**
 * Calls [rememberSaveable] using a [ParcelableSaver] created using the provided [parcelable] and [serializer].
 */
@Composable
@ExperimentalSerializationApi
fun <T> rememberSaveable(
    vararg inputs: Any?,
    parcelable: Parcelable = Parcelable.Default,
    serializer: KSerializer<T>,
    key: String? = null,
    init: () -> MutableState<T>
): MutableState<T> {
    val saver = ParcelableSaver(parcelable = parcelable, serializer = serializer)

    return rememberSaveable(stateSaver = saver, key = key, init = init, inputs = inputs)
}
