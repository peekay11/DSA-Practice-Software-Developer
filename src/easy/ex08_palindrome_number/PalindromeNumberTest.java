package easy.ex08_palindrome_number;

import testrunner.TestRunner;

public class PalindromeNumberTest {
    public void testPalindromes() {
        TestRunner.assertTrue(PalindromeNumber.isPalindrome(121));
        TestRunner.assertTrue(PalindromeNumber.isPalindrome(1221));
        TestRunner.assertTrue(PalindromeNumber.isPalindrome(0));
    }

    public void testNonPalindromes() {
        TestRunner.assertFalse(PalindromeNumber.isPalindrome(-121));
        TestRunner.assertFalse(PalindromeNumber.isPalindrome(10));
        TestRunner.assertFalse(PalindromeNumber.isPalindrome(1234));
    }
}
