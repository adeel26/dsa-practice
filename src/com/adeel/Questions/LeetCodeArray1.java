package com.adeel.Questions;

import java.util.Arrays;
// Build Array from Permutation
public class LeetCodeArray1 {
    public static void main(String[] args) {
        int[] number = {0, 2, 1, 5, 3,4};

        System.out.println(Arrays.toString(buildArray(number)));
    }
    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
