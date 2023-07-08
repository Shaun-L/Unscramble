package com.example.unscramble.data

import com.example.unscramble.data.remote.dto.Words
import com.example.unscramble.data.remote.dto.WordsItem
import retrofit2.Response
import retrofit2.http.GET

interface WordListApi {

    @GET("2-letter-words/2-letter-words.json")
    suspend fun get2LetterWords() : List<WordsItem>

    @GET("3-letter-words/3-letter-words.json")
    suspend fun get3LetterWords() : List<WordsItem>

    @GET("4-letter-words/4-letter-words.json")
    suspend fun get4LetterWords() : List<WordsItem>

    @GET("5-letter-words/5-letter-words.json")
    suspend fun get5LetterWords() : List<WordsItem>

    @GET("6-letter-words/6-letter-words.json")
    suspend fun get6LetterWords() : List<WordsItem>

    @GET("7-letter-words/7-letter-words.json")
    suspend fun get7LetterWords() : List<WordsItem>

    @GET("8-letter-words/8-letter-words.json")
    suspend fun get8LetterWords() : List<WordsItem>

    @GET("9-letter-words/9-letter-words.json")
    suspend fun get9LetterWords() : List<WordsItem>

    @GET("10-letter-words/10-letter-words.json")
    suspend fun get10LetterWords() : List<WordsItem>

    @GET("11-letter-words/11-letter-words.json")
    suspend fun get11LetterWords() : List<WordsItem>

    @GET("12-letter-words/12-letter-words.json")
    suspend fun get12LetterWords() : List<WordsItem>

    @GET("13-letter-words/13-letter-words.json")
    suspend fun get13LetterWords() : List<WordsItem>

    @GET("14-letter-words/14-letter-words.json")
    suspend fun get14LetterWords() : List<WordsItem>

    @GET("15-letter-words/15-letter-words.json")
    suspend fun get15LetterWords() : List<WordsItem>
}