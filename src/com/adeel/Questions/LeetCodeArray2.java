package com.adeel.Questions;

import java.util.Arrays;
// 1929. Concatenation of Array
public class LeetCodeArray2 {
    public static void main(String[] args) {
        int[] number = {1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(number)));
    }

    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            ans[nums.length + i] = nums[i];
        }
        return ans;
    }
}
