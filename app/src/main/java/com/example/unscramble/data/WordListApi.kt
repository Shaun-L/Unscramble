package com.example.unscramble.data

import com.example.unscramble.data.remote.dto.Words
import retrofit2.Response
import retrofit2.http.GET

interface WordListApi {

    @GET("2-letter-words/2-letter-words.json")
    suspend fun get2LetterWords() : Response<Words>

    @GET("3-letter-words/3-letter-words.json")
    suspend fun get3LetterWords() : Response<Words>

    @GET("4-letter-words/4-letter-words.json")
    suspend fun get4LetterWords() : Response<Words>

    @GET("5-letter-words/5-letter-words.json")
    suspend fun get5LetterWords() : Response<Words>

    @GET("6-letter-words/6-letter-words.json")
    suspend fun get6LetterWords() : Response<Words>

    @GET("7-letter-words/7-letter-words.json")
    suspend fun get7LetterWords() : Response<Words>

    @GET("8-letter-words/8-letter-words.json")
    suspend fun get8LetterWords() : Response<Words>

    @GET("9-letter-words/9-letter-words.json")
    suspend fun get9LetterWords() : Response<Words>

    @GET("10-letter-words/10-letter-words.json")
    suspend fun get10LetterWords() : Response<Words>

    @GET("11-letter-words/11-letter-words.json")
    suspend fun get11LetterWords() : Response<Words>

    @GET("12-letter-words/12-letter-words.json")
    suspend fun get12LetterWords() : Response<Words>

    @GET("13-letter-words/13-letter-words.json")
    suspend fun get13LetterWords() : Response<Words>

    @GET("14-letter-words/14-letter-words.json")
    suspend fun get14LetterWords() : Response<Words>

    @GET("15-letter-words/15-letter-words.json")
    suspend fun get15LetterWords() : Response<Words>
}