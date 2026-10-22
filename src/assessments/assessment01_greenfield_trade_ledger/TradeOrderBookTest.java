package assessments.assessment01_greenfield_trade_ledger;

import testrunner.TestRunner;
import java.util.List;

public class TradeOrderBookTest {
    public void testMatchingLogic() {
        TradeOrderBook book = new TradeOrderBook();
        
        // Add Sell: 100 shares @ $150.00
        book.addOrder(new Order("S1", Order.Side.SELL, 150.0, 100));
        TestRunner.assertEquals(150.0, book.getBestAsk(), 1e-4, "Best ask should be 150");
        TestRunner.assertNull(book.getBestBid(), "Bid should be empty");

        // Add Buy: 60 shares @ $155.00 -> Should match 60 shares @ $150.00 (maker price)
        book.addOrder(new Order("B1", Order.Side.BUY, 155.0, 60));
        List<TradeExecution> trades = book.getExecutedTrades();
        TestRunner.assertEquals(1, trades.size());
        TestRunner.assertEquals(60, trades.get(0).getQuantity());
        TestRunner.assertEquals(150.0, trades.get(0).getExecutionPrice(), 1e-4, "Execution price matches maker");

        // Remaining ask: 40 shares @ $150.00
        TestRunner.assertEquals(150.0, book.getBestAsk(), 1e-4, "Remaining ask 150");
        TestRunner.assertNull(book.getBestBid(), "Buy fully filled");
    }

    public void testDefensiveValidation() {
        TradeOrderBook book = new TradeOrderBook();
        try {
            book.addOrder(null);
            TestRunner.fail("Should reject null order");
        } catch (IllegalArgumentException e) {
            TestRunner.assertTrue(true);
        }
    }
}
