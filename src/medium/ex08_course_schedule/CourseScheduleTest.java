package medium.ex08_course_schedule;

import testrunner.TestRunner;

public class CourseScheduleTest {
    public void testAcyclic() {
        int[][] prereqs = {{1, 0}};
        TestRunner.assertTrue(CourseSchedule.canFinish(2, prereqs));
    }

    public void testCyclic() {
        int[][] prereqs = {{1, 0}, {0, 1}};
        TestRunner.assertFalse(CourseSchedule.canFinish(2, prereqs));
    }

    public void testComplexDAG() {
        int[][] prereqs = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        TestRunner.assertTrue(CourseSchedule.canFinish(4, prereqs));
    }
}
