package com.adeel.oop.OtherPath;

public class ArrayOfObjectsMain {
    public static void main(String[] args) {
        ArrayOfObjectsCar car1 = new ArrayOfObjectsCar("City", "Black");
        ArrayOfObjectsCar car2 = new ArrayOfObjectsCar("Vitz", "Blue");
        ArrayOfObjectsCar car3 = new ArrayOfObjectsCar("Cultus", "Grey");

        // Array of objects
        // Datatype will be class
        ArrayOfObjectsCar[] cars = new ArrayOfObjectsCar[3];
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;

        ArrayOfObjectsCar[] newCars = {car1, car2, car3};

        for (int i = 0; i < cars.length; i++) {
            cars[i].drive();
        }

        // Enhanced for loop
        for(ArrayOfObjectsCar car : newCars) {
            car.drive();
        }


        // Create Array of objects by passing Anonymous objects
        // These Anonymous objects = Objects created without unique identifier
        // Created in Array
        ArrayOfObjectsCar[] latestCars = {new ArrayOfObjectsCar("BMW", "White"),
                                          new ArrayOfObjectsCar("Swift", "Silver"),
                                          new ArrayOfObjectsCar("Mercedes", "Charcoal")};

        for(ArrayOfObjectsCar car : latestCars) {
            car.color = "Black";
        }

        for(ArrayOfObjectsCar car : latestCars) {
            car.drive();
        }

    }
}
