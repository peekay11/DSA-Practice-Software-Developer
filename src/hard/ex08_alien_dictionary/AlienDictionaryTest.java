package hard.ex08_alien_dictionary;

import testrunner.TestRunner;

public class AlienDictionaryTest {
    public void testAlien() {
        String[] words = {"wrt", "wrf", "er", "ett", "rftt"};
        String order = AlienDictionary.alienOrder(words);
        TestRunner.assertEquals("wertf", order);
    }

    public void testInvalidPrefixOrder() {
        String[] words = {"abc", "ab"};
        TestRunner.assertEquals("", AlienDictionary.alienOrder(words));
    }
}
