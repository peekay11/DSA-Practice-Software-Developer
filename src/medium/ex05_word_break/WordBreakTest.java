package medium.ex05_word_break;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;
import java.util.Arrays;

public class WordBreakTest {
    @Test
    public void testCanSegment() {
        TestRunner.assertTrue(WordBreak.wordBreak("leetcode", Arrays.asList("leet", "code")));
        TestRunner.assertTrue(WordBreak.wordBreak("applepenapple", Arrays.asList("apple", "pen")));
    }

    @Test
    public void testCannotSegment() {
        TestRunner.assertFalse(WordBreak.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
    }

    @Test
    public void testNullThrows() {
        try {
            WordBreak.wordBreak(null, Arrays.asList("a"));
            TestRunner.fail("Should throw on null s");
        } catch (IllegalArgumentException e) {
            TestRunner.assertTrue(true);
        }
    }
}
