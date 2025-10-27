package com.adeel.Questions.Array;
//Find the Highest Altitude
import java.util.Arrays;

public class Q_Array12 {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));

    }
    static int largestAltitude(int[] gain) {
        int max = 0;
        int[] gainCalc = new int[gain.length + 1];
        gainCalc[0] = 0;
        for (int i = 1; i < gainCalc.length; i++) {
            gainCalc[i] = gainCalc[i-1] + gain[i-1];
            if(gainCalc[i] > max){
                max = gainCalc[i];
            }
        }
        System.out.println(Arrays.toString(gainCalc));
        return max;
    }
}

/*
static int largestAltitude(int[] gain) {
    int max = 0;
    int current = 0;

    for (int g : gain) {
        current += g;        // cumulative sum
        max = Math.max(max, current);
    }

    return max;
}
 */
//////////////////////////////////////////
/*
public class Q_Array12 {
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(gain));
    }

    static int largestAltitude(int[] gain) {
        int current = 0; // current altitude
        int max = 0;     // highest altitude

        for (int i = 0; i < gain.length; i++) {
            current += gain[i];          // move to next altitude
            if (current > max) {
                max = current;           // update highest point
            }
        }

        return max;
    }
}
 */