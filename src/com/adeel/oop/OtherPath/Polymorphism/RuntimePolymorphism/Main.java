package com.adeel.oop.OtherPath.Polymorphism.RuntimePolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Runtime polymorphism = When the method that gets executed is decided
        //                        at runtime based on the actual type of the object.

        Scanner input = new Scanner(System.in);

        Animal animal;

        while(true) {
            System.out.print("Would you like dog or cat? (1 = dog, 2 = cat, 3 = Cancel): ");
            int choice = input.nextInt();

            if (choice == 1) {
                animal = new Dog();
                animal.speak();
            } else if (choice == 2) {
                animal = new Cat();
                animal.speak();
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid Choice");
            }
        }
    }
}
