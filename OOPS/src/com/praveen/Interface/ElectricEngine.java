package com.praveen.Interface;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine Stoped");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric Engine Accelerated");
    }
}
