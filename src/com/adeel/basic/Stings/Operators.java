package com.adeel.basic.Stings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // Adding ASCII values 97 + 98
        System.out.println("a" + "b"); // concatenating string values
        // Also + operator here is overloaded as its concatenating two strings

        System.out.println('a' + 3);  // Adding ASCII values 97 + 3
        System.out.println((char)('a' + 3)); // TypeCasting numeric value 100 into char d

        System.out.println("a" + 1); // concatenating
        // Also integer will be converted to wrapper class Integer that will call toString()
        // This is same as after a few steps: "a" + "1"

        System.out.println("Adeel" + new ArrayList<>());

        System.out.println("Adeel" + new Integer(26)); // Deprecated (old style).
        System.out.println("Adeel" + Integer.valueOf(58)); // New way, uses caching for performance

        // System.out.println(Integer.valueOf(58) + new ArrayList<>());
        // This won't work as + operator only works with primitives of if expression have String, like

        System.out.println(Integer.valueOf(58) + "Adeel" + new ArrayList<>()); // Entire result will be of string type

    }
}
