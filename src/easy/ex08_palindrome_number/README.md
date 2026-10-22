# Exercise 8: Palindrome Number

### Scenario
Validate if an integer value is a palindrome without heap string allocations.

### Requirements
- Method: `public static boolean isPalindrome(int x)`
- Negative numbers are NOT palindromes.
- Any non-zero number ending in 0 is NOT a palindrome.
- Reverse only half of the integer to avoid integer overflow!
- $O(\log_{10} N)$ time, $O(1)$ space.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
```

**Example 2:**
```text
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
```

**Example 3:**
```text
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
```
