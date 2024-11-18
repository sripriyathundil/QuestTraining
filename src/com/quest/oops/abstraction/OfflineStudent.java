package com.quest.oops.abstraction;

public class OfflineStudent extends Student {
    @Override
    public void attendClass() {
        System.out.println("Offline Student Attend Class");
    }

    @Override
    public void submitAssignment() {
        System.out.println("Offline Student Submit Assignment");
    }
}
