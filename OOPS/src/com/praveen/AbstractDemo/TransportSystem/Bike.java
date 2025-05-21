package com.praveen.AbstractDemo.TransportSystem;

public class Bike extends Vehicle {

    public Bike(String name) {
        super(name, "Bike");
    }

    public void start() {
        System.out.println(name + " is starting with kick.");
    }

    @Override
    public void stop() {
        System.out.println(name + " is stopping with drum brakes.");
    }

    @Override
    public double mileage() {
        return 40.0;
    }


}
