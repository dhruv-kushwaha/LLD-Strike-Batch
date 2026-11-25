package com.example.payments.gateway;

import org.springframework.stereotype.Component;

// Simulated. The bean name "stripe" is the lookup key.
@Component("stripe")
public class StripeGateway implements PaymentGateway {

    @Override
    public String charge(long amountInPaise) {
        return "Stripe charged " + amountInPaise + " paise";
    }
}
