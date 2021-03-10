package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Car car1 = new Car("bmw", "blue", 4, true);
        Car car2 = new Car("audi", "red", 4, true);
        Car car3 = new Car("fiat", "red", 4, true);
        Car car4 = new Car("meredes", "red", 4, true);


        ParkingSpace myParking = new ParkingSpace();
        myParking.addVehicles(car1);
        myParking.addVehicles(car2);
        myParking.addVehicles(car3);
        myParking.addVehicles(car4);

        myParking.printParkingDetails();


    }

}
