package assessments.assessment03_rate_limiter_token_bucket;

public class TokenBucketRateLimiter {
    private final double capacity;
    private final double refillRate;
    private double currentTokens;
    private long lastRefillTimestampNanos;

    public TokenBucketRateLimiter(double capacity, double refillTokensPerSecond) {
        if (capacity <= 0 || refillTokensPerSecond <= 0) {
            throw new IllegalArgumentException("Capacity and refill rate must be positive");
        }
        this.capacity = capacity;
        this.refillRate = refillTokensPerSecond;
        this.currentTokens = capacity;
        this.lastRefillTimestampNanos = System.nanoTime();
    }

    public synchronized boolean tryAcquire(int tokens) {
        if (tokens <= 0) {
            throw new IllegalArgumentException("Requested tokens must be positive");
        }
        refill();
        if (currentTokens >= tokens) {
            currentTokens -= tokens;
            return true;
        }
        return false;
    }

    private void refill() {
        long now = System.nanoTime();
        double elapsedSeconds = (now - lastRefillTimestampNanos) / 1_000_000_000.0;
        double addedTokens = elapsedSeconds * refillRate;
        currentTokens = Math.min(capacity, currentTokens + addedTokens);
        lastRefillTimestampNanos = now;
    }
}
