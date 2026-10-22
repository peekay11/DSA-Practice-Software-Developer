package easy.ex12_climbing_stairs;

import testrunner.TestRunner;

public class ClimbingStairsTest {
    public void testValues() {
        TestRunner.assertEquals(1, ClimbingStairs.climbStairs(1));
        TestRunner.assertEquals(2, ClimbingStairs.climbStairs(2));
        TestRunner.assertEquals(3, ClimbingStairs.climbStairs(3));
        TestRunner.assertEquals(5, ClimbingStairs.climbStairs(4));
        TestRunner.assertEquals(8, ClimbingStairs.climbStairs(5));
    }

    public void testNonPositiveThrows() {
        try {
            ClimbingStairs.climbStairs(0);
            TestRunner.fail("Should throw on 0");
        } catch (IllegalArgumentException e) {
            TestRunner.assertTrue(true);
        }
    }
}
