package com.adeel.Other_Path.Projects.BankingSystem;

import java.util.Scanner;

public class BankingSystem {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        // Banking System in Java

        // Declare variables
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning) {
            // Display Menu
            System.out.println("-----------------");
            System.out.println("Banking System");
            System.out.println("-----------------");
            System.out.println("1 - Show Balance");
            System.out.println("2 - Deposit Cash");
            System.out.println("3 - Withdraw Cash");
            System.out.println("4 - Exit");
            System.out.println("-----------------");

            System.out.print("Select your option (1-4): ");
            choice = input.nextInt();

            // Get and process users choice
            switch (choice) {
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance = balance + deposit();
                    showBalance(balance);
                    break;
                case 3:
                    balance = balance - withdraw(balance);
                    showBalance(balance);
                    break;
                case 4:
                    System.out.println("Thank you! For using Banking System");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println();
        }


        input.close();
    }

    // showBalance()
    static void showBalance(double currentBalance){
        System.out.printf("Current Balance is Rs %.2f", currentBalance);
    }

    // deposit()
    static double deposit(){
        System.out.print("Enter Amount to Deposit: ");
        double amount = input.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }else{
            return amount;
        }
    }

    // withdraw()
    static double withdraw(double currentBalance){
        System.out.print("Enter Amount to Withdraw: ");
        double amount = input.nextDouble();

        if(amount > currentBalance){
            System.out.println("Not enough balance");
            return 0;
        }else if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }else{
            return amount;
        }
    }

}
