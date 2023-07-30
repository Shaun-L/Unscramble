package com.example.unscramble.presentation

import com.example.unscramble.domain.model.Word

data class WordListState(
    var isLoading: Boolean = false,
    var words: List<Word> = emptyList(),
    var error: String = ""
)
