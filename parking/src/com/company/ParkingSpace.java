package com.company;

import java.util.ArrayList;

public class ParkingSpace {
    private static int maxCapacity = 3;
    private final ArrayList<Vehicle> vehicleArray = new ArrayList<>();

    public ParkingSpace() {
    }

    public static int getMaxCapacity() {
        return maxCapacity;
    }

    public int numberOfAvailable() {
        return maxCapacity - vehicleArray.size();
    }

    public void addVehicles(Vehicle vehicle) {
        if (this.vehicleArray.size() < this.maxCapacity) {
            this.vehicleArray.add(vehicle);
        } else {
            System.out.println("Parking is full");
        }
    }

    public void printParkingDetails() {
        for (Vehicle vehicle : this.vehicleArray) {
            vehicle.printDetails();
        }
    }
}

