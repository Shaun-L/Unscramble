package com.example.unscramble.data

import com.example.unscramble.domain.model.Word
import retrofit2.http.GET

interface WordListApi {

    @GET("2-letter-words/2-letter-words.json")
    suspend fun get2LetterWords() : List<Word>

    @GET("3-letter-words/3-letter-words.json")
    suspend fun get3LetterWords() : List<Word>

    @GET("4-letter-words/4-letter-words.json")
    suspend fun get4LetterWords() : List<Word>

    @GET("5-letter-words/5-letter-words.json")
    suspend fun get5LetterWords() : List<Word>

    @GET("6-letter-words/6-letter-words.json")
    suspend fun get6LetterWords() : List<Word>

    @GET("7-letter-words/7-letter-words.json")
    suspend fun get7LetterWords() : List<Word>

    @GET("8-letter-words/8-letter-words.json")
    suspend fun get8LetterWords() : List<Word>

    @GET("9-letter-words/9-letter-words.json")
    suspend fun get9LetterWords() : List<Word>

    @GET("10-letter-words/10-letter-words.json")
    suspend fun get10LetterWords() : List<Word>

    @GET("11-letter-words/11-letter-words.json")
    suspend fun get11LetterWords() : List<Word>

    @GET("12-letter-words/12-letter-words.json")
    suspend fun get12LetterWords() : List<Word>

    @GET("13-letter-words/13-letter-words.json")
    suspend fun get13LetterWords() : List<Word>

    @GET("14-letter-words/14-letter-words.json")
    suspend fun get14LetterWords() : List<Word>

    @GET("15-letter-words/15-letter-words.json")
    suspend fun get15LetterWords() : List<Word>

}