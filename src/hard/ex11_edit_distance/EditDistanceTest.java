package hard.ex11_edit_distance;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;

public class EditDistanceTest {
    @Test
    public void testDistance() {
        TestRunner.assertEquals(3, EditDistance.minDistance("horse", "ros"));
        TestRunner.assertEquals(5, EditDistance.minDistance("intention", "execution"));
        TestRunner.assertEquals(0, EditDistance.minDistance("", ""));
    }
}
