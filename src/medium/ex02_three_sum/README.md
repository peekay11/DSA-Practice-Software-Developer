# Exercise 2: 3Sum

### Scenario
Find all unique triplets in an array that sum to zero without generating duplicate result sets.

### Requirements
- Method: `public static java.util.List<java.util.List<Integer>> threeSum(int[] nums)`
- If `nums` is null or length < 3, return empty list.
- Return no duplicate triplets.
- Complexity: $O(N^2)$ time, $O(1)$ extra space excluding return payload.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: nums = [-1, 0, 1, 2, -1, -4]
Output: [[-1, -1, 2], [-1, 0, 1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1, 0, 1] and [-1, -1, 2].
```

**Example 2:**
```text
Input: nums = [0, 1, 1]
Output: []
```

**Example 3:**
```text
Input: nums = [0, 0, 0]
Output: [[0, 0, 0]]
```
