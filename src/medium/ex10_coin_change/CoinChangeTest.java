package medium.ex10_coin_change;

import testrunner.TestRunner;

public class CoinChangeTest {
    public void testStandard() {
        int[] coins = {1, 2, 5};
        TestRunner.assertEquals(3, CoinChange.coinChange(coins, 11)); // 5 + 5 + 1
    }

    public void testImpossible() {
        int[] coins = {2};
        TestRunner.assertEquals(-1, CoinChange.coinChange(coins, 3));
    }

    public void testZeroAmount() {
        int[] coins = {1};
        TestRunner.assertEquals(0, CoinChange.coinChange(coins, 0));
    }
}
