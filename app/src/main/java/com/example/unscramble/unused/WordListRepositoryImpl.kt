package com.example.unscramble.unused

import com.example.unscramble.data.WordListApi
import com.example.unscramble.domain.model.Word

class WordListRepositoryImpl  constructor(
    private val api : WordListApi
) : WordListRepository {
    override suspend fun get2LetterWords(): List<Word> {
        return api.get2LetterWords()
    }

    override suspend fun get3LetterWords(): List<Word> {
        return api.get3LetterWords()
    }

    override suspend fun get4LetterWords(): List<Word> {
        return api.get4LetterWords()
    }

    override suspend fun get5LetterWords(): List<Word> {
        return api.get5LetterWords()
    }

    override suspend fun get6LetterWords(): List<Word> {
        return api.get6LetterWords()
    }

    override suspend fun get7LetterWords(): List<Word> {
        return api.get7LetterWords()
    }

    override suspend fun get8LetterWords(): List<Word> {
        return api.get8LetterWords()
    }

    override suspend fun get9LetterWords(): List<Word> {
        return api.get9LetterWords()
    }

    override suspend fun get10LetterWords(): List<Word> {
        return api.get10LetterWords()
    }

    override suspend fun get11LetterWords(): List<Word> {
        return api.get11LetterWords()
    }

    override suspend fun get12LetterWords(): List<Word> {
        return api.get12LetterWords()
    }

    override suspend fun get13LetterWords(): List<Word> {
        return api.get13LetterWords()
    }

    override suspend fun get14LetterWords(): List<Word> {
        return api.get14LetterWords()
    }

    override suspend fun get15LetterWords(): List<Word> {
        return api.get15LetterWords()
    }



}