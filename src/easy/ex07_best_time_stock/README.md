# Exercise 7: Best Time to Buy and Sell Stock

### Scenario
Calculate maximum single-transaction profit given daily asset quotes.

### Requirements
- Method: `public static int maxProfit(int[] prices)`
- If `prices` is null or length < 2, return 0.
- $O(N)$ single pass, $O(1)$ space.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: prices = [7, 1, 5, 3, 6, 4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6 - 1 = 5.
```

**Example 2:**
```text
Input: prices = [7, 6, 4, 3, 1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
```
