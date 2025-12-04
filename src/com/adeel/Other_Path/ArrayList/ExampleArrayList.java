package com.adeel.Other_Path.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ExampleArrayList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the # of food you would like: ");
        int numOfFood = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numOfFood; i++) {
            System.out.print("Enter food #" + i + ": ");
            String food = input.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        input.close();
    }
}

/*
✅ Why do we write input.nextLine() after storing the input?
Because nextInt() leaves a newline in the buffer, and nextLine() removes that newline.
This does NOT affect the value stored in your variable.

input.nextLine() after nextInt() is only to fix the NEXT input, not the one you already stored.

✅ nextLine() is only used to clean the Scanner buffer for the NEXT input.
 */