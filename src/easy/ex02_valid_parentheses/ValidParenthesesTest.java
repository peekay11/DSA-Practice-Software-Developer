package easy.ex02_valid_parentheses;

import testrunner.TestRunner;

public class ValidParenthesesTest {
    public void testValidCases() {
        TestRunner.assertTrue(ValidParentheses.isValid("()"));
        TestRunner.assertTrue(ValidParentheses.isValid("()[]{}"));
        TestRunner.assertTrue(ValidParentheses.isValid("{[()]}"));
        TestRunner.assertTrue(ValidParentheses.isValid(""));
    }

    public void testInvalidCases() {
        TestRunner.assertFalse(ValidParentheses.isValid("(]"));
        TestRunner.assertFalse(ValidParentheses.isValid("([)]"));
        TestRunner.assertFalse(ValidParentheses.isValid("]"));
        TestRunner.assertFalse(ValidParentheses.isValid("((("));
    }

    public void testNullThrows() {
        try {
            ValidParentheses.isValid(null);
            TestRunner.fail("Should throw on null input");
        } catch (IllegalArgumentException e) {
            TestRunner.assertTrue(true);
        }
    }
}
