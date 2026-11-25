package com.example.payments.gateway;

public interface PaymentGateway {

    String charge(long amountInPaise);
}
