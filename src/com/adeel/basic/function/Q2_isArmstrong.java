package com.adeel.basic.function;

import java.util.Scanner;

public class Q2_isArmstrong {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(isArmstrong(num)){
            System.out.println(num + " is an Armstrong number");
        }
        else{
            System.out.println(num + " is not a Armstrong number.");
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
