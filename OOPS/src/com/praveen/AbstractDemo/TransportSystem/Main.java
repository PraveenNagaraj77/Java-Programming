package com.praveen.AbstractDemo.TransportSystem;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Volkswagen Virtus");
        Vehicle bike = new Bike("Suzuki Gixxer SF 125");
        Vehicle truck = new Truck("Tata Truck");

        Vehicle[] vehicles = {car,bike,truck};

        for (Vehicle v : vehicles){
            v.displayInfo();
            v.start();
            v.stop();
            System.out.println("Mileage: " + v.mileage() + " km/l");
            System.out.println("-----------------------------");
        }



    }
}
