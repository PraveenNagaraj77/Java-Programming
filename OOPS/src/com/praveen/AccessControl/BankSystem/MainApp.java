package com.praveen.AccessControl.BankSystem;

import com.praveen.AccessControl.BankSystem.bank.Account;
import com.praveen.AccessControl.BankSystem.bank.BankService;
import com.praveen.AccessControl.BankSystem.user.Customer;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("---------Bank Service View------");
        BankService service = new BankService();
        service.showDetails();

        System.out.println("---------Customer  View------");
        Customer customer = new Customer();
        customer.displayInfo();

        System.out.println("\n------Main App View-----");
        Account acc = new Account();


        // System.out.println(acc.balance);        //  private
        // System.out.println(acc.accountType);    //  default
        // System.out.println(acc.bankBranch);     //  protected (not subclass)
        System.out.println("Holder: " + acc.accountHolderName);   //



    }
}
