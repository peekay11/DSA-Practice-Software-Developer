package medium.ex01_lru_cache;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;

public class LRUCacheTest {
    @Test
    public void testCacheOperations() {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1);
        lRUCache.put(2, 2);
        TestRunner.assertEquals(1, lRUCache.get(1)); // returns 1
        lRUCache.put(3, 3); // evicts key 2
        TestRunner.assertEquals(-1, lRUCache.get(2)); // returns -1 (not found)
        lRUCache.put(4, 4); // evicts key 1
        TestRunner.assertEquals(-1, lRUCache.get(1)); // returns -1 (not found)
        TestRunner.assertEquals(3, lRUCache.get(3)); // returns 3
        TestRunner.assertEquals(4, lRUCache.get(4)); // returns 4
    }

    @Test
    public void testUpdateExistingKey() {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 10);
        cache.put(2, 20);
        cache.put(1, 15); // update 1
        TestRunner.assertEquals(15, cache.get(1));
        cache.put(3, 30); // should evict 2, NOT 1
        TestRunner.assertEquals(-1, cache.get(2));
        TestRunner.assertEquals(15, cache.get(1));
    }

    @Test
    public void testInvalidCapacity() {
        try {
            new LRUCache(0);
            TestRunner.fail("Should throw on 0 capacity");
        } catch (IllegalArgumentException e) {
            TestRunner.assertTrue(true);
        }
    }
}
