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
