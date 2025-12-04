package com.adeel.Other_Path.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // ArrayList = A resizeable array that stores objects (autoboxing).
        //             Arrays are fixed in size, but ArrayLists can change.

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Strawberry");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apple");

        System.out.println(fruits);
        System.out.println("\nfruits.remove(1);");
        fruits.remove(1); // Will remove data at index 1 which is "Orange"
        System.out.println(fruits);

        System.out.println("\nfruits.set(2, \"Grapes\");");
        fruits.set(2, "Grapes");
        System.out.println(fruits);

        System.out.println(fruits.get(2));
        System.out.println(fruits.size());

        Collections.sort(fruits);
        System.out.println("\nCollections.sort(fruits);");
        System.out.println(fruits);

        System.out.println("\n***");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
