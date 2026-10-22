# Exercise 9: Maximum Subarray (Kadane's Algorithm)

### Scenario
Find contiguous slice with maximum sum in financial timeseries.

### Requirements
- Method: `public static int maxSubArray(int[] nums)`
- If `nums` is null or empty, throw `IllegalArgumentException("Array cannot be null or empty")`.
- $O(N)$ time, $O(1)$ space.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6
Explanation: The subarray [4, -1, 2, 1] has the largest sum 6.
```

**Example 2:**
```text
Input: nums = [1]
Output: 1
```

**Example 3:**
```text
Input: nums = [5, 4, -1, 7, 8]
Output: 23
```
