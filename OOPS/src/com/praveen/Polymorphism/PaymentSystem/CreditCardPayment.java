package com.praveen.Polymorphism.PaymentSystem;

public class CreditCardPayment extends Payment {

    void processPayment(double amount){
        System.out.println("Validating credit card...");
        System.out.println("Charging $" + amount + " to your credit card.");
        System.out.println("Credit card payment successful.\n");
    }


}
