package com.praveen.Encapsulation;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Praveen","SBIN123456",3000);

        //display acc
        account.showAccountDetails();

        //perform some transactions

        account.deposit(1000);
        account.withdraw(2000);
        account.withdraw(2001);

        //update accountholder name
        account.setAccountHolderName("Dhanush");
        System.out.println("\nUpdated Account Holder Name: " + account.getAccountHolderName());

        account.showAccountDetails();


        account.showTransactionHistory();


    }
}
