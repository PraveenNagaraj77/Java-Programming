package com.praveen.Polymorphism.PaymentSystem;

public class Main {
    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCardPayment();
        payment.processPayment(250.0);


        payment = new DebitCardPayment();
        payment.processPayment(180.0);

        payment = new UPIPayment();
        payment.processPayment(99.0);
    }


}
