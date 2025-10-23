package com.adeel.Questions;

import java.util.Arrays;

public class LeetCodeArray3 {
    public static void main(String[] args) {
        int[] number = {3, 1, 2, 10, 1};
        System.out.println(Arrays.toString(runningSum(number)));
    }

    static int[] runningSum(int[] nums){
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i] = nums[i] + output[i];
        }
        return output;
    }
}
