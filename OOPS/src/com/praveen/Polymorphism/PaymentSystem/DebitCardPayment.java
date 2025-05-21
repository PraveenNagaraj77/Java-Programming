package com.praveen.Polymorphism.PaymentSystem;

public class DebitCardPayment extends Payment {

    @Override
    void processPayment(double amount) {
        System.out.println("Checking bank balance...");
        System.out.println("Deducting $" + amount + " from your debit card.");
        System.out.println("Debit card payment successful.\n");
    }
}
