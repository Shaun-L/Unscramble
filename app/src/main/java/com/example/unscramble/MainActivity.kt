package com.example.unscramble

import android.app.Activity
import android.content.Context
import android.inputmethodservice.InputMethodService
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
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
import com.example.unscramble.domain.model.WordLibraryHolder.wordLibrary
import com.example.unscramble.domain.model.WordSection
import com.example.unscramble.presentation.CustomSpanSizeLookup
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

        val wordList = MutableLiveData<MutableList<WordSection>>()


        val factory = WordListViewModelFactory(wordLibrary!!)
        viewModel = ViewModelProvider(this, factory).get(WordListViewModel::class.java)


        binding.btnUnscramble.setOnClickListener{
            viewModel.clearWordList()
            updateWords(wordList)
            hideKeyboard()
        }
        initRecyclerView()

    }



    fun Fragment.hideKeyboard() {
        view?.let { activity?.hideKeyboard(it) }
    }

    fun Activity.hideKeyboard() {
        hideKeyboard(currentFocus ?: View(this))
    }

    fun Context.hideKeyboard(view: View) {
        val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun updateWords(wordList: MutableLiveData<MutableList<WordSection>>){
        viewModel.getAllValidWords(binding.etInput.text.toString().lowercase())
        wordList.value = viewModel.returnAllValidWords()
        wordList.observe(this) { newData ->
            adapter.setList(newData)
            adapter.notifyDataSetChanged()
        }
    }

    private fun initRecyclerView() {
        val layoutManager = GridLayoutManager(this, 6)
        adapter = WordListRVAdapter()
        layoutManager.spanSizeLookup = CustomSpanSizeLookup(adapter)
        binding.rvOutput.layoutManager = layoutManager
        binding.rvOutput.adapter = adapter
    }








}