package strategies;

import java.math.BigDecimal;

public class StorePickup implements DeliveryStrategy {
    @Override
    public int calculateDeliveryFee(BigDecimal orderAmount) {
        return 0;
    }
}
