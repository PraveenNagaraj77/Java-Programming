package com.praveen.Abstraction;

public class Developer extends Employee  {
    double hourlyRate;
    int hoursWorked;

    public Developer(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }


    public double calculateSalary(){
        return hourlyRate * hoursWorked;
    }

}
