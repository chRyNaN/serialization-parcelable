@file:Suppress("unused")

package com.chrynan.parcelable.sample.android

import android.widget.TextView
import io.noties.markwon.syntax.Prism4jSyntaxHighlight
import io.noties.markwon.syntax.Prism4jThemeDarkula
import io.noties.prism4j.Prism4j
import kotlinx.serialization.SerializationStrategy

fun <T> TextView.setJsonText(serializer: SerializationStrategy<T>, model: T?) {
    val jsonText = if (model != null) {
        val jsonString = SerializerUtils.json.encodeToString(serializer, model)
        // TODO Update to use Markdown Library
        jsonString
    } else {
        "null"
    }

    setJsonSyntaxHighlightedText(jsonText)
}

fun TextView.setJsonSyntaxHighlightedText(text: String) {
    val syntaxHighlighter = getJsonSyntaxHighlighter()

    val formattedText = syntaxHighlighter.highlight("json", text)

    setText(formattedText)
}

fun TextView.setKotlinSyntaxHighlightedText(text: String) {
    val syntaxHighlighter = getKotlinSyntaxHighlighter()

    val formattedText = syntaxHighlighter.highlight("json", text)

    setText(formattedText)
}

private fun getJsonSyntaxHighlighter(): Prism4jSyntaxHighlight {
    val prism = Prism4j(JsonSyntaxHighlightGrammarLocator())
    val prismTheme = Prism4jThemeDarkula.create()

    val highlighter = Prism4jSyntaxHighlight.create(prism, prismTheme)

    prism.grammar("json")

    return highlighter
}

private fun getKotlinSyntaxHighlighter(): Prism4jSyntaxHighlight {
    val prism = Prism4j(KotlinSyntaxHighlightGrammarLocator())
    val prismTheme = Prism4jThemeDarkula.create()

    val highlighter = Prism4jSyntaxHighlight.create(prism, prismTheme)

    prism.grammar("kotlin")

    return highlighter
}
