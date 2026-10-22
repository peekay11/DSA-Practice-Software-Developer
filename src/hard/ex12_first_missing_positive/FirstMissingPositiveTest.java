package hard.ex12_first_missing_positive;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;

public class FirstMissingPositiveTest {
    @Test
    public void testCases() {
        TestRunner.assertEquals(3, FirstMissingPositive.firstMissingPositive(new int[]{1, 2, 0}));
        TestRunner.assertEquals(2, FirstMissingPositive.firstMissingPositive(new int[]{3, 4, -1, 1}));
        TestRunner.assertEquals(1, FirstMissingPositive.firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
    }
}
