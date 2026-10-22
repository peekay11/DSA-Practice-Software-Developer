package easy.ex02_valid_parentheses;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;

public class ValidParenthesesTest {
    @Test
    public void testValidCases() {
        TestRunner.assertTrue(ValidParentheses.isValid("()"));
        TestRunner.assertTrue(ValidParentheses.isValid("()[]{}"));
        TestRunner.assertTrue(ValidParentheses.isValid("{[()]}"));
        TestRunner.assertTrue(ValidParentheses.isValid(""));
    }

    @Test
    public void testInvalidCases() {
        TestRunner.assertFalse(ValidParentheses.isValid("(]"));
        TestRunner.assertFalse(ValidParentheses.isValid("([)]"));
        TestRunner.assertFalse(ValidParentheses.isValid("]"));
        TestRunner.assertFalse(ValidParentheses.isValid("((("));
    }

    @Test
    public void testNullThrows() {
        try {
            ValidParentheses.isValid(null);
            TestRunner.fail("Should throw on null input");
        } catch (IllegalArgumentException e) {
            TestRunner.assertTrue(true);
        }
    }
}
