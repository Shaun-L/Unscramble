package com.example.unscramble.data.repository

import com.example.unscramble.data.WordListApi
import com.example.unscramble.data.remote.dto.WordsItem
import com.example.unscramble.domain.repository.WordListRepository

class WordListRepositoryImpl  constructor(
    private val api : WordListApi
) : WordListRepository {
    override suspend fun get2LetterWords(): List<WordsItem> {
        return api.get2LetterWords()
    }

    override suspend fun get3LetterWords(): List<WordsItem> {
        return api.get3LetterWords()
    }

    override suspend fun get4LetterWords(): List<WordsItem> {
        return api.get4LetterWords()
    }

    override suspend fun get5LetterWords(): List<WordsItem> {
        return api.get5LetterWords()
    }

    override suspend fun get6LetterWords(): List<WordsItem> {
        return api.get6LetterWords()
    }

    override suspend fun get7LetterWords(): List<WordsItem> {
        return api.get7LetterWords()
    }

    override suspend fun get8LetterWords(): List<WordsItem> {
        return api.get8LetterWords()
    }

    override suspend fun get9LetterWords(): List<WordsItem> {
        return api.get9LetterWords()
    }

    override suspend fun get10LetterWords(): List<WordsItem> {
        return api.get10LetterWords()
    }

    override suspend fun get11LetterWords(): List<WordsItem> {
        return api.get11LetterWords()
    }

    override suspend fun get12LetterWords(): List<WordsItem> {
        return api.get12LetterWords()
    }

    override suspend fun get13LetterWords(): List<WordsItem> {
        return api.get13LetterWords()
    }

    override suspend fun get14LetterWords(): List<WordsItem> {
        return api.get14LetterWords()
    }

    override suspend fun get15LetterWords(): List<WordsItem> {
        return api.get15LetterWords()
    }


}