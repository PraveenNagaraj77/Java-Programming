package com.praveen.Abstraction;

public class Manager extends Employee{
    double baseSalary;
    double bonus;

    public Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public  double calculateSalary(){
        return baseSalary + bonus;
    }




}
