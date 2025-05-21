package com.praveen.Inheritance;

public class Bike extends Vehicle {
    private String model;
    private int engineCapacity;
    private boolean hasGear;


    Bike(int speed , String model,int engineCapacity,boolean hasGear){
        super(speed); // call vehicle constructor
        this.model = model;
        this.engineCapacity=engineCapacity;
        this.hasGear=hasGear;
        System.out.println("Bike Constructor is called");
    }

    void kickStart(){
        System.out.println("Kick Starting the Bike");
    }

    void showBikeDetails(){
        System.out.println("Model: " + model);
        System.out.println("Engine Capacity: " + engineCapacity + "cc");
        System.out.println("Has Gear: " + (hasGear ? "Yes" : "No"));
//        System.out.println("Speed: " + getSpeed() + " km/h");  // using Vehicle's getter
    }

    void displaySpecs(){
        start();
        kickStart();
        stop();

    }


}
