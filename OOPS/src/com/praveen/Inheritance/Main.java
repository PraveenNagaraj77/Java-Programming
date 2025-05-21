package com.praveen.Inheritance;

public class Main {
    public static void main(String[] args) {

//        ElectricCar myEv = new ElectricCar(100,"Electric Motor",60,95);
//
//        myEv.start();
//        myEv.display();
//        myEv.showBatteryStatus();
//        myEv.stop();

        Bike myBike = new Bike(76,"Suzuki Gixxer sf 155",150,true);
        Bike frdBike = new Bike(70,"Access125",120,false);

        System.out.println("\n--- Bike Information ---");
        frdBike.showBikeDetails();



    }
}
