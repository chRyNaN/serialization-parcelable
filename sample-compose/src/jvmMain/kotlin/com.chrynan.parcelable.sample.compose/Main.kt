package com.chrynan.parcelable.sample.compose

import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication

fun main() = singleWindowApplication(
    title = "sample-compose",
    state = WindowState(width = 1280.dp, height = 768.dp),
    transparent = false
) {
    App()
}
