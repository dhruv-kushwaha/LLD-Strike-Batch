import java.util.List;

public class Main {
    public static void main(String[] args) {
        // You can create OrderItem and Order objects here for testing
        // For an order worth ₹1,500, the delivery charges should be ₹40, ₹100, and ₹0
        // respectively. For an order worth ₹2,500, Standard delivery should cost ₹0

        Order order = new Order(1, List.of(
                new OrderItem(1, "Item 1", new java.math.BigDecimal("500"), 1),
                new OrderItem(2, "Item 2", new java.math.BigDecimal("500"), 1),
                new OrderItem(3, "Item 3", new java.math.BigDecimal("500"), 1)), new strategies.StandardDelivery());

        System.out.println("Delivery Fee: " + order.calculateDeliveryFee());
        System.out.println("Total Amount: " + order.getTotalAmount());

        order.setDeliveryStrategy(new strategies.ExpressDelivery());
        System.out.println("Delivery Fee (Express): " + order.calculateDeliveryFee());
        System.out.println("Total Amount (Express): " + order.getTotalAmount());

        order.setDeliveryStrategy(new strategies.StorePickup());
        System.out.println("Delivery Fee (Pickup): " + order.calculateDeliveryFee());
        System.out.println("Total Amount (Pickup): " + order.getTotalAmount());
    }
}
