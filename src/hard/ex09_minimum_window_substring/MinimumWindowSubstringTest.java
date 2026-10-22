package hard.ex09_minimum_window_substring;

import testrunner.TestRunner;

public class MinimumWindowSubstringTest {
    public void testMinWindowFound() {
        TestRunner.assertEquals("BANC", MinimumWindowSubstring.minWindow("ADOBECODEBANC", "ABC"));
        TestRunner.assertEquals("a", MinimumWindowSubstring.minWindow("a", "a"));
    }

    public void testNotFound() {
        TestRunner.assertEquals("", MinimumWindowSubstring.minWindow("a", "aa"));
    }
}
