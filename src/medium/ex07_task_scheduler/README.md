# Exercise 7: Task Scheduler

### Requirements
- Method: `public static int leastInterval(char[] tasks, int n)`
- Returns minimum CPU cycles needed to complete all tasks given cooldown `n`.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: tasks = ["A", "A", "A", "B", "B", "B"], n = 2
Output: 8
Explanation: A -> B -> idle -> A -> B -> idle -> A -> B.
```

**Example 2:**
```text
Input: tasks = ["A", "C", "A", "B", "D", "B"], n = 1
Output: 6
Explanation: A possible sequence is: A -> B -> C -> D -> A -> B.
```

**Example 3:**
```text
Input: tasks = ["A", "A", "A", "B", "B", "B"], n = 3
Output: 10
Explanation: A -> B -> idle -> idle -> A -> B -> idle -> idle -> A -> B.
```
