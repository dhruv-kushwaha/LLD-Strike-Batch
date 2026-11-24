package strategies;

import java.math.BigDecimal;

public class StandardDelivery implements DeliveryStrategy {

    @Override
    public int calculateDeliveryFee(BigDecimal totalCost) {
        return totalCost.compareTo(BigDecimal.valueOf(2000)) > -1 ? 0 : 40;
    }
}