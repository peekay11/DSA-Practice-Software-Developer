# Assessment 5: Payment Routing DAG Resolution

### Scenario
Interbank settlement network requires resolving payment obligations in topological dependency order without deadlocks.
- Method: `public List<String> resolveExecutionOrder(int numTransfers, String[][] dependencies)`
- Return topologically sorted transfer IDs or empty list if deadlocked (cyclic dependency).

### Examples (LeetCode Style)

**Example 1:**
```text
Input Dependencies:
"auth" -> []
"risk_check" -> ["auth"]
"settle" -> ["risk_check"]

Output (Topological Execution Order):
["auth", "risk_check", "settle"]
```

**Example 2 (Cycle detected):**
```text
Input: A -> B, B -> A
Output: [] (empty list / cycle error)
```
