package com.praveen.AccessControl.BankSystem.bank;

public class BankService {
    public void showDetails(){
        Account acc = new Account();
//        System.out.println(acc.balance); //Balance is Private cant be accessed in different classes


        System.out.println("Account Type: " + acc.accountType); //  default (same package)
        System.out.println("Branch: " + acc.bankBranch);         //  protected (same package)
        System.out.println("Holder: " + acc.accountHolderName);      //  public


    }
}
