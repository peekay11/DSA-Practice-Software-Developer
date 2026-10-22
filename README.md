# Elite Java DSA & Banking/Enterprise Assessment Mastery Kit (Offline 7-Day Intensive)

Welcome! This offline kit is created specifically to prepare you for high-stakes enterprise & banking assessments (such as BBED / Bloomberg / Goldman / Morgan Stanley / Amazon / J.P. Morgan) where you have strict 2-hour limits, real-world defensive coding requirements, and **zero reliance on internet connectivity**.

---

## 🎯 Kit Architecture Overview

The repository is structured logically to support your offline TDD workflow:

```text
java_prep_mastery/
├── run_tests.sh               # 100% Offline Test Runner (Requires ONLY javac & java)
├── pom.xml                    # Standard Maven configuration (optional if you prefer IDEs)
├── README.md                  # This Guide
├── 7_DAY_CURRICULUM.md        # Exact day-by-day practice schedule for the next 7 days
├── ASSESSMENT_RUBRIC_AND_TIPS.md # Defensive engineering checklist, big-O cheat sheet & time strategies
├── src/
│   ├── testrunner/            # Embedded zero-dependency unit test assertion engine
│   ├── easy/                  # 12 Easy Exercises (Foundations, Arrays, Strings, Lists)
│   ├── medium/                # 12 Medium Exercises (LRU, Sliding Window, BFS/DFS, DP, DAG)
│   ├── hard/                  # 12 Hard Exercises (Monotonic Deque, Median Partition, Min Window)
│   └── assessments/           # 6 Real-World Timed Simulation Assessments (2 hours each)
└── solutions/                 # Reference production solutions for every single exercise and assessment!
    ├── easy/
    ├── medium/
    ├── hard/
    └── assessments/
```

---

## 🚀 How to Run Tests Offline (Zero Internet Needed)

You do **not** need internet, Maven downloads, or external dependencies.
A lightweight runner is included right inside `src/testrunner/TestRunner.java`.

### Run All Tests:
```bash
./run_tests.sh
```

### Run a Specific Test Class:
```bash
./run_tests.sh easy.ex01_two_sum.TwoSumTest
./run_tests.sh medium.ex01_lru_cache.LRUCacheTest
./run_tests.sh assessments.assessment01_greenfield_trade_ledger.TradeOrderBookTest
```

---

## 🛡️ The 4 Pillars of Banking & Enterprise Defensive Coding

In banking and institutional coding assessments, having an algorithm that merely works on happy paths will score poorly. Evaluators test for **defensive engineering**:

1. **Parameter Sanitization & Invariant Guards**:
   - Always check for `null`, empty collections/strings, and zero/negative bounds upfront.
   - Throw precise standard exceptions (`IllegalArgumentException`, `IllegalStateException`, `NullPointerException`).
2. **Numeric Precision & Overflow Prevention**:
   - When computing midpoints in binary search: use `mid = low + (high - low) / 2` instead of `(low + high) / 2`.
   - In monetary calculations: watch out for floating-point inaccuracies (`Double.isNaN()`, rounding, negative money).
3. **Thread Safety & Data Integrity**:
   - For shared mutable state (like ledgers and rate limiters), use `synchronized`, atomic primitives, or concurrent collections.
   - Return unmodifiable views (`Collections.unmodifiableList(...)`) or defensive copies.
4. **Time & Space Complexity Guarantees**:
   - Strive for optimal Big-O performance ($O(1)$ LRU lookups, $O(N)$ sliding windows, $O(N \log K)$ merges).
