package easy.ex09_maximum_subarray;

import testrunner.TestRunner;

public class MaximumSubarrayTest {
    public void testStandardKadane() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        TestRunner.assertEquals(6, MaximumSubarray.maxSubArray(nums));
    }

    public void testAllNegative() {
        int[] nums = {-5, -3, -8, -1};
        TestRunner.assertEquals(-1, MaximumSubarray.maxSubArray(nums));
    }

    public void testSingleElement() {
        TestRunner.assertEquals(10, MaximumSubarray.maxSubArray(new int[]{10}));
    }

    public void testNullThrows() {
        try {
            MaximumSubarray.maxSubArray(null);
            TestRunner.fail("Should throw on null");
        } catch (IllegalArgumentException e) {
            TestRunner.assertTrue(true);
        }
    }
}
