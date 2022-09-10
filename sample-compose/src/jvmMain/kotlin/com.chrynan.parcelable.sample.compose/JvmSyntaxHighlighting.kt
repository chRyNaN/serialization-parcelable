package com.chrynan.parcelable.sample.compose

import io.noties.prism4j.GrammarLocator
import io.noties.prism4j.Prism4j
import io.noties.prism4j.Prism4j.Token
import io.noties.prism4j.Prism4j.pattern
import io.noties.prism4j.Prism4j.token
import java.util.regex.Pattern.compile

val JsonGrammar.value
    get() = Prism4j.grammar(name, *JsonGrammar.Token.values().map { it.toPrism4jToken() }.toTypedArray())

val JsonGrammar.locator: GrammarLocator
    get() = object : GrammarLocator {
        override fun grammar(prism4j: Prism4j, language: String): Prism4j.Grammar? =
            when (language) {
                name -> JsonGrammar.value
                else -> null
            }

        override fun languages(): MutableSet<String> = mutableSetOf(name)
    }

private fun JsonGrammar.Token.toPrism4jToken(): Token =
    token(this.typeName, pattern(compile(this.regex, this.flags), this.lookBehind, this.greedy))
