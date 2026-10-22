package medium.ex07_task_scheduler;

import java.util.Arrays;

public class TaskScheduler {
    public static int leastInterval(char[] tasks, int n) {
        if (tasks == null || tasks.length == 0) return 0;
        int[] freq = new int[26];
        for (char c : tasks) {
            freq[c - 'A']++;
        }
        Arrays.sort(freq);
        int maxFreq = freq[25];
        int maxCount = 1;
        for (int i = 24; i >= 0; i--) {
            if (freq[i] == maxFreq) maxCount++;
            else break;
        }

        int emptySlots = (maxFreq - 1) * (n - (maxCount - 1));
        int availableTasks = tasks.length - (maxFreq * maxCount);
        int idles = Math.max(0, emptySlots - availableTasks);

        return tasks.length + idles;
    }
}
