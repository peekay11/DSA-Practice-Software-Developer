package hard.ex06_word_ladder;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;
import java.util.Arrays;

public class WordLadderTest {
    @Test
    public void testFoundPath() {
        int len = WordLadder.ladderLength("hit", "cog", Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));
        TestRunner.assertEquals(5, len); // hit -> hot -> dot -> dog -> cog
    }

    @Test
    public void testNotFound() {
        int len = WordLadder.ladderLength("hit", "cog", Arrays.asList("hot", "dot", "dog", "lot", "log"));
        TestRunner.assertEquals(0, len);
    }
}
