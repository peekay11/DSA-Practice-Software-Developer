# Exercise 4: Sliding Window Maximum

### Requirements
- Method: `public static int[] maxSlidingWindow(int[] nums, int k)`
- Returns max element in sliding window of size `k`.
- Time Complexity: Strictly $O(N)$ using Monotonic Deque.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: nums = [1, 3, -1, -3, 5, 3, 6, 7], k = 3
Output: [3, 3, 5, 5, 6, 7]
Explanation: 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
```

**Example 2:**
```text
Input: nums = [1], k = 1
Output: [1]
```
