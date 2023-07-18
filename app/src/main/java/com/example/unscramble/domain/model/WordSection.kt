package com.example.unscramble.domain.model

data class WordSection(
    val header: String,
    var words: MutableList<String>,
    val wordLength: Int
)
