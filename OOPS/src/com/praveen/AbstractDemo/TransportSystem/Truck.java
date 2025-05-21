package com.praveen.AbstractDemo.TransportSystem;

public class Truck extends Vehicle {
    public Truck(String name) {
        super(name, "Truck");
    }

    @Override
    public void start() {
        System.out.println(name + " is starting with heavy-duty ignition.");
    }

    @Override
    public void stop() {
        System.out.println(name + " is stopping with air brakes.");
    }

    @Override
    public double mileage() {
        return 6.0;
    }
}

