# Assessment 5: Payment Routing DAG Resolution

### Scenario
Interbank settlement network requires resolving payment obligations in topological dependency order without deadlocks.
- Method: `public List<String> resolveExecutionOrder(int numTransfers, String[][] dependencies)`
- Return topologically sorted transfer IDs or empty list if deadlocked (cyclic dependency).
