package com.quest.practice_vars;

public class PracticeOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
//Relational Operators
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a > b);

        boolean x = true;
        boolean y = false;
//Logical operators
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(x != y);
//Assignment operators
        int z = 10;
        z += 5; //z=z+5;
        System.out.println(z);
//unary operators
        System.out.println(z);//z=15
        System.out.println(z++);//z=16
        System.out.println(++z);//z=17
        System.out.println(z);//z=17
        System.out.println(z--);//z=16 and 17-1=16
        System.out.println(--z);//z=16 and becomes 16-1 =15
        System.out.println(z);//z=15

        int p = 10;
        int q = 5;
        //Ternary operator
        int result = p > 15 ? q++ : 0;
        System.out.println(result);

    }
}