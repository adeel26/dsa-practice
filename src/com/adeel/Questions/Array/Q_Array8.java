package com.adeel.Questions.Array;

import java.util.Arrays;

// How Many Numbers Are Smaller Than the Current Number
public class Q_Array8 {
    public static void main(String[] args) {
        int[] number = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(number)));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];


        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            result[i] = count;
        }

        return result;
    }
}
