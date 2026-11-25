package com.example.payments.service;

public class UnknownProviderException extends RuntimeException {

    public UnknownProviderException(String provider) {
        super("Unknown payment provider: " + provider);
    }
}
