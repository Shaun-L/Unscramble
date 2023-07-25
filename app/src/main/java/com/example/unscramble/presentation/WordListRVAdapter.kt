package com.example.unscramble.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.unscramble.databinding.HeaderItemBinding
import com.example.unscramble.databinding.WordItemsBinding
import com.example.unscramble.domain.model.WordSection

class CustomSpanSizeLookup(private val adapter: WordListRVAdapter) : GridLayoutManager.SpanSizeLookup() {
    override fun getSpanSize(position: Int): Int {
        if (position in adapter.getHeaderSpaces()) {
            return 6
        }
        //default span == 6
        return when(adapter.getSectionWordLength(position)) {
            in 2..4 -> 1
            in 5..11 -> 2
            else -> 3
        }

    }

}

class WordListRVAdapter:RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var sections: MutableList<WordSection> = mutableListOf()
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
        if (holder is HeaderHolder) {
            val currentHeader = sections[getHeaderSpaces().indexOf(position)].header
            holder.bind(currentHeader)
        } else if (holder is WordListHolder) {
            val headerSpaces = getHeaderSpaces()
            var count = 0
            for (i in 0 .. headerSpaces.size) {
                if(i == headerSpaces.size || position < headerSpaces[i] ){
                    holder.bind(sections[i-1].words[position - count - 1])
                    break
                }else{
                    count = headerSpaces[i]
                }
            }
        }



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

    fun setList(newSections: MutableList<WordSection>) {
        sections = newSections
    }

    fun getHeaderSpaces(): MutableList<Int> {
        val headerSpaces = mutableListOf<Int>()
        headerSpaces.add(0)
        var count = 0
        for (i in 0 until sections.size-1){
            headerSpaces.add(sections[i].words.size + count + 1)
            count += sections[i].words.size + 1
        }
        return headerSpaces

    }


    fun getSectionWordLength(position: Int) : Int {
        val headerSpaces = getHeaderSpaces()
        for (i in 0 until headerSpaces.size) {
            if (position < headerSpaces[i]) {
                return sections[i-1].wordLength
            } else if (position == headerSpaces[i]) {
                return sections[i].wordLength
            }
        }
        return sections[sections.size-1].wordLength
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