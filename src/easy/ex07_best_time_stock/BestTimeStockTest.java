package easy.ex07_best_time_stock;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;

public class BestTimeStockTest {
    @Test
    public void testStandardProfitable() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        TestRunner.assertEquals(5, BestTimeStock.maxProfit(prices));
    }

    @Test
    public void testAlwaysDecreasing() {
        int[] prices = {7, 6, 4, 3, 1};
        TestRunner.assertEquals(0, BestTimeStock.maxProfit(prices));
    }

    @Test
    public void testEdgeCases() {
        TestRunner.assertEquals(0, BestTimeStock.maxProfit(null));
        TestRunner.assertEquals(0, BestTimeStock.maxProfit(new int[]{}));
        TestRunner.assertEquals(0, BestTimeStock.maxProfit(new int[]{5}));
    }
}
