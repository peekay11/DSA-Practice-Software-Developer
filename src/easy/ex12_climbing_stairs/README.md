# Exercise 12: Climbing Stairs

### Scenario
Count distinct ways to climb $N$ stairs taking 1 or 2 steps each time.

### Requirements
- Method: `public static int climbStairs(int n)`
- If $n \le 0$, throw `IllegalArgumentException("n must be positive")`.
- Complexity: $O(N)$ time, $O(1)$ auxiliary space.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top: 1 step + 1 step, or 2 steps.
```

**Example 2:**
```text
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top:
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
```
