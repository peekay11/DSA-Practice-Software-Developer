# Exercise 9: Minimum Window Substring

### Requirements
- Method: `public static String minWindow(String s, String t)`
- Returns minimum substring in `s` that contains all characters of `t`. If none, returns `""`.
- Complexity: Strictly $O(M + N)$.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
```

**Example 2:**
```text
Input: s = "a", t = "a"
Output: "a"
```

**Example 3:**
```text
Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window. Since the largest window of s only has one 'a', return empty string.
```
