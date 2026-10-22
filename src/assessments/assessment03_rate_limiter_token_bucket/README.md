# Assessment 3: Token Bucket Rate Limiter

### Requirements
Implement `TokenBucketRateLimiter`:
- Refills tokens continuously at `refillTokensPerSecond` up to `capacity`.
- Method `public synchronized boolean tryAcquire(int tokens)`: returns true if permitted and consumes tokens, false otherwise.
