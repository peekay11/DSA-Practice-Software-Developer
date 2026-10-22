package medium.ex09_rotting_oranges;

import testrunner.TestRunner;

public class RottingOrangesTest {
    public void testNormalSpread() {
        int[][] grid = {
            {2, 1, 1},
            {1, 1, 0},
            {0, 1, 1}
        };
        TestRunner.assertEquals(4, RottingOranges.orangesRotting(grid));
    }

    public void testNeverReaches() {
        int[][] grid = {
            {2, 1, 1},
            {0, 1, 1},
            {1, 0, 1}
        };
        TestRunner.assertEquals(-1, RottingOranges.orangesRotting(grid));
    }

    public void testNoFresh() {
        int[][] grid = {{0, 2}};
        TestRunner.assertEquals(0, RottingOranges.orangesRotting(grid));
    }
}
