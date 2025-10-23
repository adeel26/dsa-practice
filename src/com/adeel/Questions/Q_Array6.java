package com.adeel.Questions;

import java.util.ArrayList;
import java.util.List;
// 1431. Kids With the Greatest Number of Candies
public class Q_Array6 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        for(int n : candies){
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    static List<Boolean> kidsWithCandies(int[] candiesArray, int extraCandiesVariable) {
        List<Boolean> result = new ArrayList<>(candiesArray.length);

        // find maximum candy
        int max = 0;
        for (int i = 0; i < candiesArray.length; i++) {
            if(candiesArray[i] > max){
                max = candiesArray[i];
            }
        }
        System.out.println("Maximum candy kid have " + max);


        // Check each kid
        for (int i = 0; i < candiesArray.length; i++) {
            if(candiesArray[i] + extraCandiesVariable >= max){
                result.add(true);
            }else result.add(false);
        }

        return  result;
    }
}
