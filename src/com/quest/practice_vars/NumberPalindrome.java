package com.quest.practice_vars;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        int rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        while (num != 0) {
            int reminder = num % 10;
            rev = rev * 10 + reminder;
            num /= 10;
        }
        if (num==rev) {
            System.out.println("It is a palindrome.");
        }
        else {
            System.out.println("It is not a palindrome.");
        }
    }
}
