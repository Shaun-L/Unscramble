package com.example.unscramble.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.unscramble.data.db.WordListDatabase

class WordListViewModelFactory(
    private val wordLibrary: WordListDatabase
):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(WordListViewModel::class.java))
        {
            return WordListViewModel(wordLibrary) as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }
}