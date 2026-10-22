# Exercise 1: Merge K Sorted Lists

### Requirements
- Method: `public static ListNode mergeKLists(ListNode[] lists)`
- Merge $k$ sorted linked lists into one sorted linked list.
- Complexity: $O(N \log K)$ where $N$ is total node count, $K$ is number of lists.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: lists = [[1, 4, 5], [1, 3, 4], [2, 6]]
Output: [1, 1, 2, 3, 4, 4, 5, 6]
```

**Example 2:**
```text
Input: lists = []
Output: []
```

**Example 3:**
```text
Input: lists = [[]]
Output: []
```
