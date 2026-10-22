# Exercise 8: Alien Dictionary

### Requirements
- Method: `public static String alienOrder(String[] words)`
- Derives order of characters in alien language. If order is invalid/cyclic, returns `""`.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: words = ["wrt", "wrf", "er", "ett", "rftt"]
Output: "wertf"
```

**Example 2:**
```text
Input: words = ["z", "x"]
Output: "zx"
```

**Example 3:**
```text
Input: words = ["z", "x", "z"]
Output: ""
Explanation: The order is invalid (cycle z < x < z), so return "".
```
