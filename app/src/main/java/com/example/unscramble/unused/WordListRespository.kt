package com.example.unscramble.unused

import com.example.unscramble.domain.model.Word

interface WordListRepository {
    suspend fun get2LetterWords(): List<Word>

    suspend fun get3LetterWords(): List<Word>

    suspend fun get4LetterWords(): List<Word>

    suspend fun get5LetterWords(): List<Word>

    suspend fun get6LetterWords(): List<Word>

    suspend fun get7LetterWords(): List<Word>

    suspend fun get8LetterWords(): List<Word>

    suspend fun get9LetterWords(): List<Word>

    suspend fun get10LetterWords(): List<Word>

    suspend fun get11LetterWords(): List<Word>

    suspend fun get12LetterWords(): List<Word>

    suspend fun get13LetterWords(): List<Word>

    suspend fun get14LetterWords(): List<Word>

    suspend fun get15LetterWords(): List<Word>


}