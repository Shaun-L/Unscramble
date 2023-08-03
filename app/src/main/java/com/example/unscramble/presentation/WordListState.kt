package com.example.unscramble.presentation

import com.example.unscramble.common.Resource
import com.example.unscramble.domain.model.Word

sealed class WordListState {
    object Loading : WordListState()
    object Success : WordListState()
    data class Error(val message: String) : WordListState()
}
