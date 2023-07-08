package com.example.unscramble.domain.model

class UnscrambleModel {
    class TrieNode {
        val children = mutableMapOf<Char, TrieNode>()
        var isWord = false
    }

    class WordDictionary {
        private val root = TrieNode()

        fun insert(word: String) {
            var node = root
            for (ch in word) {
                val child = node.children.getOrPut(ch) { TrieNode() }
                node = child
            }
            node.isWord = true
        }

        fun search(word: String): Boolean {
            var node = root
            for (ch in word) {
                val child = node.children[ch] ?: return false
                node = child
            }
            return node.isWord
        }

        fun getRoot(): TrieNode {
            return root
        }
    }

    fun createDictionary(wordList : List<Word>) : WordDictionary {
        val dictionary = WordDictionary()
        for (word in wordList){
            dictionary.insert(word.word)
        }
        return dictionary
    }

    fun generatePermutations(
        scrambledLetters: String,
        dictionary: WordDictionary
    ): List<String> {
        val permutations = mutableListOf<String>()
        val visited = BooleanArray(scrambledLetters.length)
        val prefix = StringBuilder()
        generatePermutationsRecursive(scrambledLetters, visited, dictionary.getRoot(), prefix, permutations)
        return permutations
    }

    fun generatePermutationsRecursive(
        letters: String,
        used: BooleanArray,
        node: TrieNode,
        prefix: StringBuilder,
        permutations: MutableList<String>
    ) {
        if (node.isWord) {
            permutations.add(prefix.toString())
        }

        val letterCount = letters.length
        val visited = BooleanArray(26) // Assuming lowercase letters only

        for (i in 0 until letterCount) {
            val index = letters[i] - 'a'
            if (!used[i] && !visited[index] && node.children.containsKey(letters[i])) {
                used[i] = true
                visited[index] = true

                prefix.append(letters[i])
                generatePermutationsRecursive(letters, used, node.children[letters[i]]!!, prefix, permutations)
                prefix.deleteCharAt(prefix.length - 1)

                used[i] = false
            }
        }
    }

}