package com.example.unscramble.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.unscramble.data.db.WordListDatabase
import com.example.unscramble.domain.model.UnscrambleModel
import com.example.unscramble.domain.model.WordSection
import com.example.unscramble.unused.WordListRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class WordListViewModel(
   private val fullWordList: WordListDatabase
) : ViewModel() {
    private var unscrambleModel = UnscrambleModel()

    var validAllWords : MutableList<String> = mutableListOf()
    var valid2Words = WordSection("2 Letter Words", mutableListOf(), 2)
    var valid3Words = WordSection("3 Letter Words", mutableListOf(), 3)
    var valid4Words = WordSection("4 Letter Words", mutableListOf(), 4)
    var valid5Words = WordSection("5 Letter Words", mutableListOf(), 5)
    var valid6Words = WordSection("6 Letter Words", mutableListOf(), 6)
    var valid7Words = WordSection("7 Letter Words", mutableListOf(), 7)
    var valid8Words = WordSection("8 Letter Words", mutableListOf(), 8)
    var valid9Words = WordSection("9 Letter Words", mutableListOf(), 9)
    var valid10Words = WordSection("10 Letter Words", mutableListOf(), 10)
    var valid11Words = WordSection("11 Letter Words", mutableListOf(), 11)
    var valid12Words = WordSection("12 Letter Words", mutableListOf(), 12)
    var valid13Words = WordSection("13 Letter Words", mutableListOf(), 13)
    var valid14Words = WordSection("14 Letter Words", mutableListOf(), 14)
    var valid15Words = WordSection("15 Letter Words", mutableListOf(), 15)






    private fun getValid2Words(input: String) {
        val dictionary = unscrambleModel.createDictionary(fullWordList.all2LetterWords)
        valid2Words.words = unscrambleModel.generatePermutations(input, dictionary)
    }

    private fun getValid3Words(input: String) {
        if(input.length >= 3) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all3LetterWords)
            valid3Words.words = unscrambleModel.generatePermutations(input, dictionary)
        }
    }

    private fun getValid4Words(input: String) {
        if(input.length >= 4) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all4LetterWords)
            valid4Words.words = unscrambleModel.generatePermutations(input, dictionary)
        }
    }
    private fun getValid5Words(input: String) {
        if(input.length >= 5) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all5LetterWords)
            valid5Words.words = unscrambleModel.generatePermutations(input, dictionary)
        }
    }
    private fun getValid6Words(input: String) {
        if(input.length >= 6) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all6LetterWords)
            valid6Words.words = unscrambleModel.generatePermutations(input, dictionary)
        }
    }
    private fun getValid7Words(input: String) {
        if(input.length >= 7) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all7LetterWords)
            valid7Words.words = unscrambleModel.generatePermutations(input, dictionary)
            }
    }
    private fun getValid8Words(input: String) {
        if(input.length >= 7) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all8LetterWords)
            valid8Words.words = unscrambleModel.generatePermutations(input, dictionary)
        }
    }
    private fun getValid9Words(input: String) {
        if(input.length >= 9) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all9LetterWords)
            valid9Words.words = unscrambleModel.generatePermutations(input, dictionary)
        }
    }
    private fun getValid10Words(input: String) {
        if(input.length >= 10) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all10LetterWords)
            valid10Words.words = unscrambleModel.generatePermutations(input, dictionary)
        }
    }

    private fun getValid11Words(input: String) {
        if(input.length >= 11) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all11LetterWords)
            valid11Words.words = unscrambleModel.generatePermutations(input, dictionary)
        }
    }
    private fun getValid12Words(input: String) {
        if(input.length >= 12) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all12LetterWords)
            valid12Words.words = unscrambleModel.generatePermutations(input, dictionary)
        }
    }
    private fun getValid13Words(input: String) {
        if(input.length >= 13) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all13LetterWords)
            valid13Words.words = unscrambleModel.generatePermutations(input, dictionary)
        }
    }
    private fun getValid14Words(input: String) {
        if(input.length >= 14) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all14LetterWords)
            valid14Words.words = unscrambleModel.generatePermutations(input, dictionary)
        }
    }
    private fun getValid15Words(input: String) {
        if(input.length == 15) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all15LetterWords)
            valid15Words.words = unscrambleModel.generatePermutations(input, dictionary)
        }
    }

    fun clearWordList() {
        validAllWords.clear()
        valid2Words.words.clear()
        valid3Words.words.clear()
        valid4Words.words.clear()
        valid5Words.words.clear()
        valid6Words.words.clear()
        valid7Words.words.clear()
        valid8Words.words.clear()
        valid9Words.words.clear()
        valid10Words.words.clear()
        valid11Words.words.clear()
        valid12Words.words.clear()
        valid13Words.words.clear()
        valid14Words.words.clear()
        valid15Words.words.clear()


    }

    fun getAllValidWords(input: String) {
        viewModelScope.launch{
            getValid2Words(input)
        }
        viewModelScope.launch{
            getValid3Words(input)
        }
        viewModelScope.launch{
            getValid4Words(input)
        }
        viewModelScope.launch{
            getValid5Words(input)
        }
        viewModelScope.launch{
            getValid6Words(input)
        }
        viewModelScope.launch{
            getValid7Words(input)
        }
        viewModelScope.launch{
            getValid8Words(input)
        }
        viewModelScope.launch{
            getValid9Words(input)
        }
        viewModelScope.launch{
            getValid10Words(input)
        }
        viewModelScope.launch{
            getValid11Words(input)
        }
        viewModelScope.launch{
            getValid12Words(input)
        }
        viewModelScope.launch{
            getValid13Words(input)
        }
        viewModelScope.launch{
            getValid14Words(input)
        }
        viewModelScope.launch{
            getValid15Words(input)
        }
    }

    fun returnAllValidWords() {
        validAllWords += valid2Words.words
        validAllWords += valid3Words.words
        validAllWords += valid4Words.words
        validAllWords += valid5Words.words
        validAllWords += valid6Words.words
        validAllWords += valid7Words.words
        validAllWords += valid8Words.words
        validAllWords += valid9Words.words
        validAllWords += valid10Words.words
        validAllWords += valid11Words.words
        validAllWords += valid12Words.words
        validAllWords += valid13Words.words
        validAllWords += valid14Words.words
        validAllWords += valid15Words.words
    }





}