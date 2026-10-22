# Exercise 5: Binary Search (Overflow-Safe)

### Scenario
Perform fast lookups in a pre-sorted integer array.

### Requirements
- Method: `public static int binarySearch(int[] nums, int target)`
- Returns the index of `target` or `-1` if not found.
- If `nums` is null or empty, return `-1`.
- Compute midpoint defensively: `int mid = low + (high - low) / 2;` to avoid integer overflow bugs.
- Complexity: $O(\log N)$ time, $O(1)$ space.
