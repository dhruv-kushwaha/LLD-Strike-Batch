package strategies;

import java.math.BigDecimal;

public class ExpressDelivery implements DeliveryStrategy {

    @Override
    public int calculateDeliveryFee(BigDecimal totalCost) {
        return 100;
    }

}
