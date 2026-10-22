package easy.ex11_contains_duplicate;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;

public class ContainsDuplicateTest {
    @Test
    public void testDuplicatesPresent() {
        TestRunner.assertTrue(ContainsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1}));
        TestRunner.assertTrue(ContainsDuplicate.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    @Test
    public void testAllDistinct() {
        TestRunner.assertFalse(ContainsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4}));
        TestRunner.assertFalse(ContainsDuplicate.containsDuplicate(new int[]{}));
        TestRunner.assertFalse(ContainsDuplicate.containsDuplicate(null));
        TestRunner.assertFalse(ContainsDuplicate.containsDuplicate(new int[]{5}));
    }
}
