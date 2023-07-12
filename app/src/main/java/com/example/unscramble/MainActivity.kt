package com.example.unscramble

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import androidx.recyclerview.widget.GridLayoutManager
import com.example.unscramble.common.RetrofitInstance
import com.example.unscramble.data.WordListApi
import com.example.unscramble.data.db.WordListDatabase
import com.example.unscramble.databinding.ActivityMainBinding
import com.example.unscramble.presentation.WordListRVAdapter
import com.example.unscramble.presentation.WordListViewModel
import com.example.unscramble.presentation.WordListViewModelFactory

class MainActivity : AppCompatActivity() {
    private lateinit var retService: WordListApi
    private lateinit var viewModel: WordListViewModel
    private lateinit var adapter: WordListRVAdapter

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        retService = RetrofitInstance
            .getRetrofitInstance()
            .create(WordListApi::class.java)

        val wordLibrary = WordListDatabase(retService)
        val factory = WordListViewModelFactory(wordLibrary)
        viewModel = ViewModelProvider(this, factory).get(WordListViewModel::class.java)

        binding.btnUnscramble.setOnClickListener{
            getResponse()
        }



        initRecyclerView()
    }

    private fun getResponse() {
        val responseLiveData: LiveData<MutableList<String>?> =  liveData{
            viewModel.getAllValidWords(binding.etInput.text.toString().lowercase())
            val response = viewModel.validAllWords
            emit(response.value)
        }
        responseLiveData.observe(this, Observer {
            adapter.setList(it!!)
        })
    }

    private fun initRecyclerView() {
        binding.rvOutput.layoutManager = GridLayoutManager(this, 5)
        adapter = WordListRVAdapter()
        binding.rvOutput.adapter = adapter
    }








}