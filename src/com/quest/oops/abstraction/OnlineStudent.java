package com.quest.oops.abstraction;

public class OnlineStudent extends Student{
    public OnlineStudent() {
        System.out.println("Creating Online Student");
    }

    @Override
    public void attendClass() {
        System.out.println("Online Student Attend Class");
    }

    @Override
    public void submitAssignment() {
        System.out.println("Online Student Submit Assignment");
    }
}
