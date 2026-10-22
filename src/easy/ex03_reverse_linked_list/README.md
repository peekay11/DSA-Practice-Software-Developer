# Exercise 3: Singly Linked List Reversal

### Scenario
An event pipeline processes audit records in reverse chronological order without allocating heap arrays.

### Requirements
- Method: `public static ListNode reverseList(ListNode head)`
- Structure: `ListNode` with `int val` and `ListNode next`.
- Complexity: $O(N)$ time, strictly $O(1)$ auxiliary space.
- Gracefully handles `null` or 1-element lists.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: head = [1, 2, 3, 4, 5]
Output: [5, 4, 3, 2, 1]
```

**Example 2:**
```text
Input: head = [1, 2]
Output: [2, 1]
```

**Example 3:**
```text
Input: head = []
Output: []
```
