@file:Suppress("unused")

package com.chrynan.parcelable.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState

expect interface Saver<Original, Saveable : Any> {

    fun SaverScope.save(value: Original): Saveable?

    fun restore(value: Saveable): Original?
}

expect fun interface SaverScope {

    fun canBeSaved(value: Any): Boolean
}

@Suppress("FunctionName")
expect fun <Original, Saveable : Any> Saver(
    save: SaverScope.(value: Original) -> Saveable?,
    restore: (value: Saveable) -> Original?
): Saver<Original, Saveable>

expect fun <T> autoSaver(): Saver<T, Any>

expect fun <Original, Saveable> listSaver(
    save: SaverScope.(value: Original) -> List<Saveable>,
    restore: (list: List<Saveable>) -> Original?
): Saver<Original, Any>

expect fun <T> mapSaver(
    save: SaverScope.(value: T) -> Map<String, Any?>,
    restore: (Map<String, Any?>) -> T?
): Saver<T, Any>

@Composable
internal expect fun <T : Any> internalRememberSaveable(
    vararg inputs: Any?,
    saver: Saver<T, out Any> = autoSaver(),
    key: String? = null,
    init: () -> T
): T

@Composable
internal expect fun <T> internalRememberSaveable(
    vararg inputs: Any?,
    stateSaver: Saver<T, out Any>,
    key: String? = null,
    init: () -> MutableState<T>
): MutableState<T>

@Composable
fun <T : Any> rememberSaveable(
    vararg inputs: Any?,
    saver: Saver<T, out Any> = autoSaver(),
    key: String? = null,
    init: () -> T
): T = internalRememberSaveable(inputs = inputs, saver = saver, key = key, init = init)

@Composable
fun <T> rememberSaveable(
    vararg inputs: Any?,
    stateSaver: Saver<T, out Any>,
    key: String? = null,
    init: () -> MutableState<T>
): MutableState<T> = internalRememberSaveable(inputs = inputs, stateSaver = stateSaver, key = key, init = init)
