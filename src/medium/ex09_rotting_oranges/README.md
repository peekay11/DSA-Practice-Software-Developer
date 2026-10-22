# Exercise 9: Rotting Oranges (Multi-Source BFS)

### Requirements
- Method: `public static int orangesRotting(int[][] grid)`
- 0: empty, 1: fresh, 2: rotten.
- Return minimum minutes until no fresh orange remains, or -1 if impossible.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: grid = [[2, 1, 1], [1, 1, 0], [0, 1, 1]]
Output: 4
```

**Example 2:**
```text
Input: grid = [[2, 1, 1], [0, 1, 1], [1, 0, 1]]
Output: -1
Explanation: The orange in the bottom left corner (row 2, column 0) is never rotten.
```

**Example 3:**
```text
Input: grid = [[0, 2]]
Output: 0
```
