package com.adeel.oop.OtherPath.GettersAndSetters;

public class Car {
    private String model;
    private String color;
    private int price;

    // Constructor
    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // Getters
    String getModel() {
        return this.model;
    }
    String getColor() {
        return this.color;
    }
    int getPrice() {
        return this.price;
    }

    // Setters
    void setColor(String color) {
        this.color = color;
    }
    void setPrice(int price) {
        this.price = price;
    }
}

/*
In Classes
• 	If you don’t write any modifier, the method/variable has default (package-private) access.
• 	Meaning: it’s accessible only within the same package.
• 	If you want it accessible everywhere, you must explicitly write public.

In Interfaces
- All methods are implicitly public and abstract (unless marked default or static).
- You don’t need to write public — but if you omit it, the compiler will still treat it as public.
Notice: when you implement an interface, the method must be public, because the interface contract is public.
 */
