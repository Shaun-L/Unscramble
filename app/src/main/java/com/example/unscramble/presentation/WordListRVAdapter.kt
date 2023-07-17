package com.example.unscramble.presentation

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.unscramble.databinding.WordItemsBinding

class CustomGridLayoutManager(context: Context, spanCount: Int) : GridLayoutManager(context, spanCount) {
    override fun getSpanSizeLookup(): SpanSizeLookup {
        return super.getSpanSizeLookup()
    }
}




class WordListRVAdapter(private val wordList: MutableList<String> ):RecyclerView.Adapter<WordListHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordListHolder {
        val listItem = WordItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return WordListHolder(listItem)
    }

    override fun getItemCount(): Int {
        return wordList.size
    }

    override fun onBindViewHolder(holder: WordListHolder, position: Int) {
        val word = wordList[position]
        holder.bind(word)
    }

    fun setList(words: MutableList<String>){
        wordList.clear()
        wordList.addAll(words)
    }
}

class WordListHolder(private val binding: WordItemsBinding):RecyclerView.ViewHolder(binding.root){

    fun bind(word: String){
        binding.tvWord.text = word

    }
}