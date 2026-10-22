# Exercise 6: Word Ladder (Shortest Transformation Path)

### Requirements
- Method: `public static int ladderLength(String beginWord, String endWord, java.util.List<String> wordList)`
- Returns number of words in shortest transformation sequence, or 0 if impossible.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: beginWord = "hit", endWord = "cog", wordList = ["hot", "dot", "dog", "lot", "log", "cog"]
Output: 5
Explanation: One shortest transformation sequence is "hit" -> "hot" -> "dot" -> "dog" -> "cog", which is 5 words long.
```

**Example 2:**
```text
Input: beginWord = "hit", endWord = "cog", wordList = ["hot", "dot", "dog", "lot", "log"]
Output: 0
Explanation: The endWord "cog" is not in wordList, therefore there is no valid transformation sequence.
```
