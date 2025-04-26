package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final PaymentService paymentService;

    // Constructor injection for PaymentService
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void placeOder(){
        paymentService.processPayment(200.0);
    }
}
