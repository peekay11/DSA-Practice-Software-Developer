# Exercise 10: Coin Change

### Requirements
- Method: `public static int coinChange(int[] coins, int amount)`
- Fewest number of coins needed to make up `amount`, or -1 if impossible.
- DP time complexity: $O(\text{amount} \times |\text{coins}|)$.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: coins = [1, 2, 5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1
```

**Example 2:**
```text
Input: coins = [2], amount = 3
Output: -1
```

**Example 3:**
```text
Input: coins = [1], amount = 0
Output: 0
```
