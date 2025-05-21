package com.praveen.Polymorphism.RetailStore;

public class BillingSystem {


    //1.No Discount Method
    double calculateBill(double amount){
        System.out.println("No discount Applied");
        return amount;
    }

    //2.Fixed Discount Method
    double calculateBill(double amount,double discount){
        System.out.println("Fixed Discount Applied : " + discount);
        return amount-discount;
    }

    //3.Percentage Discount Method
    double calculateBill(double amount , int discountPercent){
        double discountAmount = (amount * discountPercent) / 100.0;
        System.out.println("Percentage Discount Applied : " + discountPercent);
        return amount - discountAmount;

    }


    //4.Discount based on the Coupon code

    double calculateBill(double amount,String couponCode){
        double discount =0;
        switch (couponCode){
            case "SAVE10":
                discount =10;
                break;
            case "SAVE20":
                discount =20;
                break;
            case "FREESHIP":
                discount =5;
                break;
            default:
                System.out.println("Invalid Coupon .No Discount Applied");
                return amount;
        }

        System.out.println("Coupon discount ( " +couponCode+ "  ) applied: $ " + discount);
        return amount-discount;
    }




}
