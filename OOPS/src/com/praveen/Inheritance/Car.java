// File: Car.java
package com.praveen.Inheritance;

public class Car extends Engine {
    private int fuelLevel;

    public Car(int speed, String engineType, int fuelLevel) {
        super(speed, engineType);
        this.fuelLevel = fuelLevel;
    }

    void display() {
        System.out.println("Speed : " + getSpeed());
        System.out.println("Fuel Level : " + fuelLevel + "%");
        showEngineType();
    }
}
