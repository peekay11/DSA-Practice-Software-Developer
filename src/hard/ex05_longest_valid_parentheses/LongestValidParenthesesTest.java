package hard.ex05_longest_valid_parentheses;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;

public class LongestValidParenthesesTest {
    @Test
    public void testCases() {
        TestRunner.assertEquals(2, LongestValidParentheses.longestValidParentheses("(()"));
        TestRunner.assertEquals(4, LongestValidParentheses.longestValidParentheses(")()())"));
        TestRunner.assertEquals(0, LongestValidParentheses.longestValidParentheses(""));
        TestRunner.assertEquals(6, LongestValidParentheses.longestValidParentheses("((()))"));
    }
}
