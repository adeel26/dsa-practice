package com.adeel.oop.OtherPath.GettersAndSetters;

public class Main {
    public static void main(String[] args) {

        // The help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.

        Car car = new Car("Toyota", "Grey", 150000);

        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());

        car.setColor("Black");
        car.setPrice(2000000);

        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());

    }
}
