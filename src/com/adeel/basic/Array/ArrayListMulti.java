package com.adeel.basic.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMulti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> multilist = new ArrayList<>();

        // initialisation
        for (int i = 0; i < 3; i++){
            multilist.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                multilist.get(i).add(input.nextInt());
            }
        }

        System.out.println(multilist);
    }
}
