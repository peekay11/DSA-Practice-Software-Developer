package easy.ex08_palindrome_number;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;

public class PalindromeNumberTest {
    @Test
    public void testPalindromes() {
        TestRunner.assertTrue(PalindromeNumber.isPalindrome(121));
        TestRunner.assertTrue(PalindromeNumber.isPalindrome(1221));
        TestRunner.assertTrue(PalindromeNumber.isPalindrome(0));
    }

    @Test
    public void testNonPalindromes() {
        TestRunner.assertFalse(PalindromeNumber.isPalindrome(-121));
        TestRunner.assertFalse(PalindromeNumber.isPalindrome(10));
        TestRunner.assertFalse(PalindromeNumber.isPalindrome(1234));
    }
}
