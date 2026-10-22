# Assessment Scoring Rubric & Defensive Coding Master Guide

In enterprise assessments (BBED / Banking / Tier-1 Tech), submissions are judged by automated suites and senior engineering reviewers. Here is what separates **Intern Candidates** from **Top 1% Offers**.

---

## 📊 Evaluation Matrix (Total: 100 Points)

| Category | Weight | Key Evaluation Criteria |
| :--- | :--- | :--- |
| **Correctness & Tests** | **35%** | Passes all basic cases, edge cases, large inputs, and boundary conditions. |
| **Defensive Engineering** | **25%** | Guards against `null`, negative numbers, NaN, integer overflow, empty collections, and mutations. |
| **Big-O Optimal Performance**| **20%** | Optimal time and auxiliary space complexity. Avoids redundant iterations or unnecessary object allocations. |
| **Clean Architecture & TDD** | **15%** | Descriptive naming, single responsibility, well-structured unit tests, proper encapsulation. |
| **Concurrency & Thread-Safety** | **5%** | Safe access to shared resources when handling asynchronous or stateful domain services. |

---

## 🛠️ The Defensive Engineering Checklist

Before submitting or considering an exercise complete, run through this checklist:

### 1. The Null & Bounds Guard
```java
if (input == null || input.isEmpty()) {
    throw new IllegalArgumentException("Input cannot be null or empty");
}
```
*Never let a raw `NullPointerException` escape deep in your logic without context.*

### 2. Numerical Invariants & Overflows
- **Addition Overflows**: `a + b` can exceed `Integer.MAX_VALUE`. When calculating binary search midpoints:
  ```java
  // BAD: Can overflow when low + high > 2^31 - 1
  int mid = (low + high) / 2;

  // GOOD: Safe from overflow
  int mid = low + (high - low) / 2;
  ```
- **Monetary / Decimal Values**:
  - Always verify `Double.isNaN(amount)` and `Double.isInfinite(amount)`.
  - Ensure amounts are strictly positive: `amount > 0.0`.

### 3. Collection Immutability
- Never expose internal collection references directly to callers:
  ```java
  // BAD: Callers can mutate your internal audit history
  public List<String> getAuditLog() { return this.auditLog; }

  // GOOD: Expose unmodifiable snapshot or defensive copy
  public List<String> getAuditLog() {
      return Collections.unmodifiableList(new ArrayList<>(this.auditLog));
  }
  ```

### 4. Concurrency Guarding
- Any shared mutable service class (e.g. `TradeOrderBook`, `BankAccount`, `TokenBucketRateLimiter`, `TelemetryAggregator`) accessed by multiple threads must synchronize mutating methods or use thread-safe data structures (`AtomicLong`, `ConcurrentHashMap`, `synchronized`).

---

## ⏱️ How to Tackle the 2-Hour Timed Assessment

1. **Minutes 0 - 15 (Read & Dissect Requirements)**:
   - Read the problem statement twice.
   - Note down explicit constraints (e.g., $N \le 10^5$, non-negative amounts, edge cases).
2. **Minutes 15 - 30 (Design Tests & Edge Cases - TDD)**:
   - Look at the test file. Add tests for `null`, single element, duplicates, and extreme limits.
3. **Minutes 30 - 85 (Core Implementation)**:
   - Implement the core algorithm iteratively.
   - Run `./run_tests.sh <TestClass>` frequently.
4. **Minutes 85 - 105 (Defensive Hardening)**:
   - Check if you missed null checks, boundary checks, or thread safety.
   - Check for memory leaks or excessive object allocation inside loops.
5. **Minutes 105 - 120 (Final Verification & Cleanup)**:
   - Run the entire test suite `./run_tests.sh` to ensure no regressions.
   - Remove debugging `System.out.println` statements.
