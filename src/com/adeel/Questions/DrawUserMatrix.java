package com.adeel.Questions;

import java.util.Scanner;

public class DrawUserMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Rows: ");
        int rows = input.nextInt();

        System.out.print("Enter Columns: ");
        int columns = input.nextInt();

        System.out.print("Enter Symbol: ");
        char symbol = input.next().charAt(0);

        for (int i=1; i<=rows; i++) {
            for (int j=1; j<=columns; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    input.close();
    }
}
