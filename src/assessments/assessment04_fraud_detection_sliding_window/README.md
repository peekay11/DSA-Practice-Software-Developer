# Assessment 4: Sliding Window Fraud Detector

### Requirements
Flag potential carding attacks: If a card makes $\ge K$ transactions within a time window of $W$ milliseconds,
flag the transaction as suspicious.
- Method: `public boolean recordTransaction(String cardId, long timestampMillis, double amount)`
- Returns `true` if suspicious (card count in window $[t - W, t]$ exceeds threshold), `false` otherwise.
