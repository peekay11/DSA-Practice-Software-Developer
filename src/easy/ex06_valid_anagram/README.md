# Exercise 6: Valid Anagram

### Scenario
An identity service verifies whether two input strings are valid anagrams (same characters with equal frequencies).

### Requirements
- Method: `public static boolean isAnagram(String s, String t)`
- Defensive rules:
  - If either string is null, throw `IllegalArgumentException("Arguments cannot be null")`.
  - Empty strings return `true`.
  - Must run in $O(N)$ time with array frequency table or hash map.
