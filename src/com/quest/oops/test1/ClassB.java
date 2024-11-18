package com.quest.oops.test1;

public class ClassB {
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("B class Add:"+sum);
    }
    void add(){
        System.out.println("B class Add no arguments");
    }
    static void add(int a){
        System.out.println("inside ClassB static add"+a);
    }
}
