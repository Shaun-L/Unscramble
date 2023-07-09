package com.example.unscramble.presentation

import com.example.unscramble.domain.model.UnscrambleModel
import com.example.unscramble.domain.model.Word
import com.example.unscramble.domain.repository.WordListRepository

class WordListViewModel(
    private val unscrambleModel: UnscrambleModel,
    private val wordListRepository: WordListRepository


) {
    suspend fun getValidWords(
        wordList: List<Word>,
        input: String,
        unscrambleModel: UnscrambleModel
    ): List<String> {
        val dictionary = unscrambleModel.createDictionary(wordList)
        return unscrambleModel.generatePermutations(input,dictionary)
    }



}