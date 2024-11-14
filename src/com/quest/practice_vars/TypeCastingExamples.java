package com.quest.practice_vars;

public class TypeCastingExamples {
    public static void main(String[] args) {
        //implicit
        int n=5;
        double d=n;
        System.out.println(d);

        double d1=9.78;
        int n1= (int) d1;
        System.out.println(n1);

        int n2=200;
        byte b= (byte) n2;
        System.out.println(b);
    }
}
