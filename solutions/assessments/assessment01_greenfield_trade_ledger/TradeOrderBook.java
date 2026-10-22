package assessments.assessment01_greenfield_trade_ledger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class TradeOrderBook {
    private final PriorityQueue<Order> bids = new PriorityQueue<>((a, b) -> Double.compare(b.getPrice(), a.getPrice()));
    private final PriorityQueue<Order> asks = new PriorityQueue<>((a, b) -> Double.compare(a.getPrice(), b.getPrice()));
    private final List<TradeExecution> executions = new ArrayList<>();

    public synchronized void addOrder(Order order) {
        if (order == null) throw new IllegalArgumentException("Order cannot be null");

        if (order.getSide() == Order.Side.BUY) {
            while (!asks.isEmpty() && order.getQuantity() > 0 && asks.peek().getPrice() <= order.getPrice()) {
                Order bestAsk = asks.peek();
                int matchQty = Math.min(order.getQuantity(), bestAsk.getQuantity());
                executions.add(new TradeExecution(order.getOrderId(), bestAsk.getOrderId(), bestAsk.getPrice(), matchQty));
                order.fill(matchQty);
                bestAsk.fill(matchQty);
                if (bestAsk.getQuantity() == 0) {
                    asks.poll();
                }
            }
            if (order.getQuantity() > 0) {
                bids.offer(order);
            }
        } else {
            while (!bids.isEmpty() && order.getQuantity() > 0 && bids.peek().getPrice() >= order.getPrice()) {
                Order bestBid = bids.peek();
                int matchQty = Math.min(order.getQuantity(), bestBid.getQuantity());
                executions.add(new TradeExecution(bestBid.getOrderId(), order.getOrderId(), bestBid.getPrice(), matchQty));
                order.fill(matchQty);
                bestBid.fill(matchQty);
                if (bestBid.getQuantity() == 0) {
                    bids.poll();
                }
            }
            if (order.getQuantity() > 0) {
                asks.offer(order);
            }
        }
    }

    public synchronized Double getBestBid() {
        return bids.isEmpty() ? null : bids.peek().getPrice();
    }

    public synchronized Double getBestAsk() {
        return asks.isEmpty() ? null : asks.peek().getPrice();
    }

    public synchronized List<TradeExecution> getExecutedTrades() {
        return Collections.unmodifiableList(new ArrayList<>(executions));
    }
}
