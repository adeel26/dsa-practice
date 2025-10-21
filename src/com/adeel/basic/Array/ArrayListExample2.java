package com.adeel.basic.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        // Taking input from user
        for (int i=0; i<5; i++){
            list.add(input.nextInt());
        }

        System.out.println(list);

        // get item at any index
        for (int i=0; i<5; i++){
            System.out.println(list.get(i));
        }


    }
}
