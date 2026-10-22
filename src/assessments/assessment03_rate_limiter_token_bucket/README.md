# Assessment 3: Token Bucket Rate Limiter

### Requirements
Implement `TokenBucketRateLimiter`:
- Refills tokens continuously at `refillTokensPerSecond` up to `capacity`.
- Method `public synchronized boolean tryAcquire(int tokens)`: returns true if permitted and consumes tokens, false otherwise.

### Examples (LeetCode Style)

**Example 1:**
```text
Input: TokenBucketRateLimiter(capacity = 5, refillRate = 2 tokens/sec)
t = 0.00s: tryAcquire(3) -> Output: true (2 tokens remain)
t = 0.00s: tryAcquire(3) -> Output: false (insufficient tokens)
t = 1.00s: 2 tokens refilled (total 4 tokens)
t = 1.00s: tryAcquire(4) -> Output: true (0 tokens remain)
```
