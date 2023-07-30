package com.example.unscramble

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import com.example.unscramble.common.RetrofitInstance
import com.example.unscramble.data.WordListApi
import com.example.unscramble.data.db.WordListDatabase
import com.example.unscramble.databinding.ActivityLoadingBinding
import com.example.unscramble.domain.model.WordLibraryHolder.wordLibrary

class Loading : AppCompatActivity() {

    private val SPLASH_TIME: Long = 2500
    private lateinit var retService: WordListApi

    private lateinit var binding : ActivityLoadingBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoadingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //modify this code
        Handler(Looper.getMainLooper()).postDelayed( {
            fetchDataFromAPI()
        }, SPLASH_TIME)

        Handler(Looper.getMainLooper()).postDelayed( {
            if (wordLibrary!!.state.value.error == "") {
                onAPISuccess()
            } else {
                onAPIError()
            }
        }, SPLASH_TIME)

    }

    private fun fetchDataFromAPI() {
        retService = RetrofitInstance
            .getRetrofitInstance()
            .create(WordListApi::class.java)

        wordLibrary = WordListDatabase(retService)
        wordLibrary!!.getWords()

    }

    private fun onAPISuccess() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()

    }

    private fun onAPIError() {
        binding.tvLoadingStatus.text = wordLibrary!!.state.value.error
        binding.progressBar2.visibility = View.INVISIBLE

    }




}