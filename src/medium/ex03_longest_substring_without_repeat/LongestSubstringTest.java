package medium.ex03_longest_substring_without_repeat;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;

public class LongestSubstringTest {
    @Test
    public void testCases() {
        TestRunner.assertEquals(3, LongestSubstring.lengthOfLongestSubstring("abcabcbb"));
        TestRunner.assertEquals(1, LongestSubstring.lengthOfLongestSubstring("bbbbb"));
        TestRunner.assertEquals(3, LongestSubstring.lengthOfLongestSubstring("pwwkew"));
        TestRunner.assertEquals(0, LongestSubstring.lengthOfLongestSubstring(""));
    }

    @Test
    public void testNull() {
        try {
            LongestSubstring.lengthOfLongestSubstring(null);
            TestRunner.fail("Should throw on null");
        } catch (IllegalArgumentException e) {
            TestRunner.assertTrue(true);
        }
    }
}
