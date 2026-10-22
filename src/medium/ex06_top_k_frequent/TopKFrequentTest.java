package medium.ex06_top_k_frequent;

import testrunner.TestRunner;
import java.util.HashSet;
import java.util.Set;

public class TopKFrequentTest {
    public void testTopK() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int[] res = TopKFrequent.topKFrequent(nums, 2);
        TestRunner.assertEquals(2, res.length);
        Set<Integer> set = new HashSet<>();
        for (int x : res) set.add(x);
        TestRunner.assertTrue(set.contains(1));
        TestRunner.assertTrue(set.contains(2));
    }

    public void testSingle() {
        int[] nums = {1};
        int[] res = TopKFrequent.topKFrequent(nums, 1);
        TestRunner.assertEquals(1, res.length);
        TestRunner.assertEquals(1, res[0]);
    }
}
