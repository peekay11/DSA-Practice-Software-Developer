package hard.ex02_median_two_sorted_arrays;

import testrunner.TestRunner;

public class MedianTwoSortedArraysTest {
    public void testOddCombined() {
        int[] n1 = {1, 3};
        int[] n2 = {2};
        TestRunner.assertEquals(2.0, MedianTwoSortedArrays.findMedianSortedArrays(n1, n2), 1e-5, "Median odd");
    }

    public void testEvenCombined() {
        int[] n1 = {1, 2};
        int[] n2 = {3, 4};
        TestRunner.assertEquals(2.5, MedianTwoSortedArrays.findMedianSortedArrays(n1, n2), 1e-5, "Median even");
    }

    public void testOneEmpty() {
        int[] n1 = {};
        int[] n2 = {1};
        TestRunner.assertEquals(1.0, MedianTwoSortedArrays.findMedianSortedArrays(n1, n2), 1e-5, "One empty");
    }
}
