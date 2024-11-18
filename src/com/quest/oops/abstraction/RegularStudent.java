package com.quest.oops.abstraction;

public class RegularStudent extends Student {
    @Override
    public void attendClass() {
        System.out.println("Attend Online and Offline Classes");
    }

    @Override
    public void submitAssignment() {
        System.out.println("Regular student Submit assignment");
    }
}
