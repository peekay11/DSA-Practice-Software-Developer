package hard.ex09_minimum_window_substring;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;

public class MinimumWindowSubstringTest {
    @Test
    public void testMinWindowFound() {
        TestRunner.assertEquals("BANC", MinimumWindowSubstring.minWindow("ADOBECODEBANC", "ABC"));
        TestRunner.assertEquals("a", MinimumWindowSubstring.minWindow("a", "a"));
    }

    @Test
    public void testNotFound() {
        TestRunner.assertEquals("", MinimumWindowSubstring.minWindow("a", "aa"));
    }
}
