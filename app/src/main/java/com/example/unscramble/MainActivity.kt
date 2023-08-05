package com.example.unscramble

import android.app.Activity
import android.content.Context
import android.graphics.Color
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
            if (isValidInput(binding.etInput.text.toString().lowercase())) {
                viewModel.clearWordList()
                updateWords(wordList)
            } else {
                binding.etInput.setText("")
            }
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

    private fun isValidInput(input: String) : Boolean {
        if (input.length !in 2..15 ) {
            binding.etInput.hint = "Enter between 2 and 15 letters"
            binding.etInput.setHintTextColor(Color.parseColor("#ff8a87"))
            return false
        }
        val alphabet = listOf('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z' )
        for (letter in input) {
            if(letter !in alphabet) {
                binding.etInput.hint = "Do not use symbols, numbers, or spaces"
                binding.etInput.setHintTextColor(Color.parseColor("#ff8a87"))
                return false
            }
        }
        binding.etInput.hint = "Enter up to 15 letters"
        binding.etInput.setHintTextColor(Color.parseColor("#A8A8A8"))
        return true
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