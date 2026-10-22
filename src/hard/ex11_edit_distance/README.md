# Exercise 11: Edit Distance

### Requirements
- Method: `public static int minDistance(String word1, String word2)`
- Calculate minimum edit operations (insert, delete, replace) to transform word1 into word2.
- Complexity: $O(M \times N)$ time and $O(M \times N)$ space.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: word1 = "horse", word2 = "ros"
Output: 3
Explanation: 
horse -> rorse (replace 'h' with 'r')
rorse -> rose (remove 'r')
rose -> ros (remove 'e')
```

**Example 2:**
```text
Input: word1 = "intention", word2 = "execution"
Output: 5
Explanation: 
intention -> inention (remove 't')
inention -> enention (replace 'i' with 'e')
enention -> exention (replace 'n' with 'x')
exention -> exection (replace 'n' with 'c')
exection -> execution (insert 'u')
```
