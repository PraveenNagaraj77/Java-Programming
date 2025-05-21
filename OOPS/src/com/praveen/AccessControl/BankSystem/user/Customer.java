package com.praveen.AccessControl.BankSystem.user;

import com.praveen.AccessControl.BankSystem.bank.Account;

public class Customer extends Account {
    public void displayInfo(){
//         System.out.println(balance);       //  private: not accessible
//         System.out.println(accountType);   //  default: not accessible (different package)
        System.out.println("Branch: " + bankBranch);      // protected: accessible in subclass
        System.out.println("Holder: " + accountHolderName);   //  public
        System.out.println("Balance: " + getBalance());   // public method accessing private data
    }
}
