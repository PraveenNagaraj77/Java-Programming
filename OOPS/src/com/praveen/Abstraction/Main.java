package com.praveen.Abstraction;

public class Main {
    public static void main(String[] args) {

        Employee developer = new Developer("Praveen",101,50.0,160);
        Employee manager = new Manager("Nitin ",102,50000.0,12000.0);


        developer.showDetails();
        System.out.println("Salary: $" + developer.calculateSalary());

        System.out.println("----------------------------");

        manager.showDetails();
        System.out.println("Salary: $" + manager.calculateSalary());


    }
}
