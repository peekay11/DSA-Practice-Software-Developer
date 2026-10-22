package hard.ex04_sliding_window_maximum;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;

public class SlidingWindowMaximumTest {
    @Test
    public void testWindowMax() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] res = SlidingWindowMaximum.maxSlidingWindow(nums, 3);
        int[] exp = {3, 3, 5, 5, 6, 7};
        TestRunner.assertEquals(exp.length, res.length);
        for (int i = 0; i < exp.length; i++) {
            TestRunner.assertEquals(exp[i], res[i]);
        }
    }

    @Test
    public void testSingleElementWindow() {
        int[] nums = {1, -1};
        int[] res = SlidingWindowMaximum.maxSlidingWindow(nums, 1);
        TestRunner.assertEquals(1, res[0]);
        TestRunner.assertEquals(-1, res[1]);
    }
}
