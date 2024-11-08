package com.quest.practice_vars;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String str="";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        if(str==null){
            System.out.println("Invalid String");
            return;
        }
        StringBuilder sb = new StringBuilder(str);
        StringBuilder reverse = sb.reverse();
        String revStr = reverse.toString();
        if(str.equals(revStr)){
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("String is not Palindrome");
        }
    }
}
