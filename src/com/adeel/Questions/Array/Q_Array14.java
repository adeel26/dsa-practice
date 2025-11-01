package com.adeel.Questions.Array;

import java.util.Arrays;

// Cells with Odd Values in a Matrix
public class Q_Array14 {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{0,1},{1,1}};

        System.out.println(oddCells(m, n, indices));
    }

    static int oddCells(int m, int n, int[][] indices) {
        // Creates a 2D array with m rows and n columns.
        //Java initializes all entries to 0 by default.
        int[][] matrix = new int[m][n];

        // Apply each operation
        for (int i = 0; i < indices.length; i++) {
            int r = indices[i][0]; // get first value of first element array of indices on i = 0 // row index
            int c = indices[i][1]; // get second value of first element array of indices on i = 0 // column index

            // Increment all cells in row r
            for (int j = 0; j < n; j++) {
                matrix[r][j] = matrix[r][j] + 1;
            }

            // Increment all cells in column c
            for (int k = 0; k < m; k++) {
                matrix[k][c] = matrix[k][c] + 1;
            }
        }

        // Count how many cells are odd
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] % 2 != 0){
                    count++;
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));
        return count;
    }
}

/*
This is not working because Matrix size and indices is not equal
for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(indices[i][j] == 0){
                    oddMatrix[i][j] = oddMatrix[i][j] + 1;
                }
                if(indices[i][j] == 1){
                    oddMatrix[i][j] = oddMatrix[i][j] + 1;
                }
            }
        }
 */