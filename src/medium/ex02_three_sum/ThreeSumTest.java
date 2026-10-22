package medium.ex02_three_sum;

import testrunner.TestRunner;
import java.util.List;

public class ThreeSumTest {
    public void testStandardInput() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = ThreeSum.threeSum(nums);
        TestRunner.assertEquals(2, res.size());
    }

    public void testZeroes() {
        int[] nums = {0, 0, 0, 0};
        List<List<Integer>> res = ThreeSum.threeSum(nums);
        TestRunner.assertEquals(1, res.size());
        TestRunner.assertEquals(0, (int) res.get(0).get(0));
    }

    public void testEmptyAndSmall() {
        TestRunner.assertEquals(0, ThreeSum.threeSum(null).size());
        TestRunner.assertEquals(0, ThreeSum.threeSum(new int[]{0, 1}).size());
    }
}
