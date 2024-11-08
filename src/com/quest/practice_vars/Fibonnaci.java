package com.quest.practice_vars;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
        int n1=0;
        int n2=1;
        int n3;
        if(num<0){
            System.out.println("Invalid number");
            return;
        }

        for(int i=1;i<=num;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
        }
    }
}
