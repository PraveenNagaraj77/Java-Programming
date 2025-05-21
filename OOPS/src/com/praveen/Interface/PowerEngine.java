package com.praveen.Interface;

public class PowerEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Power ENGINE sTART");
    }

    @Override
    public void stop() {
        System.out.println("Power ENGINE STOP");
    }

    @Override
    public void accelerate() {
        System.out.println("Power ENGINE ACCELERATE");
    }
}
