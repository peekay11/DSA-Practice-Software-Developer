package medium.ex12_search_rotated_sorted_array;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;

public class SearchRotatedSortedArrayTest {
    @Test
    public void testRotatedSearch() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        TestRunner.assertEquals(4, SearchRotatedSortedArray.search(nums, 0));
        TestRunner.assertEquals(-1, SearchRotatedSortedArray.search(nums, 3));
    }

    @Test
    public void testSingleElement() {
        int[] nums = {1};
        TestRunner.assertEquals(0, SearchRotatedSortedArray.search(nums, 1));
        TestRunner.assertEquals(-1, SearchRotatedSortedArray.search(nums, 0));
    }
}
