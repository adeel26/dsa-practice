package com.adeel.basic.Array;

import java.util.Arrays;

public class MultiDimArraySimple {
    public static void main(String[] args) {
        // 2D array = An array where each element is an array
        //            Useful for storing a matrix of data
        String[] fruits = {"Apple", "Banana", "Orange"};
        String[] vegetables = {"Potato", "Onion", "Carrot"};
        String[] meat = {"Chicken", "Beef", "Fish", "Goat"};

        String[][] Groceries = {fruits, vegetables, meat};

        for (int row=0; row < Groceries.length; row++){
            for (int col = 0; col < Groceries[row].length ; col++) {
                System.out.print(Groceries[row][col] + " ");
            }
            System.out.println();
        }
    }
}

/*
Think of a 2D array like a table — rows and columns.
Let’s say you have:

1 2 3
4 5 6


Here’s what happens line by line in your code:

for (int row = 0; row < arr.length; row++) {     // outer loop → goes row by row
    for (int col = 0; col < arr[row].length; col++) {  // inner loop → goes column by column
        arr[row][col] = input.nextInt();         // takes input for each cell
    }
}


🧠 So mentally:

Outer loop = which row you’re on

Inner loop = which column inside that row

arr[row][col] = a single cell in the 2D grid

➡️ Example: if you enter
1 2 3 4 5 6

It fills like this:

arr[0][0] = 1
arr[0][1] = 2
arr[0][2] = 3
arr[1][0] = 4
arr[1][1] = 5
arr[1][2] = 6
 */
