package com.praveen.staticExample;

public class Main {
    public static void main(String[] args) {
//        // Human example
//        Human praveen = new Human(25, "Praveen", 65000, false);
//        Human dhanush = new Human(24, "Dhanush", 70000, true);
//
//        Human.population = 100;
//
//        System.out.println(praveen.population);
//        System.out.println(dhanush.population);
//
//        // Employee example
//        Employee e1 = new Employee("Praveen");
//        Employee e2 = new Employee("Sanjjey");
//
//        System.out.println("Number of Employees : " + Employee.count);
//
//        // BankAccount example
//        BankAccount acc1 = new BankAccount(1001, 5000);
//        BankAccount acc2 = new BankAccount(1002, 10000);
//
//        BankAccount.interestRate = 6.5;
//
//        acc1.displayInfo();
//        acc2.displayInfo();

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.showMessage();

        // Test whether both instances are same
        if (s1 == s2) {
            System.out.println("Both s1 and s2 are the same instance (Singleton works!)");
        } else {
            System.out.println("Different instances (Singleton failed!)");
        }
    }











}
