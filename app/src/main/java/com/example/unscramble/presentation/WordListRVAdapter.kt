package com.example.unscramble.presentation

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.unscramble.databinding.HeaderItemBinding
import com.example.unscramble.databinding.WordItemsBinding
import com.example.unscramble.domain.model.Word
import com.example.unscramble.domain.model.WordSection

class CustomSpanSizeLookup(private val adapter: WordListRVAdapter) : GridLayoutManager.SpanSizeLookup() {
    override fun getSpanSize(position: Int): Int {
        //default span == 6
        return when(adapter.getSectionWordLength(position)) {
            in 2..5 -> 1
            in 6..11 -> 2
            else -> 3
        }

    }

}

class WordListRVAdapter(private val sections: MutableList<WordSection> ):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if(viewType == 0) {
            val listItem = WordItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            WordListHolder(listItem)
        } else {
            val headerItem = HeaderItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            HeaderHolder(headerItem)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return sections.sumOf { it.words.size } + sections.size
    }
    override fun getItemViewType(position: Int): Int {
        if (position in getHeaderSpaces()){
            // 1 = header
            return 1
        }
        // 0 = word
        return 0

    }

    private fun getHeaderSpaces(): MutableList<Int> {
        var headerSpaces = mutableListOf<Int>()
        headerSpaces.add(0)
        var count = 0
        for (i in 0 until sections.size-1){
            headerSpaces.add(sections[i].words.size + count + 1)
            count += sections[i].words.size + 1
        }
        return headerSpaces

    }


    fun getSectionWordLength(position: Int) : Int {
        return sections[position].wordLength
    }




}
class HeaderHolder(private val binding: HeaderItemBinding): RecyclerView.ViewHolder(binding.root){

    fun bind(header: String){
        binding.tvHeader.text = header
    }
}
class WordListHolder(private val binding: WordItemsBinding):RecyclerView.ViewHolder(binding.root){

    fun bind(word: String){
        binding.tvWord.text = word

    }
}