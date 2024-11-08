package com.quest.practice_vars;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the starting number");
        double num1 = sc.nextDouble();
        double num2;
        double result = 0;
        int choice;
        System.out.println("Current Result:" + num1);
        do {
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Square Root");
            System.out.println("6.Clear Current Result");
            System.out.println("7.Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the number to be added");
                    num2 = sc.nextDouble();
                    result = num1 + num2;
                    num1 = result;
                    System.out.println("Addition Result: " + num1);
                    break;
                case 2:
                    System.out.println("Enter the number to be subtracted");
                    num2 = sc.nextDouble();
                    result = num1 - num2;
                    num1 = result;
                    System.out.println("Subtraction Result: " + num1);
                    break;
                case 3:
                    System.out.println("Enter the number to be multiplied");
                    num2 = sc.nextDouble();
                    result = num1 * num2;
                    num1 = result;
                    System.out.println("Multiplication Result: " + num1);
                    break;
                case 4:
                    System.out.println("Enter the number to be divised");
                    num2 = sc.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Division by zero!");
                    } else {
                        result = num1 / num2;
                        num1 = result;
                        System.out.println("Division Result: " + num1);
                    }
                    break;
                case 5:
                    if (num1 < 0) {
                        System.out.println("You have entered a negative number");
                    } else {
                        result = Math.sqrt(num1);
                        num1 = result;
                        System.out.println("Square Root Result: " + result);
                    }
                    break;
                case 6:
                    System.out.println("Clearing the Result...");
                    result = 0;
                    System.out.println("Current Result: " + result);
                    break;
                case 7:
                    System.out.println("Exit Program");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;

            }
        }
        while (choice != 7);
    }
}
