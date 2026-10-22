# Assessment 4: Sliding Window Fraud Detector

### Requirements
Flag potential carding attacks: If a card makes $\ge K$ transactions within a time window of $W$ milliseconds,
flag the transaction as suspicious.
- Method: `public boolean recordTransaction(String cardId, long timestampMillis, double amount)`
- Returns `true` if suspicious (card count in window $[t - W, t]$ exceeds threshold), `false` otherwise.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: windowSeconds = 60, maxTxCount = 3, maxVelocity = 1000.0
1. recordTransaction(cardId="CARD-1", timestamp=10, amount=100.0) -> Output: true
2. recordTransaction(cardId="CARD-1", timestamp=20, amount=200.0) -> Output: true
3. recordTransaction(cardId="CARD-1", timestamp=30, amount=800.0) -> Output: false (Velocity alert: 100+200+800 > 1000)
```
