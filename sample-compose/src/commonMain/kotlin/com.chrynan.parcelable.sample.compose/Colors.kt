@file:Suppress("unused")

package com.chrynan.parcelable.sample.compose

import androidx.compose.material.darkColors
import androidx.compose.ui.graphics.Color

object ColorPalette {

    val background = Color(0xff282a36)
    val currentLine = Color(0xff44475a)
    val foreground = Color(0xfff8f8f2)
    val comment = Color(0xff6272a4)
    val cyan = Color(0xff8be9fd)
    val green = Color(0xff50fa7b)
    val orange = Color(0xffffb86c)
    val pink = Color(0xffff79c6)
    val purple = Color(0xffbd93f9)
    val red = Color(0xffff5555)
    val yellow = Color(0xfff1fa8c)
}

val darculaColors = darkColors(
    primary = ColorPalette.currentLine,
    primaryVariant = ColorPalette.comment,
    onPrimary = ColorPalette.foreground,
    secondary = ColorPalette.green,
    secondaryVariant = ColorPalette.cyan,
    onSecondary = ColorPalette.background,
    background = ColorPalette.background,
    onBackground = ColorPalette.foreground,
    error = ColorPalette.red,
    onError = ColorPalette.foreground
)
