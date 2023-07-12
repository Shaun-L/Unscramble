package com.example.unscramble.data.db

import android.util.Log
import com.example.unscramble.data.WordListApi
import com.example.unscramble.domain.model.Word
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import okhttp3.internal.wait

class WordListDatabase(
    retService: WordListApi
) {

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

    init {
        getDataFromAPI(retService)
    }



    private fun getDataFromAPI(retService: WordListApi) {
        CoroutineScope(Dispatchers.IO).launch{
            try {
                val response = retService.get2LetterWords()

                if (response.isNotEmpty()){
                    all2LetterWords = retService.get2LetterWords()
                    all3LetterWords = retService.get3LetterWords()
                    all4LetterWords = retService.get4LetterWords()
                    all5LetterWords = retService.get5LetterWords()
                    all6LetterWords = retService.get6LetterWords()
                    all7LetterWords = retService.get7LetterWords()
                    all8LetterWords = retService.get8LetterWords()
                    all9LetterWords = retService.get9LetterWords()
                    all10LetterWords = retService.get10LetterWords()
                    all11LetterWords = retService.get11LetterWords()
                    all12LetterWords = retService.get12LetterWords()
                    all13LetterWords = retService.get13LetterWords()
                    all14LetterWords = retService.get14LetterWords()
                    all15LetterWords = retService.get15LetterWords()
                }
            } catch (e: Exception) {
                Log.e("ds error", e.message!!)
            }

        }

    }


}