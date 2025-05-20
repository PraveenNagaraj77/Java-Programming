package com.praveen.staticExample;

public class BankAccount {
    int accountNumber;
    double balance;
    static double interestRate=5.0;//Shard by all accounts

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;

    }


    public  void displayInfo(){
        System.out.println("Account no : " + accountNumber);
        System.out.println("Balance : " + balance);
        System.out.println("Interest Rate " + interestRate + "%");
    }



}





