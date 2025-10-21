package com.adeel.basic.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        // Taking input from user
        for (int i=0; i<5; i++){
            System.out.print("Enter number " + (i + 1) + ": ");
            list.add(input.nextInt());
        }

        System.out.println(list);

        // get item at any index
        for (int i=0; i<5; i++){
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }


    }
}

/*
Boxing (or Auto-boxing)
➡️ Converting a primitive type into its wrapper object.

When you put a primitive value (like int) into a place that expects an object (like ArrayList<Integer>),
Java automatically “wraps” it inside its wrapper class (Integer).

Example:
int num = 5;
Integer obj = num;  // Auto-boxing


Here:
num is a primitive (int)
obj is an object (Integer)
Java automatically converts (boxes) it.

You can also see it in a collection:

ArrayList<Integer> list = new ArrayList<>();
list.add(10); // 10 (int) is auto-boxed to Integer

----------

Unboxing
➡️ Converting a wrapper object back to its primitive type.

When you use an Integer (object) in a place that expects an int (primitive),
Java automatically extracts the value.

Example:
Integer obj = 10;
int num = obj;  // Unboxing


Or:

int n = list.get(0); // get(0) returns Integer → auto-unboxed to int

⚙️ Why it matters:
Because Java’s collections (ArrayList, HashMap, etc.) can only store objects,
boxing and unboxing make it easier to use primitives in them — automatically.
 */