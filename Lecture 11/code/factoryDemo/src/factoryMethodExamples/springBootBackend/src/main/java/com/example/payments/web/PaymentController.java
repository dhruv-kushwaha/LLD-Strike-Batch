package com.example.payments.web;

import com.example.payments.service.PaymentService;
import com.example.payments.service.UnknownProviderException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    public record PaymentRequest(String provider, long amountInPaise) { }

    public record PaymentResponse(String message) { }

    public record ErrorResponse(String error) { }

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public PaymentResponse pay(@RequestBody PaymentRequest request) {
        return new PaymentResponse(
                paymentService.pay(request.provider(), request.amountInPaise()));
    }

    @ExceptionHandler({UnknownProviderException.class, IllegalArgumentException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse badRequest(RuntimeException e) {
        return new ErrorResponse(e.getMessage());
    }
}
