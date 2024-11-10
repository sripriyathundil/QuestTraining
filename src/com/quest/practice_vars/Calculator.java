package com.quest.practice_vars;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = getValidInput("Enter the first number");
        double num2;
        double result = 0;
        int choice;

        System.out.println("Current Result: " + num1);

        do {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Clear Current Result");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = getValidChoice();

            switch (choice) {
                case 1:
                    num2 = getValidInput("Enter the number to be added");
                    result = num1 + num2;
                    num1 = result;
                    System.out.println("Current Result: " + num1);
                    break;
                case 2:
                    num2 = getValidInput("Enter the number to be subtracted");
                    result = num1 - num2;
                    num1 = result;
                    System.out.println("Current Result: " + num1);
                    break;
                case 3:
                    num2 = getValidInput("Enter the number to be multiplied");
                    result = num1 * num2;
                    num1 = result;
                    System.out.println("Current Result: " + num1);
                    break;
                case 4:
                    num2 = getValidInput("Enter the number to be divided");
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        result = num1 / num2;
                        num1 = result;
                        System.out.println("Current Result: " + num1);
                    }
                    break;
                case 5:
                    if (num1 < 0) {
                        System.out.println("Error: Cannot calculate square root of a negative number.");
                    } else {
                        result = Math.sqrt(num1);
                        num1 = result;
                        System.out.println("Current Result: " + result);
                    }
                    break;
                case 6:
                    System.out.println("Clearing the Result...");
                    result = 0;
                    num1 = result;
                    System.out.println("Current Result: " + result);
                    break;
                case 7:
                    System.out.println("Exiting Program.");
                    break;
                default:
                    System.out.println("Invalid Choice. Please choose a valid option.");
                    break;
            }
        } while (choice != 7);
    }

    // Method to get input from the user
    private static double getValidInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt + ": ");
            if (sc.hasNextDouble()) {
                value = sc.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next();
            }
        }
        return value;
    }

    // Method to get choice (1-7) from the user
    private static int getValidChoice() {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                if (choice >= 1 && choice <= 7) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please select a valid option (1-7).");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number (1-7).");
                sc.next();
            }
        }
        return choice;
    }
}
