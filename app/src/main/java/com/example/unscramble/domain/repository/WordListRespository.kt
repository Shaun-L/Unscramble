package com.example.unscramble.domain.repository

import com.example.unscramble.data.remote.dto.WordsItem

interface WordListRepository {
    suspend fun get2LetterWords(): List<WordsItem>

    suspend fun get3LetterWords(): List<WordsItem>

    suspend fun get4LetterWords(): List<WordsItem>

    suspend fun get5LetterWords(): List<WordsItem>

    suspend fun get6LetterWords(): List<WordsItem>

    suspend fun get7LetterWords(): List<WordsItem>

    suspend fun get8LetterWords(): List<WordsItem>

    suspend fun get9LetterWords(): List<WordsItem>

    suspend fun get10LetterWords(): List<WordsItem>

    suspend fun get11LetterWords(): List<WordsItem>

    suspend fun get12LetterWords(): List<WordsItem>

    suspend fun get13LetterWords(): List<WordsItem>

    suspend fun get14LetterWords(): List<WordsItem>

    suspend fun get15LetterWords(): List<WordsItem>


}