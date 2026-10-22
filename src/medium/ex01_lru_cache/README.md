# Exercise 1: LRU Cache Design

### Scenario
Build an in-memory Least Recently Used cache for a high-performance microservice.

### Requirements
- Class: `LRUCache` with methods:
  - `public LRUCache(int capacity)`: Initialize with positive capacity. Throws `IllegalArgumentException` if `capacity <= 0`.
  - `public int get(int key)`: Return value if present, else `-1`. Moves key to most recently used.
  - `public void put(int key, int value)`: Insert/update key. If capacity exceeded, evicts the least recently used key.
- Time Complexity: Strictly $O(1)$ average time for both `get` and `put`.

### Examples (LeetCode Style)

**Example 1:**
```text
Input:
["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
[[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]

Output:
[null, null, null, 1, null, -1, null, -1, 3, 4]

Explanation:
LRUCache lRUCache = new LRUCache(2);
lRUCache.put(1, 1); // cache is {1=1}
lRUCache.put(2, 2); // cache is {1=1, 2=2}
lRUCache.get(1);    // return 1
lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
lRUCache.get(2);    // returns -1 (not found)
lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
lRUCache.get(1);    // return -1 (not found)
lRUCache.get(3);    // return 3
lRUCache.get(4);    // return 4
```
