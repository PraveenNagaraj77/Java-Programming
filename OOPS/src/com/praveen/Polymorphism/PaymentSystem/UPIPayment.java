package com.praveen.Polymorphism.PaymentSystem;

public class UPIPayment extends Payment {

    @Override
    void processPayment(double amount) {
//        super.processPayment(amount);
        System.out.println("Authenticating UPI PIN...");
        System.out.println("Transferring $" + amount + " via UPI.");
        System.out.println("UPI payment successful.\n");

    }
}

