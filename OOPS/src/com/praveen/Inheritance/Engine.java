package com.praveen.Inheritance;

public class Engine extends Vehicle {

    private String engineType;


    public Engine(int speed, String engineType) {
        super(speed);
        this.engineType = engineType;
    }

    public void showEngineType(){
        System.out.println("Engine Type : " + engineType);
    }
}
