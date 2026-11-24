import java.util.List;

import strategies.DeliveryStrategy;

public class Order {
    private int id;
    private List<OrderItem> orderItems;
    private DeliveryStrategy deliveryStrategy;

    public Order(int id, List<OrderItem> orderItems, DeliveryStrategy deliveryStrategy) {
        this.id = id;
        this.orderItems = orderItems;
        this.deliveryStrategy = deliveryStrategy;
    }

    public int getId() {
        return id;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public DeliveryStrategy getDeliveryStrategy() {
        return deliveryStrategy;
    }

    public int calculateDeliveryFee() {
        return deliveryStrategy.calculateDeliveryFee(getOrderAmount());
    }

    public java.math.BigDecimal getOrderAmount() {
        return orderItems.stream()
                .map(item -> item.getPrice().multiply(java.math.BigDecimal.valueOf(item.getQuantity())))
                .reduce(java.math.BigDecimal.ZERO, java.math.BigDecimal::add);
    }

    public java.math.BigDecimal getTotalAmount() {
        return getOrderAmount().add(java.math.BigDecimal.valueOf(calculateDeliveryFee()));
    }

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }
}