package assessments.assessment03_rate_limiter_token_bucket;

import testrunner.TestRunner;

public class TokenBucketRateLimiterTest {
    public void testAcquisitionWithinCapacity() {
        TokenBucketRateLimiter limiter = new TokenBucketRateLimiter(5.0, 1.0);
        TestRunner.assertTrue(limiter.tryAcquire(3), "First 3 should succeed");
        TestRunner.assertTrue(limiter.tryAcquire(2), "Next 2 should succeed");
        TestRunner.assertFalse(limiter.tryAcquire(1), "Bucket is empty, should fail");
    }

    public void testRefill() throws InterruptedException {
        TokenBucketRateLimiter limiter = new TokenBucketRateLimiter(2.0, 10.0); // 10 tokens/sec
        TestRunner.assertTrue(limiter.tryAcquire(2));
        TestRunner.assertFalse(limiter.tryAcquire(1));

        Thread.sleep(150); // Refills ~1.5 tokens
        TestRunner.assertTrue(limiter.tryAcquire(1), "Should acquire after refill");
    }
}
