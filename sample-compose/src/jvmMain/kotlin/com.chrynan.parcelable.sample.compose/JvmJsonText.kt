@file:Suppress("unused")

package com.chrynan.parcelable.sample.compose

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import io.noties.prism4j.AbsVisitor
import io.noties.prism4j.Prism4j

actual fun AnnotatedString.Builder.appendJsonText(
    text: String,
    colors: JsonColors
) {
    val builder = this
    val prism4j = Prism4j(JsonGrammar.locator)
    val nodes = prism4j.tokenize(text, JsonGrammar.value)
    val visitor = object : AbsVisitor() {

        override fun visitText(text: Prism4j.Text) {
            builder.append(text.literal())
        }

        override fun visitSyntax(syntax: Prism4j.Syntax) {
            when (JsonGrammar.Token.getByTypeName(typeName = syntax.type())) {
                JsonGrammar.Token.BOOLEAN -> builder.pushStyle(SpanStyle(color = colors.booleanColor))
                JsonGrammar.Token.OPERATOR -> builder.pushStyle(SpanStyle(color = colors.operatorColor))
                JsonGrammar.Token.PUNCTUATION -> builder.pushStyle(SpanStyle(color = colors.punctuationColor))
                JsonGrammar.Token.STRING -> builder.pushStyle(SpanStyle(color = colors.stringColor))
                JsonGrammar.Token.NUMBER -> builder.pushStyle(SpanStyle(color = colors.numberColor))
                JsonGrammar.Token.PROPERTY -> builder.pushStyle(SpanStyle())
                JsonGrammar.Token.NULL -> builder.pushStyle(SpanStyle(color = colors.nullColor))
                else -> {}
            }

            visit(syntax.children())

            builder.pop()
        }
    }

    visitor.visit(nodes)
}
