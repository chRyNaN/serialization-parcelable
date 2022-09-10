package com.chrynan.parcelable.sample.compose

object JsonGrammar {

    val name = "json"

    private const val CASE_INSENSITIVE = 0x02

    enum class Token(
        val typeName: String,
        val regex: String,
        val flags: Int,
        val lookBehind: Boolean = false,
        val greedy: Boolean = false
    ) {

        PROPERTY(typeName = "property", regex = "\"(?:\\\\.|[^\\\\\"\\r\\n])*\"(?=\\s*:)", flags = 0),
        STRING(typeName = "string", regex = "\"(?:\\\\.|[^\\\\\"\\r\\n])*\"(?!\\s*:)", flags = 0, greedy = true),
        NUMBER(
            typeName = "number",
            regex = "\\b0x[\\dA-Fa-f]+\\b|(?:\\b\\d+\\.?\\d*|\\B\\.\\d+)(?:[Ee][+-]?\\d+)?",
            flags = 0
        ),
        BOOLEAN(typeName = "boolean", regex = "\\b(?:true|false)\\b", CASE_INSENSITIVE),
        NULL(typeName = "null", regex = "\\bnull\\b", flags = CASE_INSENSITIVE),
        PUNCTUATION(typeName = "punctuation", regex = "[{}\\[\\]);,]", flags = 0),
        OPERATOR(typeName = "operator", regex = ":", flags = 0);

        companion object {

            fun getByTypeName(typeName: String): Token? =
                values().firstOrNull { it.typeName.equals(typeName, ignoreCase = true) }
        }
    }
}
