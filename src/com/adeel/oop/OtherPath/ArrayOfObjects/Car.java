package com.adeel.oop.OtherPath.ArrayOfObjects;

public class Car {
    String model;
    String color;
    boolean isRunning;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void drive() {
        isRunning = true;
        System.out.println(this.model + " Unlocked: " + this.isRunning);
        System.out.println("We are driving " + this.model + " " + this.color + " car");
        System.out.println("*********************\n");
    }
}
