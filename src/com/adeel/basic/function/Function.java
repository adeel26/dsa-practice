package com.adeel.basic.function;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();
        String welcomeMsg = greet(name);
        System.out.println(welcomeMsg);
    }
    public static <a> String greet(String InputName){
        String Msg = "Hello " + InputName + ", Welcome!";
        return Msg;
    }
}
