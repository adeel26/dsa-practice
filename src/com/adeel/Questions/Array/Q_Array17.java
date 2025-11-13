package com.adeel.Questions.Array;

import java.util.Arrays;

// Transpose Matrix
public class Q_Array17 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(transpose(matrix)));
    }
    static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] output = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                output[j][i] = matrix[i][j];
            }
        }

        return output;
    }
}
