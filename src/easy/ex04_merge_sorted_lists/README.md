# Exercise 4: Merge Two Sorted Lists

### Scenario
Combine two pre-sorted transaction log feeds into one globally sorted stream.

### Requirements
- Method: `public static ListNode mergeTwoLists(ListNode list1, ListNode list2)`
- $O(N + M)$ time, $O(1)$ extra space using a sentinel/dummy head node.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: list1 = [1, 2, 4], list2 = [1, 3, 4]
Output: [1, 1, 2, 3, 4, 4]
```

**Example 2:**
```text
Input: list1 = [], list2 = []
Output: []
```

**Example 3:**
```text
Input: list1 = [], list2 = [0]
Output: [0]
```
