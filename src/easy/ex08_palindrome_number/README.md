# Exercise 8: Palindrome Number

### Scenario
Validate if an integer value is a palindrome without heap string allocations.

### Requirements
- Method: `public static boolean isPalindrome(int x)`
- Negative numbers are NOT palindromes.
- Any non-zero number ending in 0 is NOT a palindrome.
- Reverse only half of the integer to avoid integer overflow!
- $O(\log_{10} N)$ time, $O(1)$ space.
