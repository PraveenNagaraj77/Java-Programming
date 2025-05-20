package com.praveen.staticExample;

public class Employee {
    String name;
    static int count=0;

    public Employee(String name) {
        this.name = name;

        count++;
    }
}
