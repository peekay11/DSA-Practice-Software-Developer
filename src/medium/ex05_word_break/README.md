# Exercise 5: Word Break

### Requirements
- Method: `public static boolean wordBreak(String s, java.util.List<String> wordDict)`
- Return `true` if `s` can be segmented into a space-separated sequence of dictionary words.
- Handle nulls defensively with `IllegalArgumentException`.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: s = "leetcode", wordDict = ["leet", "code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".
```

**Example 2:**
```text
Input: s = "applepenapple", wordDict = ["apple", "pen"]
Output: true
Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
```

**Example 3:**
```text
Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
Output: false
```
