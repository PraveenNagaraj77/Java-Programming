package com.praveen.Polymorphism.RetailStore;

public class Main {
    public static void main(String[] args) {
        BillingSystem bill = new BillingSystem();


        double praveenTotal = bill.calculateBill(100.0);
        System.out.println("Final bill of Praveen : $" + praveenTotal + "\n");

        double dhanushTotal = bill.calculateBill(100.0,15.0);
        System.out.println("Final bill of dhanush : $" + dhanushTotal + "\n");


        double sanjjeyTotal = bill.calculateBill(200.0,10);
        System.out.println("Final bill of Sanjjey : $" + sanjjeyTotal + "\n");



        double sriniTotal = bill.calculateBill(150.0,"SAVE10");
        System.out.println("Final bill of Srini : $" + sriniTotal + "\n");


        double udhayaTotal = bill.calculateBill(150.0,"INVALID");
        System.out.println("Final bill of Srini : $" + udhayaTotal + "\n");




    }
}
