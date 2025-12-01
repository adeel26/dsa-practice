package com.adeel.oop.KK;

public class GamesClass {
    String name;
    String genre;

    void play() {
        System.out.println(name + " is loading");
    }
}

/*
⭐ What is a Class in Java?
A class is a blueprint, template, or plan for creating objects.
Think of it like:
A house blueprint → not a real house
You use the blueprint to build many houses

Same in Java:
A class → blueprint
An object → real thing created from the class

⭐ Why do we need a class?
Because real-world things need:
Data (variables)
Behaviour (functions)

A class combines both.

📦 Example (Real Life)

Class: Car
Data → color, model, speed
Behaviour → start(), stop(), accelerate()

Object
A real Toyota or Honda in the parking lot
Created using the “Car” class

⭐ Memory Understanding (Simple)
Class → stored in Method Area
Object → stored in Heap
Reference variable → stored in Stack
 */