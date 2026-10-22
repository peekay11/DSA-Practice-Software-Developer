# Exercise 6: Top K Frequent Elements

### Requirements
- Method: `public static int[] topKFrequent(int[] nums, int k)`
- Return $k$ most frequent numbers in any order.
- Time Complexity: Better than $O(N \log N)$, e.g. $O(N \log K)$ using min-heap or $O(N)$ bucket sort.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: nums = [1, 1, 1, 2, 2, 3], k = 2
Output: [1, 2]
```

**Example 2:**
```text
Input: nums = [1], k = 1
Output: [1]
```
