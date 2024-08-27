@file:Suppress("unused")

package com.chrynan.parcelable.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState

public actual typealias Saver<Original, Saveable> = androidx.compose.runtime.saveable.Saver<Original, Saveable>

public actual typealias SaverScope = androidx.compose.runtime.saveable.SaverScope

public actual fun <Original, Saveable : Any> Saver(
    save: SaverScope.(value: Original) -> Saveable?,
    restore: (value: Saveable) -> Original?
): Saver<Original, Saveable> = androidx.compose.runtime.saveable.Saver(save = save, restore = restore)

public actual fun <T> autoSaver(): Saver<T, Any> = androidx.compose.runtime.saveable.autoSaver()

public actual fun <Original, Saveable> listSaver(
    save: SaverScope.(value: Original) -> List<Saveable>,
    restore: (list: List<Saveable>) -> Original?
): Saver<Original, Any> = androidx.compose.runtime.saveable.listSaver(save = save, restore = restore)

public actual fun <T> mapSaver(
    save: SaverScope.(value: T) -> Map<String, Any?>,
    restore: (Map<String, Any?>) -> T?
): Saver<T, Any> = androidx.compose.runtime.saveable.mapSaver(save = save, restore = restore)

@Composable
internal actual fun <T : Any> internalRememberSaveable(
    vararg inputs: Any?,
    saver: Saver<T, out Any>,
    key: String?,
    init: () -> T
): T = androidx.compose.runtime.saveable.rememberSaveable(inputs = inputs, saver = saver, key = key, init = init)

@Composable
internal actual fun <T> internalRememberSaveable(
    vararg inputs: Any?,
    stateSaver: Saver<T, out Any>,
    key: String?,
    init: () -> MutableState<T>
): MutableState<T> =
    androidx.compose.runtime.saveable.rememberSaveable(inputs = inputs, stateSaver = stateSaver, key = key, init = init)
