// File: Vehicle.java
package com.praveen.Inheritance;

public class Vehicle {
    private int speed;

    public Vehicle(int speed){
        this.speed = speed;
        System.out.println("Vehicle COnsturtcur is called");
    }

    void start() {
        System.out.println("Vehicle Starting");
    }

    void stop() {
        System.out.println("Vehicle Stopping");
    }

    public int getSpeed(){
        return  speed;
    }
}
