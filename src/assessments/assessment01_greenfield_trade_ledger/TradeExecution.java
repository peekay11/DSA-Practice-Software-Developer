package assessments.assessment01_greenfield_trade_ledger;

public class TradeExecution {
    private final String buyOrderId;
    private final String sellOrderId;
    private final double executionPrice;
    private final int quantity;

    public TradeExecution(String buyOrderId, String sellOrderId, double executionPrice, int quantity) {
        this.buyOrderId = buyOrderId;
        this.sellOrderId = sellOrderId;
        this.executionPrice = executionPrice;
        this.quantity = quantity;
    }

    public String getBuyOrderId() { return buyOrderId; }
    public String getSellOrderId() { return sellOrderId; }
    public double getExecutionPrice() { return executionPrice; }
    public int getQuantity() { return quantity; }
}
