package com.example.unscramble

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.lifecycle.lifecycleScope
import com.example.unscramble.common.RetrofitInstance
import com.example.unscramble.data.WordListApi
import com.example.unscramble.data.db.WordListDatabase
import com.example.unscramble.databinding.ActivityLoadingBinding
import com.example.unscramble.domain.model.WordLibraryHolder.wordLibrary
import com.example.unscramble.presentation.WordListState
import kotlinx.coroutines.launch

class Loading : AppCompatActivity() {

    private val SPLASH_TIME: Long = 2500
    private lateinit var retService: WordListApi

    private lateinit var binding : ActivityLoadingBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoadingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        retService = RetrofitInstance
            .getRetrofitInstance()
            .create(WordListApi::class.java)

        wordLibrary = WordListDatabase(retService)

        lifecycleScope.launch {
            wordLibrary!!.state.collect {state ->
                when (state) {
                    is WordListState.Loading -> {}
                    is WordListState.Success -> {
                        onAPISuccess()
                    }
                    is WordListState.Error -> {
                        onAPIError(state.message)
                    }
                }
            }
        }

        lifecycleScope.launch {
            wordLibrary!!.getDataFromAPI()
        }

    }


    private fun onAPISuccess() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()

    }

    private fun onAPIError(message: String) {
        binding.tvLoadingStatus.text = message
        binding.progressBar2.visibility = View.INVISIBLE


    }




}