package com.chrynan.parcelable.sample.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.Json
import kotlinx.serialization.serializer

expect fun AnnotatedString.Builder.appendJsonText(text: String, colors: JsonColors)

@Composable
inline fun <reified Model : Any> JsonText(
    value: Model,
    modifier: Modifier = Modifier,
    serializer: KSerializer<Model> = serializer(),
    json: Json = Json.Default,
    colors: JsonColors = JsonColors(),
    style: TextStyle = MaterialTheme.typography.body1
) {
    val jsonText = remember { json.encodeToString(serializer = serializer, value = value) }
    val annotatedString = buildAnnotatedString { appendJsonText(text = jsonText, colors = colors) }

    Box(modifier = modifier) {
        Text(
            modifier = Modifier.matchParentSize(),
            text = annotatedString,
            style = style
        )
    }
}

@Stable
interface JsonColors {

    val backgroundColor: Color
    val booleanColor: Color
    val nullColor: Color
    val stringColor: Color
    val numberColor: Color
    val propertyColor: Color
    val operatorColor: Color
    val punctuationColor: Color
}

@Composable
fun JsonColors(
    backgroundColor: Color = ColorPalette.background,
    booleanColor: Color = ColorPalette.orange,
    nullColor: Color = ColorPalette.orange,
    stringColor: Color = ColorPalette.green,
    numberColor: Color = ColorPalette.cyan,
    propertyColor: Color = ColorPalette.purple,
    operatorColor: Color = ColorPalette.foreground,
    punctuationColor: Color = ColorPalette.foreground
): JsonColors =
    JsonColorsImpl(
        backgroundColor = backgroundColor,
        booleanColor = booleanColor,
        nullColor = nullColor,
        stringColor = stringColor,
        numberColor = numberColor,
        propertyColor = propertyColor,
        operatorColor = operatorColor,
        punctuationColor = punctuationColor
    )

@Stable
internal class JsonColorsImpl(
    override val backgroundColor: Color,
    override val booleanColor: Color,
    override val nullColor: Color,
    override val stringColor: Color,
    override val numberColor: Color,
    override val propertyColor: Color,
    override val operatorColor: Color,
    override val punctuationColor: Color
) : JsonColors {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JsonColors) return false

        other as JsonColorsImpl

        if (backgroundColor != other.backgroundColor) return false
        if (booleanColor != other.booleanColor) return false
        if (nullColor != other.nullColor) return false
        if (stringColor != other.stringColor) return false
        if (numberColor != other.numberColor) return false
        if (propertyColor != other.propertyColor) return false
        if (operatorColor != other.operatorColor) return false
        if (punctuationColor != other.punctuationColor) return false

        return true
    }

    override fun hashCode(): Int {
        var result = booleanColor.hashCode()

        result = 31 * result + backgroundColor.hashCode()
        result = 31 * result + nullColor.hashCode()
        result = 31 * result + stringColor.hashCode()
        result = 31 * result + numberColor.hashCode()
        result = 31 * result + propertyColor.hashCode()
        result = 31 * result + operatorColor.hashCode()
        result = 31 * result + punctuationColor.hashCode()

        return result
    }

    override fun toString(): String =
        "JsonColorsImpl(" +
                "backgroundColor=$backgroundColor, " +
                "booleanColor=$booleanColor, " +
                "nullColor=$nullColor, " +
                "stringColor=$stringColor, " +
                "numberColor=$numberColor, " +
                "propertyColor=$propertyColor, " +
                "operatorColor=$operatorColor, " +
                "punctuationColor=$punctuationColor)"
}
