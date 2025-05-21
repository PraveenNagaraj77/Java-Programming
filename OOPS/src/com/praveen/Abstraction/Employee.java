package com.praveen.Abstraction;

abstract class Employee {
    String name;
    int id;


    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public abstract  double calculateSalary();

    //concrete method

    public void showDetails(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}
