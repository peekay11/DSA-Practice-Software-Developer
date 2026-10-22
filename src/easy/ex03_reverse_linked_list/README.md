# Exercise 3: Singly Linked List Reversal

### Scenario
An event pipeline processes audit records in reverse chronological order without allocating heap arrays.

### Requirements
- Method: `public static ListNode reverseList(ListNode head)`
- Structure: `ListNode` with `int val` and `ListNode next`.
- Complexity: $O(N)$ time, strictly $O(1)$ auxiliary space.
- Gracefully handles `null` or 1-element lists.
