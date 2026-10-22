# Exercise 10: Fibonacci Calculation

### Requirements
- Method: `public static long fib(int n)`
- If `n < 0`, throw `IllegalArgumentException("n must be non-negative")`.
- If `n > 92`, throw `ArithmeticException("Fibonacci overflows 64-bit long")`.
- Complexity: $O(N)$ time, $O(1)$ auxiliary space.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
```

**Example 2:**
```text
Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
```

**Example 3:**
```text
Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
```
