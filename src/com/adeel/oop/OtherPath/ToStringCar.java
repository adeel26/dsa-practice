package com.adeel.oop.OtherPath;

public class ToStringCar {
    String make;
    String model;
    int year;
    String color;

    ToStringCar(String make, String model, int year, String color) {
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
