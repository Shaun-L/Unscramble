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

    var validAllWords : MutableLiveData<MutableList<String>?> = MutableLiveData()
    private var valid2Words : MutableLiveData<MutableList<String>?> = MutableLiveData()
    private var valid3Words : MutableLiveData<MutableList<String>?> = MutableLiveData()
    private var valid4Words : MutableLiveData<MutableList<String>?> = MutableLiveData()
    private var valid5Words : MutableLiveData<MutableList<String>?> = MutableLiveData()
    private var valid6Words : MutableLiveData<MutableList<String>?> = MutableLiveData()
    private var valid7Words : MutableLiveData<MutableList<String>?> = MutableLiveData()
    private var valid8Words : MutableLiveData<MutableList<String>?> = MutableLiveData()
    private var valid9Words : MutableLiveData<MutableList<String>?> = MutableLiveData()
    private var valid10Words : MutableLiveData<MutableList<String>?> = MutableLiveData()
    private var valid11Words : MutableLiveData<MutableList<String>?> = MutableLiveData()
    private var valid12Words : MutableLiveData<MutableList<String>?> = MutableLiveData()
    private var valid13Words : MutableLiveData<MutableList<String>?> = MutableLiveData()
    private var valid14Words : MutableLiveData<MutableList<String>?> = MutableLiveData()
    private var valid15Words : MutableLiveData<MutableList<String>?> = MutableLiveData()






    private suspend fun getValid2Words(input: String) {
        viewModelScope.launch {
            var result : MutableList<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(fullWordList.all2LetterWords)
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid2Words.value = result
        }
    }

    private suspend fun getValid3Words(input: String) {
        viewModelScope.launch {
            var result : MutableList<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(fullWordList.all3LetterWords)
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid3Words.value = result
        }
    }

    private suspend fun getValid4Words(input: String) {
        viewModelScope.launch {
            var result : MutableList<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(fullWordList.all4LetterWords)
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid4Words.value = result
        }
    }
    private suspend fun getValid5Words(input: String) {
        viewModelScope.launch {
            var result : MutableList<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(fullWordList.all5LetterWords)
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid5Words.value = result
        }
    }
    private suspend fun getValid6Words(input: String) {
        viewModelScope.launch {
            var result : MutableList<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(fullWordList.all6LetterWords)
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid6Words.value = result
        }
    }
    private suspend fun getValid7Words(input: String) {
        viewModelScope.launch {
            var result : MutableList<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(fullWordList.all7LetterWords)
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid7Words.value = result
        }
    }
    private suspend fun getValid8Words(input: String) {
        viewModelScope.launch {
            var result : MutableList<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(fullWordList.all8LetterWords)
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid8Words.value = result
        }
    }
    private suspend fun getValid9Words(input: String) {
        viewModelScope.launch {
            var result : MutableList<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(fullWordList.all9LetterWords)
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid9Words.value = result
        }
    }
    private suspend fun getValid10Words(input: String) {
        viewModelScope.launch {
            var result : MutableList<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(fullWordList.all10LetterWords)
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid10Words.value = result
        }
    }

    private suspend fun getValid11Words(input: String) {
        viewModelScope.launch {
            var result : MutableList<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(fullWordList.all11LetterWords)
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid11Words.value = result
        }
    }
    private suspend fun getValid12Words(input: String) {
        viewModelScope.launch {
            var result : MutableList<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(fullWordList.all12LetterWords)
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid12Words.value = result
        }
    }
    private suspend fun getValid13Words(input: String) {
        viewModelScope.launch {
            var result : MutableList<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(fullWordList.all13LetterWords)
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid13Words.value = result
        }
    }
    private suspend fun getValid14Words(input: String) {
        viewModelScope.launch {
            var result : MutableList<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(fullWordList.all14LetterWords)
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid14Words.value = result
        }
    }
    private suspend fun getValid15Words(input: String) {
        viewModelScope.launch {
            var result : MutableList<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(fullWordList.all15LetterWords)
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid15Words.value = result
        }
    }

    fun clearWordList() {
        validAllWords.value?.clear()
        valid2Words.value?.clear()
        valid3Words.value?.clear()
        valid4Words.value?.clear()
        valid5Words.value?.clear()
        valid6Words.value?.clear()
        valid7Words.value?.clear()
        valid8Words.value?.clear()
        valid9Words.value?.clear()
        valid10Words.value?.clear()
        valid11Words.value?.clear()
        valid12Words.value?.clear()
        valid13Words.value?.clear()
        valid14Words.value?.clear()
        valid15Words.value?.clear()


    }

    fun getAllValidWords(input: String) {
            when (input.length) {
                2 -> {
                    viewModelScope.launch {
                        getValid2Words(input)
                        validAllWords.value?.plus(valid2Words.value)
                    }
                }
                3 -> {
                    viewModelScope.launch {
                        getValid3Words(input)
                        validAllWords.value?.plus(valid3Words.value)
                    }
                }
                4 -> {
                    viewModelScope.launch {
                        getValid4Words(input)
                        validAllWords.value?.plus(valid4Words.value)
                    }
                }
                5 -> {
                    viewModelScope.launch {
                        getValid5Words(input)
                        validAllWords.value?.plus(valid5Words.value)
                    }
                }
                6 -> {
                    viewModelScope.launch {
                        getValid6Words(input)
                        validAllWords.value?.plus(valid6Words.value)
                    }
                }
                7 -> {
                    viewModelScope.launch {
                        getValid7Words(input)
                        validAllWords.value?.plus(valid7Words.value)
                    }
                }
                8 -> {
                    viewModelScope.launch {
                        getValid8Words(input)
                        validAllWords.value?.plus(valid8Words.value)
                    }
                }
                9 -> {
                    viewModelScope.launch {
                        getValid9Words(input)
                        validAllWords.value?.plus(valid9Words.value)
                    }
                }
                10 -> {
                    viewModelScope.launch {
                        getValid10Words(input)
                        validAllWords.value?.plus(valid10Words.value)
                    }
                }
                11 -> {
                    viewModelScope.launch {
                        getValid11Words(input)
                        validAllWords.value?.plus(valid11Words.value)
                    }
                }
                12 -> {
                    viewModelScope.launch {
                        getValid12Words(input)
                        validAllWords.value?.plus(valid12Words.value)
                    }
                }
                13 -> {
                    viewModelScope.launch {
                        getValid13Words(input)
                        validAllWords.value?.plus(valid13Words.value)
                    }
                }
                14 -> {
                    viewModelScope.launch {
                        getValid14Words(input)
                        validAllWords.value?.plus(valid14Words.value)
                    }
                }
                15 -> {
                    viewModelScope.launch {
                        getValid15Words(input)
                        validAllWords.value?.plus(valid15Words.value)
                    }
                }
            }

    }





}