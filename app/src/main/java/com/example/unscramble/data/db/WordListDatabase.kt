package com.example.unscramble.data.db

import android.os.Parcelable
import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.example.unscramble.common.Resource
import com.example.unscramble.data.WordListApi
import com.example.unscramble.domain.model.Word
import com.example.unscramble.domain.use_case.Get10LWUseCase
import com.example.unscramble.domain.use_case.Get11LWUseCase
import com.example.unscramble.domain.use_case.Get12LWUseCase
import com.example.unscramble.domain.use_case.Get13LWUseCase
import com.example.unscramble.domain.use_case.Get14LWUseCase
import com.example.unscramble.domain.use_case.Get15LWUseCase
import com.example.unscramble.domain.use_case.Get2LWUseCase
import com.example.unscramble.domain.use_case.Get3LWUseCase
import com.example.unscramble.domain.use_case.Get4LWUseCase
import com.example.unscramble.domain.use_case.Get5LWUseCase
import com.example.unscramble.domain.use_case.Get6LWUseCase
import com.example.unscramble.domain.use_case.Get7LWUseCase
import com.example.unscramble.domain.use_case.Get8LWUseCase
import com.example.unscramble.domain.use_case.Get9LWUseCase
import com.example.unscramble.presentation.WordListState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue


