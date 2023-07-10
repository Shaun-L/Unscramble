package com.example.unscramble.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.unscramble.common.RetrofitInstance
import com.example.unscramble.domain.model.UnscrambleModel
import com.example.unscramble.domain.model.Word
import com.example.unscramble.domain.repository.WordListRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class WordListViewModel(
   private val retService: WordListRepository
) : ViewModel() {
    private var unscrambleModel = UnscrambleModel()

    var valid2Words : MutableLiveData<List<String>?> = MutableLiveData()
    var valid3Words : MutableLiveData<List<String>?> = MutableLiveData()
    var valid4Words : MutableLiveData<List<String>?> = MutableLiveData()
    var valid5Words : MutableLiveData<List<String>?> = MutableLiveData()
    var valid6Words : MutableLiveData<List<String>?> = MutableLiveData()
    var valid7Words : MutableLiveData<List<String>?> = MutableLiveData()
    var valid8Words : MutableLiveData<List<String>?> = MutableLiveData()
    var valid9Words : MutableLiveData<List<String>?> = MutableLiveData()
    var valid10Words : MutableLiveData<List<String>?> = MutableLiveData()
    var valid11Words : MutableLiveData<List<String>?> = MutableLiveData()
    var valid12Words : MutableLiveData<List<String>?> = MutableLiveData()
    var valid13Words : MutableLiveData<List<String>?> = MutableLiveData()
    var valid14Words : MutableLiveData<List<String>?> = MutableLiveData()
    var valid15Words : MutableLiveData<List<String>?> = MutableLiveData()






    suspend fun getValid2Words(input: String) {
        viewModelScope.launch {
            var result : List<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(retService.get2LetterWords())
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid2Words.value = result
        }
    }

    suspend fun getValid3Words(input: String) {
        viewModelScope.launch {
            var result : List<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(retService.get3LetterWords())
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid3Words.value = result
        }
    }

    suspend fun getValid4Words(input: String) {
        viewModelScope.launch {
            var result : List<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(retService.get4LetterWords())
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid4Words.value = result
        }
    }
    suspend fun getValid5Words(input: String) {
        viewModelScope.launch {
            var result : List<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(retService.get5LetterWords())
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid5Words.value = result
        }
    }
    suspend fun getValid6Words(input: String) {
        viewModelScope.launch {
            var result : List<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(retService.get6LetterWords())
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid6Words.value = result
        }
    }
    suspend fun getValid7Words(input: String) {
        viewModelScope.launch {
            var result : List<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(retService.get7LetterWords())
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid7Words.value = result
        }
    }
    suspend fun getValid8Words(input: String) {
        viewModelScope.launch {
            var result : List<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(retService.get8LetterWords())
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid8Words.value = result
        }
    }
    suspend fun getValid9Words(input: String) {
        viewModelScope.launch {
            var result : List<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(retService.get9LetterWords())
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid9Words.value = result
        }
    }
    suspend fun getValid10Words(input: String) {
        viewModelScope.launch {
            var result : List<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(retService.get10LetterWords())
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid10Words.value = result
        }
    }

    suspend fun getValid11Words(input: String) {
        viewModelScope.launch {
            var result : List<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(retService.get11LetterWords())
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid11Words.value = result
        }
    }
    suspend fun getValid12Words(input: String) {
        viewModelScope.launch {
            var result : List<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(retService.get12LetterWords())
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid12Words.value = result
        }
    }
    suspend  fun getValid13Words(input: String) {
        viewModelScope.launch {
            var result : List<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(retService.get13LetterWords())
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid13Words.value = result
        }
    }
    suspend fun getValid14Words(input: String) {
        viewModelScope.launch {
            var result : List<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(retService.get14LetterWords())
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid14Words.value = result
        }
    }
    suspend fun getValid15Words(input: String) {
        viewModelScope.launch {
            var result : List<String>? = null
            withContext(Dispatchers.Default) {
                val dictionary = unscrambleModel.createDictionary(retService.get15LetterWords())
                result = unscrambleModel.generatePermutations(input, dictionary)
            }
            valid15Words.value = result
        }
    }





}