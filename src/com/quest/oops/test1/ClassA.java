package com.quest.oops.test1;

public class ClassA extends ClassB {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.add(8,2);
    }
    ClassA() {

        System.out.println("A Class constructor");
    }
    void add(){
        this.add();
        System.out.println("A class Add method with no arguments");
    }
    @Override
    void add(int a,int b){
        super.add(a,b);
        int sum = a+b;
        System.out.println("A class Add method with arguments:"+sum);
    }
    static void add(int a){
        System.out.println("inside ClassA static add"+a);
    }

}
//can we extend static method in inherit class: no , inner class also doesnt allow inheritence
//super keyword