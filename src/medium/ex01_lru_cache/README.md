# Exercise 1: LRU Cache Design

### Scenario
Build an in-memory Least Recently Used cache for a high-performance microservice.

### Requirements
- Class: `LRUCache` with methods:
  - `public LRUCache(int capacity)`: Initialize with positive capacity. Throws `IllegalArgumentException` if `capacity <= 0`.
  - `public int get(int key)`: Return value if present, else `-1`. Moves key to most recently used.
  - `public void put(int key, int value)`: Insert/update key. If capacity exceeded, evicts the least recently used key.
- Time Complexity: Strictly $O(1)$ average time for both `get` and `put`.
