package com.adeel.Questions;

import java.util.Arrays;

//1672. Richest Customer Wealth
public class LeetCodeArray4 {
    public static void main(String[] args) {
        int[][] numbers = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(numbers));
        System.out.println(maximumWealth2(numbers));

    }
    static int maximumWealth(int[][] accounts){

        int[] Out = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            int Sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                Sum = Sum + accounts[i][j];
            }
            Out[i] = Sum;
        }
        System.out.println("Final Array " + Arrays.toString(Out));
        // Find Max element after sum
        int max = Out[0];
        for (int i = 1; i < Out.length; i++) {
            if(Out[i] > max){
                max = Out[i];
            }
        }
        return max;
    }

    // Better Approach
    static int maximumWealth2(int[][] accounts) {
        int maxWealth = 0;                 // Step 1: start with 0 (no wealth yet)

        // Step 2: loop through each customer (each row of the 2D array)
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;                   // Step 3: reset sum for this customer

            // Step 4: loop through each bank account for current customer
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];     // add this account’s money to sum
            }

            // Step 5: check if this customer’s total is richer than current max
            if (sum > maxWealth) {
                maxWealth = sum;           // update maxWealth if found richer customer
            }
        }

        // Step 6: after all customers are checked, return the richest amount
        return maxWealth;
    }

}
