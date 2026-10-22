# Exercise 8: Course Schedule (Topological Sort / Cycle Detection)

### Requirements
- Method: `public static boolean canFinish(int numCourses, int[][] prerequisites)`
- Determine whether it is possible to finish all courses (detect cycle in directed graph).
- Return `true` if acyclic, `false` if circular dependency exists.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: numCourses = 2, prerequisites = [[1, 0]]
Output: true
Explanation: There are 2 courses to take. To take course 1 you should have finished course 0. So it is possible.
```

**Example 2:**
```text
Input: numCourses = 2, prerequisites = [[1, 0], [0, 1]]
Output: false
Explanation: Course 1 needs course 0, and course 0 needs course 1 (cycle exists). So it is impossible.
```
