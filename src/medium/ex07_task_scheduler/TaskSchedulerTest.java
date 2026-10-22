package medium.ex07_task_scheduler;

import testrunner.TestRunner;

public class TaskSchedulerTest {
    public void testScheduler() {
        char[] tasks1 = {'A', 'A', 'A', 'B', 'B', 'B'};
        TestRunner.assertEquals(8, TaskScheduler.leastInterval(tasks1, 2));

        char[] tasks2 = {'A', 'A', 'A', 'B', 'B', 'B'};
        TestRunner.assertEquals(6, TaskScheduler.leastInterval(tasks2, 0));
    }
}
