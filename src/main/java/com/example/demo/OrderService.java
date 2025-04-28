package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Component
@Service
public class OrderService {

    private PaymentService paymentService;

    // if we have multiple implementations of PaymentService, we can use @Autowired to inject the desired one
    // @Autowired
    // public OderService(PaymentService paymentService, int x){}

    // Constructor injection for PaymentService
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOder() {
        paymentService.processPayment(200.0);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

}
