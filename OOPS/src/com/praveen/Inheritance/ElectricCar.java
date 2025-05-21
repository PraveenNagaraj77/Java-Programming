package com.praveen.Inheritance;

public class ElectricCar extends Car {
    private int batteryLevel;


    public ElectricCar(int speed , String engineType, int fuelLevel, int batteryLevel){
      super(speed, engineType, fuelLevel);
        this.batteryLevel = batteryLevel;
        System.out.println("ElectriCar Constructor is Called");
    }


    void showBatteryStatus(){
        System.out.println("Battery Level : "+batteryLevel+ "%");
    }


}
