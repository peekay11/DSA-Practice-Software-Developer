package medium.ex05_word_break;

import testrunner.TestRunner;
import java.util.Arrays;

public class WordBreakTest {
    public void testCanSegment() {
        TestRunner.assertTrue(WordBreak.wordBreak("leetcode", Arrays.asList("leet", "code")));
        TestRunner.assertTrue(WordBreak.wordBreak("applepenapple", Arrays.asList("apple", "pen")));
    }

    public void testCannotSegment() {
        TestRunner.assertFalse(WordBreak.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
    }

    public void testNullThrows() {
        try {
            WordBreak.wordBreak(null, Arrays.asList("a"));
            TestRunner.fail("Should throw on null s");
        } catch (IllegalArgumentException e) {
            TestRunner.assertTrue(true);
        }
    }
}
