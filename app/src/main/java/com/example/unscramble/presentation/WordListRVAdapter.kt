package com.example.unscramble.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.unscramble.databinding.WordItemsBinding


class WordListRVAdapter(
    private val wordList: List<String>
):RecyclerView.Adapter<WordListHolder>() {

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

}

class WordListHolder(private val binding: WordItemsBinding):RecyclerView.ViewHolder(binding.root){

    fun bind(word: String){
        binding.tvWord.text = word

    }
}