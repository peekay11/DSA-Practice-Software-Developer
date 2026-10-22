package easy.ex06_valid_anagram;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;

public class ValidAnagramTest {
    @Test
    public void testTrueAnagrams() {
        TestRunner.assertTrue(ValidAnagram.isAnagram("anagram", "nagaram"));
        TestRunner.assertTrue(ValidAnagram.isAnagram("listen", "silent"));
        TestRunner.assertTrue(ValidAnagram.isAnagram("", ""));
    }

    @Test
    public void testFalseAnagrams() {
        TestRunner.assertFalse(ValidAnagram.isAnagram("rat", "car"));
        TestRunner.assertFalse(ValidAnagram.isAnagram("a", "ab"));
    }

    @Test
    public void testNullInputs() {
        try {
            ValidAnagram.isAnagram(null, "abc");
            TestRunner.fail("Should throw on null");
        } catch (IllegalArgumentException e) {
            TestRunner.assertTrue(true);
        }
    }
}
