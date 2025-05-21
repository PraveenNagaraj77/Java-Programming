package com.praveen.AbstractDemo.TransportSystem;

public class Car extends Vehicle {

    public Car(String name){
        super(name,"Car");
    }

    @Override
    public void start() {
        System.out.println(name + " is starting with key ignition.");
    }

    @Override
    public void stop() {
        System.out.println(name + " is stopping using disc brakes.");
    }


    @Override
    public double mileage() {
        return 15.5;
    }
}
