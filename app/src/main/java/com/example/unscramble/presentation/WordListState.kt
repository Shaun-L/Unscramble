package com.example.unscramble.presentation

import com.example.unscramble.domain.model.Word

data class WordListState(
    val isLoading: Boolean = false,
    val words: List<Word> = emptyList(),
    val error: String = ""
)
