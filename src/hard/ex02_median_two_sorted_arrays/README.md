# Exercise 2: Median of Two Sorted Arrays

### Requirements
- Method: `public static double findMedianSortedArrays(int[] nums1, int[] nums2)`
- Time Complexity: Strictly $O(\log(\min(M, N)))$.
- Binary search on partition cut.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: nums1 = [1, 3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1, 2, 3] and median is 2.
```

**Example 2:**
```text
Input: nums1 = [1, 2], nums2 = [3, 4]
Output: 2.50000
Explanation: merged array = [1, 2, 3, 4] and median is (2 + 3) / 2 = 2.5.
```
