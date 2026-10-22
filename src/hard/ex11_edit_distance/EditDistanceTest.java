package hard.ex11_edit_distance;

import testrunner.TestRunner;

public class EditDistanceTest {
    public void testDistance() {
        TestRunner.assertEquals(3, EditDistance.minDistance("horse", "ros"));
        TestRunner.assertEquals(5, EditDistance.minDistance("intention", "execution"));
        TestRunner.assertEquals(0, EditDistance.minDistance("", ""));
    }
}
