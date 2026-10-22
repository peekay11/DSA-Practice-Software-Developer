package easy.ex01_two_sum;

import testrunner.TestRunner;

public class TwoSumTest {
    public void testValidPairStandard() {
        int[] nums = {2, 7, 11, 15};
        int[] res = TwoSum.twoSum(nums, 9);
        TestRunner.assertNotNull(res, "Result should not be null");
        TestRunner.assertEquals(2, res.length, "Result should have 2 elements");
        TestRunner.assertTrue((res[0] == 0 && res[1] == 1) || (res[0] == 1 && res[1] == 0), "Indices should be 0 and 1");
    }

    public void testValidPairDuplicates() {
        int[] nums = {3, 2, 4, 3};
        int[] res = TwoSum.twoSum(nums, 6);
        TestRunner.assertTrue((res[0] == 0 && res[1] == 3) || (res[0] == 1 && res[1] == 2), "Should match pair summing to 6");
    }

    public void testNullThrows() {
        try {
            TwoSum.twoSum(null, 10);
            TestRunner.fail("Should throw IllegalArgumentException on null");
        } catch (IllegalArgumentException e) {
            TestRunner.assertTrue(e.getMessage().contains("at least 2 elements"));
        }
    }

    public void testInsufficientLengthThrows() {
        try {
            TwoSum.twoSum(new int[]{5}, 10);
            TestRunner.fail("Should throw on length < 2");
        } catch (IllegalArgumentException e) {
            TestRunner.assertTrue(true);
        }
    }

    public void testNoPairFoundThrows() {
        try {
            TwoSum.twoSum(new int[]{1, 2, 3}, 100);
            TestRunner.fail("Should throw if no solution found");
        } catch (IllegalArgumentException e) {
            TestRunner.assertTrue(true);
        }
    }
}
