package com.example.payments.gateway;

import org.springframework.stereotype.Component;

// Simulated. The bean name "razorpay" is the lookup key.
@Component("razorpay")
public class RazorpayGateway implements PaymentGateway {

    @Override
    public String charge(long amountInPaise) {
        return "Razorpay charged " + amountInPaise + " paise";
    }
}
