# Exercise 2: Valid Parentheses & Syntax Guardian

### Scenario
An API gateway parses incoming payload expressions containing parenthesis delimiters: '()', '{}', '[]'.

### Problem Requirements
- Method: `public static boolean isValid(String s)`
- Input Constraints & Defensive checks:
  - If `s` is null, throw `IllegalArgumentException("Input string cannot be null")`.
  - Empty string `""` is considered valid.
  - Return `true` if brackets close in correct order and type, otherwise `false`.
- Performance: $O(N)$ time, $O(N)$ space using `java.util.ArrayDeque`.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: s = "()"
Output: true
```

**Example 2:**
```text
Input: s = "()[]{}"
Output: true
```

**Example 3:**
```text
Input: s = "(]"
Output: false
```

**Example 4:**
```text
Input: s = "([)]"
Output: false
```
