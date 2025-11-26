package com.adeel.oop.OtherPath;

public class ToStringMain {
    public static void main(String[] args) {
        // .toString = Method inherited from the object class.
        //             Used to return a string representation of an object.
        //             By default, it returns a has code as a unique identifier
        //             It can be overridden to provide meaningful details.

        ToStringCar car1 = new ToStringCar("Toyota", "Vitz", 2025, "Black");
        ToStringCar car2 = new ToStringCar("Suzuki", "Cultus", 2024, "Red");

        System.out.println(car1);
        System.out.println(car1.color + " " + car1.year + " " + car1.make + " " + car1.model);

        System.out.println(car2);
    }
}
