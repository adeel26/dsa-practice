package com.adeel.basic.Array;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);
        list.add(10);
        list.add(87);
        list.add(98);
        list.add(878);
        list.add(677);

        // Checks if list contain this item
        System.out.println(list.contains(98));

        System.out.println(list);

        // Update any index data
        list.set(0, 99);
        System.out.println(list);

        // Remove any index
        list.remove(2);
        System.out.println(list);
    }
}

/*
Dynamic Array
Size automatically adjusts when you add/remove elements.
It works by creating a bigger array in the background when needed, and copying old elements there

How It Works Internally
Starts with a default capacity (e.g., 10).
When it’s full → creates a new array (usually double size) → copies old data → continues.
This is handled automatically by Java’s ArrayList.
 */