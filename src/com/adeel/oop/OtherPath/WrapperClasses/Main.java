package com.adeel.oop.OtherPath.WrapperClasses;

import com.adeel.oop.OtherPath.Aggregation.Book;

public class Main {
    public static void main(String[] args) {
        // Wrapper Classes = Allow primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitives unless you need an object.
        //                   Allows use of Collection Framework and static Utility Methods.

        /*
        Before Java 9
        Integer a = new Integer(123);
        Double b = new Double(3.14);
        Character c = new Character('$');
        Boolean d = new Boolean(true);
         */

        // Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;

        // Unboxing = To convert wrapper class back to primitive
        int x = a;
        double y = b;
        char z = c;
        boolean w = d;

        // Wrapper class do have some useful utility methods that are static.
        // One of those methods are used for converting primitive data type to string.
        // ToString Method

        String a1 = Integer.toString(123);
        String b1 = Double.toString(3.14);
        String c1 = Character.toString('@');
        String d1 = Boolean.toString(true);

        String concatPrimitives = a1 + " " + b1 + " " + c1 + " " + d1;
        System.out.println(concatPrimitives);


        // Method to convert string to primitive data type

        int a2 = Integer.parseInt("123");
        double b2 = Double.parseDouble("3.14");
        // Character don't have any parse utility method so we can use charAt & it's unrelated to wrapper class
        char c2 = "Pizza".charAt(0);
        boolean d2 = Boolean.parseBoolean("1");


        // Some utility methods for Character
        char letter = 'b';
        System.out.println(Character.isAlphabetic(letter));
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.getNumericValue(letter));
        System.out.println(Character.isUpperCase(letter));


    }
}
