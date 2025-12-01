package com.adeel.oop.OtherPath.ToString;

public class Car {
    String make;
    String model;
    int year;
    String color;

    Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Before overriding method, printing object resulted in Hashcode
    @Override
    public String toString() {
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
}
