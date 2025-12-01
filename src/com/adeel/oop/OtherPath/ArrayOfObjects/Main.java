package com.adeel.oop.OtherPath.ArrayOfObjects;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("City", "Black");
        Car car2 = new Car("Vitz", "Blue");
        Car car3 = new Car("Cultus", "Grey");

        // Array of objects
        // Datatype will be class
        Car[] cars = new Car[3];
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;

        Car[] newCars = {car1, car2, car3};

        for (int i = 0; i < cars.length; i++) {
            cars[i].drive();
        }

        // Enhanced for loop
        for(Car car : newCars) {
            car.drive();
        }


        // Create Array of objects by passing Anonymous objects
        // These Anonymous objects = Objects created without unique identifier
        // Created in Array
        Car[] latestCars = {new Car("BMW", "White"),
                                          new Car("Swift", "Silver"),
                                          new Car("Mercedes", "Charcoal")};

        for(Car car : latestCars) {
            car.color = "Black";
        }

        for(Car car : latestCars) {
            car.drive();
        }

    }
}
