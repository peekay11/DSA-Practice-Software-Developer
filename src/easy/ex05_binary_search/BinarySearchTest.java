package easy.ex05_binary_search;

import testrunner.TestRunner;

public class BinarySearchTest {
    public void testFound() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        TestRunner.assertEquals(4, BinarySearch.search(nums, 9));
        TestRunner.assertEquals(0, BinarySearch.search(nums, -1));
        TestRunner.assertEquals(5, BinarySearch.search(nums, 12));
    }

    public void testNotFound() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        TestRunner.assertEquals(-1, BinarySearch.search(nums, 2));
        TestRunner.assertEquals(-1, BinarySearch.search(nums, 13));
        TestRunner.assertEquals(-1, BinarySearch.search(nums, -5));
    }

    public void testEdgeCases() {
        TestRunner.assertEquals(-1, BinarySearch.search(null, 1));
        TestRunner.assertEquals(-1, BinarySearch.search(new int[]{}, 1));
        TestRunner.assertEquals(0, BinarySearch.search(new int[]{7}, 7));
    }
}
