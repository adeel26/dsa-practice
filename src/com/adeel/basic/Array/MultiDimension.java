package com.adeel.basic.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] multi = new int[3][];

        int[][] arr2D = {
                {1, 2, 3},      // 0th index
                {4, 5},         // 1st index
                {6, 7, 8, 9}    // 2nd index
        };
        /*
            arr2D[2] = {6, 7, 8, 9}
            arr2D[2][0] = {6}
         */

        // Input
        int[][] arr = new int[3][3];
        for ( int row = 0; row < arr.length; row++){
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++){
                System.out.print("Element [" + row + "][" + col + "]: ");
                arr[row][col] = input.nextInt();
            }

        }

        // Output
        for ( int row = 0; row < arr.length; row++){
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // Output via toString
        for ( int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

    }
}
