package com.company;

import java.sql.SQLOutput;

public class Car extends Vehicle {
    private boolean roof;

    public Car() {

        super();
    }

    public Car(String model, String color, int numberOfWheels, boolean roof) {
        super(model, color, numberOfWheels);
        this.roof = roof;
    }

    public boolean isRoof() {
        return roof;
    }

    public void setRoof(boolean roof) {
        this.roof = roof;
    }

    public void printCarDetails() {
        super.printDetails();
        System.out.println(" this car has a roof: \" + this.roof");
    }
}
