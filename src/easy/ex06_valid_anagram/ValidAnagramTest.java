package easy.ex06_valid_anagram;

import testrunner.TestRunner;

public class ValidAnagramTest {
    public void testTrueAnagrams() {
        TestRunner.assertTrue(ValidAnagram.isAnagram("anagram", "nagaram"));
        TestRunner.assertTrue(ValidAnagram.isAnagram("listen", "silent"));
        TestRunner.assertTrue(ValidAnagram.isAnagram("", ""));
    }

    public void testFalseAnagrams() {
        TestRunner.assertFalse(ValidAnagram.isAnagram("rat", "car"));
        TestRunner.assertFalse(ValidAnagram.isAnagram("a", "ab"));
    }

    public void testNullInputs() {
        try {
            ValidAnagram.isAnagram(null, "abc");
            TestRunner.fail("Should throw on null");
        } catch (IllegalArgumentException e) {
            TestRunner.assertTrue(true);
        }
    }
}
