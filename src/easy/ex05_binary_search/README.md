# Exercise 5: Binary Search (Overflow-Safe)

### Scenario
Perform fast lookups in a pre-sorted integer array.

### Requirements
- Method: `public static int binarySearch(int[] nums, int target)`
- Returns the index of `target` or `-1` if not found.
- If `nums` is null or empty, return `-1`.
- Compute midpoint defensively: `int mid = low + (high - low) / 2;` to avoid integer overflow bugs.
- Complexity: $O(\log N)$ time, $O(1)$ space.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: nums = [-1, 0, 3, 5, 9, 12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4.
```

**Example 2:**
```text
Input: nums = [-1, 0, 3, 5, 9, 12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1.
```
