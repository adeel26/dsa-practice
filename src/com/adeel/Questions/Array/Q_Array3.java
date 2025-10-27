package com.adeel.Questions.Array;

import java.util.Arrays;
// Running Sum of 1d Array
public class Q_Array3 {
    public static void main(String[] args) {
        int[] number = {3, 1, 2, 10, 1};
        System.out.println(Arrays.toString(runningSum(number)));
    }

    static int[] runningSum(int[] nums){
        int[] output = new int[nums.length];
        output[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            output[i] = nums[i] + output[i-1];
        }
        return output;
    }
}
