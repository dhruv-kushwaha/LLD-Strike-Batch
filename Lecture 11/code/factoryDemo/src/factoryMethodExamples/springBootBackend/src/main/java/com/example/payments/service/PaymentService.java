package com.example.payments.service;

import com.example.payments.gateway.PaymentGateway;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PaymentService {

    // Spring fills this with every PaymentGateway bean: bean name -> bean.
    private final Map<String, PaymentGateway> gateways;

    public PaymentService(Map<String, PaymentGateway> gateways) {
        this.gateways = Map.copyOf(gateways);
    }

    public String pay(String provider, long amountInPaise) {
        if (amountInPaise <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }

        // Replaces the if/else chain.
        PaymentGateway gateway = provider == null ? null : gateways.get(provider);

        if (gateway == null) {
            throw new UnknownProviderException(provider);
        }

        return gateway.charge(amountInPaise);
    }
}
