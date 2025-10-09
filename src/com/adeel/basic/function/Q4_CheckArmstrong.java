package com.adeel.basic.function;

public class Q4_CheckArmstrong {
    public static void main(String[] args) {
        for(int i=100; i <= 999; i++){
            if(isArmstrong(i)){
                System.out.println(i + " is Armstrong number");
            }
        }
    }

    static boolean isArmstrong(int number){
        int orginal = number;
        int Sum = 0;

        while (number > 0){
            int rem = number % 10;
            number = number / 10;
            Sum = Sum + rem * rem * rem;
        }

        return Sum == orginal;
    }

}

