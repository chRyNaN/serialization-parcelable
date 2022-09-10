package com.chrynan.parcelable.sample.compose

import androidx.compose.foundation.background
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun App() {
    MaterialTheme(colors = darculaColors) {
        Surface(modifier = Modifier.background(MaterialTheme.colors.background)) {
            MainView()
        }
    }
}
