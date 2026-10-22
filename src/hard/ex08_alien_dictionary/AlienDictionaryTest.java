package hard.ex08_alien_dictionary;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;

public class AlienDictionaryTest {
    @Test
    public void testAlien() {
        String[] words = {"wrt", "wrf", "er", "ett", "rftt"};
        String order = AlienDictionary.alienOrder(words);
        TestRunner.assertEquals("wertf", order);
    }

    @Test
    public void testInvalidPrefixOrder() {
        String[] words = {"abc", "ab"};
        TestRunner.assertEquals("", AlienDictionary.alienOrder(words));
    }
}
