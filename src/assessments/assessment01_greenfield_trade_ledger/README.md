# Assessment 1: Greenfield Real-Time Trade Matching Ledger Engine

### Context & Industry Scenario
You are tasked with building a trade matching and settlement ledger for an institutional brokerage.
Orders arrive sequentially. Buy and Sell orders must be matched when Buy price >= Sell price.
Unmatched portions remain on the order book.

### Objectives (Greenfield TDD)
Implement `TradeOrderBook` supporting:
1. `addOrder(Order order)`: Adds and matches orders.
2. `getBestBid()`: Highest buy price currently open (or null if empty).
3. `getBestAsk()`: Lowest sell price currently open (or null if empty).
4. `getExecutedTrades()`: Read-only list of all matched `TradeExecution` records in chronological order.

### Defensive & Reliability Requirements
- Throw `IllegalArgumentException` on null orders or non-positive price/quantity.
- High-efficiency priority matching ($O(\log N)$ per insertion/fill).
