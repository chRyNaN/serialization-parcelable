package com.chrynan.parcelable.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.remember

public actual interface Saver<Original, Saveable : Any> {

    public actual fun SaverScope.save(value: Original): Saveable?

    public actual fun restore(value: Saveable): Original?
}

public actual fun interface SaverScope {

    public actual fun canBeSaved(value: Any): Boolean
}

public actual fun <Original, Saveable : Any> Saver(
    save: SaverScope.(value: Original) -> Saveable?,
    restore: (value: Saveable) -> Original?
): Saver<Original, Saveable> = object : Saver<Original, Saveable> {

    override fun SaverScope.save(value: Original): Saveable? {
        val scope = SaverScope { true }

        return scope.run { save(value) }
    }

    override fun restore(value: Saveable): Original? = restore(value)
}

public actual fun <T> autoSaver(): Saver<T, Any> =
    @Suppress("UNCHECKED_CAST")
    (AutoSaver as Saver<T, Any>)

private val AutoSaver = Saver<Any?, Any>(
    save = { it },
    restore = { it }
)

public actual fun <Original, Saveable> listSaver(
    save: SaverScope.(value: Original) -> List<Saveable>,
    restore: (list: List<Saveable>) -> Original?
): Saver<Original, Any> =
    @Suppress("UNCHECKED_CAST") Saver(
        save = {
            val list = save(it)
            for (index in list.indices) {
                val item = list[index]
                if (item != null) {
                    require(canBeSaved(item))
                }
            }
            if (list.isNotEmpty()) ArrayList(list) else null
        },
        restore = restore as (Any) -> Original?
    )

public actual fun <T> mapSaver(
    save: SaverScope.(value: T) -> Map<String, Any?>,
    restore: (Map<String, Any?>) -> T?
): Saver<T, Any> =
    listSaver(
        save = {
            mutableListOf<Any?>().apply {
                save(it).forEach { entry ->
                    add(entry.key)
                    add(entry.value)
                }
            }
        },
        restore = { list ->
            val map = mutableMapOf<String, Any?>()
            check(list.size.rem(2) == 0)
            var index = 0
            while (index < list.size) {
                val key = list[index] as String
                val value = list[index + 1]
                map[key] = value
                index += 2
            }
            restore(map)
        }
    )

@Composable
internal actual fun <T : Any> internalRememberSaveable(
    vararg inputs: Any?,
    saver: Saver<T, out Any>,
    key: String?,
    init: () -> T
): T = remember(inputs, key, init) // We currently just delegate to remember for iOs.

@Composable
internal actual fun <T> internalRememberSaveable(
    vararg inputs: Any?,
    stateSaver: Saver<T, out Any>,
    key: String?,
    init: () -> MutableState<T>
): MutableState<T> = remember(inputs, key, init) // We currently just delegate to remember for iOS.
