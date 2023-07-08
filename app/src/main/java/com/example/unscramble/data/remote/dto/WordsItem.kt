package com.example.unscramble.data.remote.dto

import com.example.unscramble.domain.model.Word

data class WordsItem(
    val word: String
)

fun WordsItem.toWord() : Word {
    return Word(
        word = word
    )
}