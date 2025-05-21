package com.praveen.AccessControl.BankSystem.bank;

public class Account {
    private double balance = 5000.00;
    String accountType = "Savings";
    protected String bankBranch = "Main Branch";
    public String accountHolderName = "Praveen";

    public double getBalance() {
        return balance;
    }

    private void logTransaction(String action){
        System.out.println("Logging: " + action);
    }


    public void deposit(double amount){
        if(amount>0){
            balance+= amount;
            logTransaction("Deposit: " +amount);
        }
    }


}
