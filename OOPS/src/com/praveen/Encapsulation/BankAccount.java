package com.praveen.Encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class BankAccount {
    //private data members
    private String accountHolderName;
    private String accountNumber;
    private double balance;


    //List to store a Transaction History
    private List<String> transactionHistory;




    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;

        this.transactionHistory = new ArrayList<>();

    }


    //public getters and setters

    public String getAccountHolderName(){
        return  accountHolderName;
    }


    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }


    public String getAccountNumber(){
        return accountNumber;
    }


    public double getBalance(){
        return  balance;
    }

    //no setter for account number



    //public deposit method

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            String log = timestamp() + "  -Deposited : $" +amount;
            transactionHistory.add(log);
            System.out.println(log);
        }else{
            System.out.println("Deposit amount must be positive");
        }
    }


    //withdraw method
    public void withdraw(double amount){
        if(amount>0 && amount <=balance){
            balance-=amount;
            String log = timestamp() + " - Withdrawn: $" + amount;
            transactionHistory.add(log);
            System.out.println(log);
        }else{
            System.out.println("Withdrawal failed: insufficient balance or invalid amount.");
        }
    }

    //show account details(){
    public void showAccountDetails() {
        System.out.println("\n--- Account Summary ---");
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }

    public void showTransactionHistory(){
        System.out.println("\\n--- Transaction History ---");
        if(transactionHistory.isEmpty()){
            System.out.println("No transactions yet");
        }else{
            for (String entry : transactionHistory){
                System.out.println(entry);
            }
        }
    }

    //utility
    private String timestamp(){
        return LocalDateTime.now().toString().replace('T',' ');
    }


}
