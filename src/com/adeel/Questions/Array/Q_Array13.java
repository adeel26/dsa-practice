package com.adeel.Questions.Array;

import java.util.Arrays;

// Flipping an Image
public class Q_Array13 {
    public static void main(String[] args) {
        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        flipAndInvertImage(image);

    }
    static int[][] flipAndInvertImage(int[][] image) {
        int[][] reverseImage = new int[image.length][];

        // Reverse array
        for (int i = 0; i < image.length; i++) {
            reverseImage[i] = new int[image[i].length];
            for (int j = 0; j < image[i].length ; j++) {
                reverseImage[i][j] = image[i][image[i].length-1-j];
            }
        }
        System.out.println("Reverse Array");
        System.out.println(Arrays.deepToString(reverseImage));

        // Flip Array
        int[][] flipArray = new int[reverseImage.length][];
        for (int i = 0; i < reverseImage.length; i++) {
            flipArray[i] = new int[reverseImage[i].length];
            for (int j = 0; j < reverseImage[i].length ; j++) {
                if(reverseImage[i][j] == 0){
                    flipArray[i][j] = 1;
                }else{
                    flipArray[i][j] = 0;
                }
            }
        }
        System.out.println("Flip Array");
        System.out.println(Arrays.deepToString(flipArray));

        return flipArray;
    }
}
