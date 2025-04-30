package com.example.demo;

import org.springframework.stereotype.Service;

// @Service
public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount){
       System.out.println("Processing payment of $" + amount + " via Stripe.");
    }
}
