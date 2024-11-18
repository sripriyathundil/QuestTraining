package com.quest.oops.test1;

public class RandomClass extends AbstractClass{
    public static void main(String[] args) {
    AbstractClass abstractClass = new AbstractClass() {  //constructor// cna create implementation of abstract class
        @Override
        void drive() {
            System.out.println("Random Object");
        }
        @Override
        void add(){
            System.out.println("Random Add Object");
            super.add();
        }
    };
    abstractClass.drive();
    RandomClass randomClass = new RandomClass();
    randomClass.drive();
    randomClass.add();
    }



    @Override
        void drive(){
            System.out.println("Random Abstract Object");
        }
        void add(int a){
            super.add();
            System.out.println("Random Add Object");
        }

    public void add(){
    System.out.println("Random Class");
}
}
//take add() from random class itself