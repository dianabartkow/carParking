package com.company;

public class Vehicle {

    private String model;
    private String color;
    private int numberOfWheels;

    public Vehicle() {

    }

    public Vehicle(String model, String color, int numberOfWheels) {
        this.model = model;
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;


    } public void printDetails(){
        System.out.println("The color of this vehicle is " + this.color);
        System.out.println("The model of this vehicle is " + this.model);
        System.out.println("The number of wheels in this vehicle is " + this.numberOfWheels);
    }
}

