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

        val wordList = MutableLiveData<MutableList<String>>()

        retService = RetrofitInstance
            .getRetrofitInstance()
            .create(WordListApi::class.java)

        val wordLibrary = WordListDatabase(retService)
        val factory = WordListViewModelFactory(wordLibrary)
        viewModel = ViewModelProvider(this, factory).get(WordListViewModel::class.java)

        binding.btnUnscramble.setOnClickListener{
            viewModel.clearWordList()
            updateWords(wordList)
        }

        initRecyclerView(wordList)
    }
    private fun updateWords(wordList: MutableLiveData<MutableList<String>>){
        viewModel.getAllValidWords(binding.etInput.text.toString().lowercase())
        viewModel.returnAllValidWords()
        val validAllWords = viewModel.validAllWords //unnecessary
        wordList.value = validAllWords
        wordList.observe(this) { newData ->
            adapter.setList(newData ?: mutableListOf())
            adapter.notifyDataSetChanged()
        }

    }

    private fun updateWordList(wordList: MutableLiveData<MutableList<String>>) {
        val responseLiveData: LiveData<MutableList<String>?> =  liveData{
            viewModel.getAllValidWords(binding.etInput.text.toString().lowercase())
            val response = viewModel.validAllWords
            emit(response)
        }
        responseLiveData.observe(this, Observer {
            adapter.setList(it ?: mutableListOf())
            adapter.notifyDataSetChanged()
        })
    }

    private fun initRecyclerView(wordList:MutableLiveData<MutableList<String>>) {
        val customLayoutManager = GridLayoutManager(this, 6)
        customLayoutManager
        binding.rvOutput.layoutManager = GridLayoutManager(this, 6)



        adapter = WordListRVAdapter(wordList.value ?: mutableListOf())
        binding.rvOutput.adapter = adapter
    }








}