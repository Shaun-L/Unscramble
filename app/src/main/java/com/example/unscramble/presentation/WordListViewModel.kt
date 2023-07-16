package com.example.unscramble.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.unscramble.data.db.WordListDatabase
import com.example.unscramble.domain.model.UnscrambleModel
import com.example.unscramble.unused.WordListRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class WordListViewModel(
   private val fullWordList: WordListDatabase
) : ViewModel() {
    private var unscrambleModel = UnscrambleModel()

    var validAllWords : MutableList<String> = mutableListOf()
    private var valid2Words : MutableList<String> = mutableListOf()
    private var valid3Words : MutableList<String> = mutableListOf()
    private var valid4Words : MutableList<String> = mutableListOf()
    private var valid5Words : MutableList<String> = mutableListOf()
    private var valid6Words : MutableList<String> = mutableListOf()
    private var valid7Words : MutableList<String> = mutableListOf()
    private var valid8Words : MutableList<String> = mutableListOf()
    private var valid9Words : MutableList<String> = mutableListOf()
    private var valid10Words : MutableList<String> = mutableListOf()
    private var valid11Words : MutableList<String> = mutableListOf()
    private var valid12Words : MutableList<String> = mutableListOf()
    private var valid13Words : MutableList<String> = mutableListOf()
    private var valid14Words : MutableList<String> = mutableListOf()
    private var valid15Words : MutableList<String> = mutableListOf()






    private fun getValid2Words(input: String) {
        val dictionary = unscrambleModel.createDictionary(fullWordList.all2LetterWords)
        valid2Words = unscrambleModel.generatePermutations(input, dictionary)
    }

    private fun getValid3Words(input: String) {
        if(input.length >= 3) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all3LetterWords)
            valid3Words = unscrambleModel.generatePermutations(input, dictionary)
        }
    }

    private fun getValid4Words(input: String) {
        if(input.length >= 4) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all4LetterWords)
            valid4Words = unscrambleModel.generatePermutations(input, dictionary)
        }
    }
    private fun getValid5Words(input: String) {
        if(input.length >= 5) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all5LetterWords)
            valid5Words = unscrambleModel.generatePermutations(input, dictionary)
        }
    }
    private fun getValid6Words(input: String) {
        if(input.length >= 6) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all6LetterWords)
            valid6Words = unscrambleModel.generatePermutations(input, dictionary)
        }
    }
    private fun getValid7Words(input: String) {
        if(input.length >= 7) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all7LetterWords)
            valid7Words = unscrambleModel.generatePermutations(input, dictionary)
            }
    }
    private fun getValid8Words(input: String) {
        if(input.length >= 7) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all8LetterWords)
            valid8Words = unscrambleModel.generatePermutations(input, dictionary)
        }
    }
    private fun getValid9Words(input: String) {
        if(input.length >= 9) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all9LetterWords)
            valid9Words = unscrambleModel.generatePermutations(input, dictionary)
        }
    }
    private fun getValid10Words(input: String) {
        if(input.length >= 10) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all10LetterWords)
            valid10Words = unscrambleModel.generatePermutations(input, dictionary)
        }
    }

    private fun getValid11Words(input: String) {
        if(input.length >= 11) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all11LetterWords)
            valid11Words = unscrambleModel.generatePermutations(input, dictionary)
        }
    }
    private fun getValid12Words(input: String) {
        if(input.length >= 12) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all12LetterWords)
            valid12Words = unscrambleModel.generatePermutations(input, dictionary)
        }
    }
    private fun getValid13Words(input: String) {
        if(input.length >= 13) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all13LetterWords)
            valid13Words = unscrambleModel.generatePermutations(input, dictionary)
        }
    }
    private fun getValid14Words(input: String) {
        if(input.length >= 14) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all14LetterWords)
            valid14Words = unscrambleModel.generatePermutations(input, dictionary)
        }
    }
    private fun getValid15Words(input: String) {
        if(input.length == 15) {
            val dictionary = unscrambleModel.createDictionary(fullWordList.all15LetterWords)
            valid15Words = unscrambleModel.generatePermutations(input, dictionary)
        }
    }

    fun clearWordList() {
        validAllWords.clear()
        valid2Words.clear()
        valid3Words.clear()
        valid4Words.clear()
        valid5Words.clear()
        valid6Words.clear()
        valid7Words.clear()
        valid8Words.clear()
        valid9Words.clear()
        valid10Words.clear()
        valid11Words.clear()
        valid12Words.clear()
        valid13Words.clear()
        valid14Words.clear()
        valid15Words.clear()


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
        validAllWords += valid2Words
        validAllWords += valid3Words
        validAllWords += valid4Words
        validAllWords += valid5Words
        validAllWords += valid6Words
        validAllWords += valid7Words
        validAllWords += valid8Words
        validAllWords += valid9Words
        validAllWords += valid10Words
        validAllWords += valid11Words
        validAllWords += valid12Words
        validAllWords += valid13Words
        validAllWords += valid14Words
        validAllWords += valid15Words
    }





}