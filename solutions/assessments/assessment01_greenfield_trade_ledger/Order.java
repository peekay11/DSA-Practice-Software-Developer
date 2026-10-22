package assessments.assessment01_greenfield_trade_ledger;

public class Order {
    public enum Side { BUY, SELL }

    private final String orderId;
    private final Side side;
    private final double price;
    private int quantity;

    public Order(String orderId, Side side, double price, int quantity) {
        if (orderId == null || orderId.trim().isEmpty()) {
            throw new IllegalArgumentException("orderId cannot be blank");
        }
        if (side == null) {
            throw new IllegalArgumentException("Side cannot be null");
        }
        if (price <= 0.0) {
            throw new IllegalArgumentException("Price must be strictly positive");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be strictly positive");
        }
        this.orderId = orderId;
        this.side = side;
        this.price = price;
        this.quantity = quantity;
    }

    public String getOrderId() { return orderId; }
    public Side getSide() { return side; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void fill(int amount) { this.quantity -= amount; }
}
