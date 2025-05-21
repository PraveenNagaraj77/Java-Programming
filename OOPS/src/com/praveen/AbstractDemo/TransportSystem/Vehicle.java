package com.praveen.AbstractDemo.TransportSystem;

public abstract class Vehicle {
    protected String name;
    protected  String type;

    public Vehicle(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void displayInfo(){
        System.out.println("Vehicle: " + name + ", Type: " + type);
    }


    //Abstract methods to be implementeted  by subclasses
    public abstract void start();
    public abstract void stop();
    public abstract double mileage();



}
