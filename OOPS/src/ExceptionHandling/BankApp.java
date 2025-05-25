package ExceptionHandling;

//ATM Withdraw;


import java.util.Scanner;


class InsufficientFundsException extends  Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}


public class BankApp {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        double accountBalance = 5000.00;


        System.out.println("Enter amount to Withdraw: ");
        double withdrawAmount = sc.nextDouble();

        try {
            withdraw(accountBalance,withdrawAmount);
        }catch (InsufficientFundsException e){
            System.out.println("Transaction Failed: " + e.getMessage());
        }finally {
            System.out.println("Thankyou for using our bank");
        }





    }


    static  void withdraw(double balance,double amount) throws InsufficientFundsException {
        if(amount>balance){
            throw new InsufficientFundsException("Insufficient Balance.You tried to withdraw " +amount+" but you balance is " +balance );
        }

        System.out.println("Withdraw Successfulll! Remaining Balance :  " +(balance-amount));
    }

}
