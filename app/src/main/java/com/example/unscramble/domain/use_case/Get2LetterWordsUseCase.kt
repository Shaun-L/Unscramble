package com.example.unscramble.domain.use_case

import com.example.unscramble.common.Resource
import com.example.unscramble.data.remote.dto.toWord
import com.example.unscramble.domain.model.Word
import com.example.unscramble.domain.repository.WordListRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

class Get2LetterWordsUseCase(
    private val repository: WordListRepository
) {
    operator fun invoke(): Flow<Resource<List<Word>>> = flow {
        try {
            emit(Resource.Loading<List<Word>>())
            val words = repository.get2LetterWords().map { it.toWord()}
            emit(Resource.Success<List<Word>>(words))
        } catch (e: HttpException) {
            emit(Resource.Error<List<Word>>(e.localizedMessage ?: "An unexpected error occurred"))

        } catch (e: IOException) {
            emit(Resource.Error<List<Word>>(e.localizedMessage ?: "Couldn't reach server. Check your internet connection"))
        }
    }


}