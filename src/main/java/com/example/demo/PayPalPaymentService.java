package com.example.demo;

public class PayPalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount){
        System.out.println("Processing payment of $" + amount + " via PayPal.");
    }
}