class WordListDatabase(
    val repository: WordListApi
) {

    private val get2LWUseCase = Get2LWUseCase(repository)
    private val get3LWUseCase = Get3LWUseCase(repository)
    private val get4LWUseCase = Get4LWUseCase(repository)
    private val get5LWUseCase = Get5LWUseCase(repository)
    private val get6LWUseCase = Get6LWUseCase(repository)
    private val get7LWUseCase = Get7LWUseCase(repository)
    private val get8LWUseCase = Get8LWUseCase(repository)
    private val get9LWUseCase = Get9LWUseCase(repository)
    private val get10LWUseCase = Get10LWUseCase(repository)
    private val get11LWUseCase = Get11LWUseCase(repository)
    private val get12LWUseCase = Get12LWUseCase(repository)
    private val get13LWUseCase = Get13LWUseCase(repository)
    private val get14LWUseCase = Get14LWUseCase(repository)
    private val get15LWUseCase = Get15LWUseCase(repository)

    lateinit var all2LetterWords : List<Word>
    lateinit var all3LetterWords : List<Word>
    lateinit var all4LetterWords : List<Word>
    lateinit var all5LetterWords : List<Word>
    lateinit var all6LetterWords : List<Word>
    lateinit var all7LetterWords : List<Word>
    lateinit var all8LetterWords : List<Word>
    lateinit var all9LetterWords : List<Word>
    lateinit var all10LetterWords : List<Word>
    lateinit var all11LetterWords : List<Word>
    lateinit var all12LetterWords : List<Word>
    lateinit var all13LetterWords : List<Word>
    lateinit var all14LetterWords : List<Word>
    lateinit var all15LetterWords : List<Word>

    private val _state = MutableStateFlow(WordListState())
    var state: StateFlow<WordListState> = _state


    fun getWords() {
        getDataFromAPI()
    }



    private fun getDataFromAPI() {
        val scope = CoroutineScope(Dispatchers.IO)
        get2LWUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = WordListState(words = result.data ?: emptyList())
                    all2LetterWords = state.value.words
                }

                is Resource.Error -> {
                    _state.value = WordListState(
                        error = result.message ?: "An unexpected error occurred"
                    )
                }

                is Resource.Loading -> {
                    _state.value = WordListState(isLoading = true)
                }
            }
        }.launchIn(scope)

        get3LWUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = WordListState(words = result.data ?: emptyList())
                    all3LetterWords = state.value.words
                }

                is Resource.Error -> {
                    _state.value = WordListState(
                        error = result.message ?: "An unexpected error occurred"
                    )
                }

                is Resource.Loading -> {
                    _state.value = WordListState(isLoading = true)
                }
            }
        }.launchIn(scope)

        get4LWUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = WordListState(words = result.data ?: emptyList())
                    all4LetterWords = state.value.words
                }

                is Resource.Error -> {
                    _state.value = WordListState(
                        error = result.message ?: "An unexpected error occurred"
                    )
                }

                is Resource.Loading -> {
                    _state.value = WordListState(isLoading = true)
                }
            }
        }.launchIn(scope)

        get5LWUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = WordListState(words = result.data ?: emptyList())
                    all5LetterWords = state.value.words
                }

                is Resource.Error -> {
                    _state.value = WordListState(
                        error = result.message ?: "An unexpected error occurred"
                    )
                }

                is Resource.Loading -> {
                    _state.value = WordListState(isLoading = true)
                }
            }
        }.launchIn(scope)

        get6LWUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = WordListState(words = result.data ?: emptyList())
                    all6LetterWords = state.value.words
                }

                is Resource.Error -> {
                    _state.value = WordListState(
                        error = result.message ?: "An unexpected error occurred"
                    )
                }

                is Resource.Loading -> {
                    _state.value = WordListState(isLoading = true)
                }
            }
        }.launchIn(scope)

        get7LWUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = WordListState(words = result.data ?: emptyList())
                    all7LetterWords = state.value.words
                }

                is Resource.Error -> {
                    _state.value = WordListState(
                        error = result.message ?: "An unexpected error occurred"
                    )
                }

                is Resource.Loading -> {
                    _state.value = WordListState(isLoading = true)
                }
            }
        }.launchIn(scope)

        get8LWUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = WordListState(words = result.data ?: emptyList())
                    all8LetterWords = state.value.words
                }

                is Resource.Error -> {
                    _state.value = WordListState(
                        error = result.message ?: "An unexpected error occurred"
                    )
                }

                is Resource.Loading -> {
                    _state.value = WordListState(isLoading = true)
                }
            }
        }.launchIn(scope)

        get9LWUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = WordListState(words = result.data ?: emptyList())
                    all9LetterWords = state.value.words
                }

                is Resource.Error -> {
                    _state.value = WordListState(
                        error = result.message ?: "An unexpected error occurred"
                    )
                }

                is Resource.Loading -> {
                    _state.value = WordListState(isLoading = true)
                }
            }
        }.launchIn(scope)

        get10LWUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = WordListState(words = result.data ?: emptyList())
                    all10LetterWords = state.value.words
                }

                is Resource.Error -> {
                    _state.value = WordListState(
                        error = result.message ?: "An unexpected error occurred"
                    )
                }

                is Resource.Loading -> {
                    _state.value = WordListState(isLoading = true)
                }
            }
        }.launchIn(scope)

        get11LWUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = WordListState(words = result.data ?: emptyList())
                    all11LetterWords = state.value.words
                }

                is Resource.Error -> {
                    _state.value = WordListState(
                        error = result.message ?: "An unexpected error occurred"
                    )
                }

                is Resource.Loading -> {
                    _state.value = WordListState(isLoading = true)
                }
            }
        }.launchIn(scope)

        get12LWUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = WordListState(words = result.data ?: emptyList())
                    all12LetterWords = state.value.words
                }

                is Resource.Error -> {
                    _state.value = WordListState(
                        error = result.message ?: "An unexpected error occurred"
                    )
                }

                is Resource.Loading -> {
                    _state.value = WordListState(isLoading = true)
                }
            }
        }.launchIn(scope)

        get13LWUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = WordListState(words = result.data ?: emptyList())
                    all13LetterWords = state.value.words
                }

                is Resource.Error -> {
                    _state.value = WordListState(
                        error = result.message ?: "An unexpected error occurred"
                    )
                }

                is Resource.Loading -> {
                    _state.value = WordListState(isLoading = true)
                }
            }
        }.launchIn(scope)

        get14LWUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = WordListState(words = result.data ?: emptyList())
                    all14LetterWords = state.value.words
                }

                is Resource.Error -> {
                    _state.value = WordListState(
                        error = result.message ?: "An unexpected error occurred"
                    )
                }

                is Resource.Loading -> {
                    _state.value = WordListState(isLoading = true)
                }
            }
        }.launchIn(scope)

        get15LWUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = WordListState(words = result.data ?: emptyList())
                    all15LetterWords = state.value.words
                }

                is Resource.Error -> {
                    _state.value = WordListState(
                        error = result.message ?: "An unexpected error occurred"
                    )
                }

                is Resource.Loading -> {
                    _state.value = WordListState(isLoading = true)
                }
            }
        }.launchIn(scope)

    }


}