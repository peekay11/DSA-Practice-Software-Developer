# Exercise 1: Two Sum with Defensive Guardrails

### Scenario
A high-throughput payment router matches complementary transaction legs. You must find two numbers in an array that sum to `target`.

### Problem Requirements
- Method: `public static int[] twoSum(int[] nums, int target)`
- Input Constraints & Defensive checks:
  - If `nums` is null or `nums.length < 2`, throw `IllegalArgumentException("nums must have at least 2 elements")`.
  - Exactly one valid solution exists in tests.
  - No element may be used twice.
  - Returns array of two 0-based indices `[i, j]`.
- Performance: $O(N)$ time complexity, $O(N)$ auxiliary space.

### Defensive Engineering
- Check null and array length before processing.
- Guard against integer overflow when reasoning about target additions.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: nums = [2, 7, 11, 15], target = 9
Output: [0, 1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
```

**Example 2:**
```text
Input: nums = [3, 2, 4], target = 6
Output: [1, 2]
```

**Example 3:**
```text
Input: nums = [3, 3], target = 6
Output: [0, 1]
```
