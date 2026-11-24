package strategies;

import java.math.BigDecimal;

public interface DeliveryStrategy {
    int calculateDeliveryFee(BigDecimal totalCost);
}
