package com.quest.practice_vars;

public class Datatype {
    public static void main(String[] args) {
        //char data type
        char a = 'G';
        // Integer data type
        int num = 89;
            //Byte data type
        byte b = 4;
            //Short data type
        short s = 56;
            //Long data type
        long l = 12121;
        //Float data type
        float f = 4.7333434f;
            //double data type
        double d = 4.355453532;
        //boolean data type
        boolean isEven = (num % 2 == 0);
        if (isEven) {
            System.out.println(num + " is even.");
        }
        else {
            System.out.println(num + " is odd.");
        }
        System.out.println("char: " + a);
        System.out.println("integer: " + num);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
    }
}