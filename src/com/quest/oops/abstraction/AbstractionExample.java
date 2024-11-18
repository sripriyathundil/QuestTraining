package com.quest.oops.abstraction;

public class AbstractionExample {
    public static void displayStudentDetails(Student student) {
        student.attendClass();
        student.submitAssignment();
        student.study();
    }
    public static void main(String[] args) {
        Student online = new OnlineStudent();
        displayStudentDetails(online);
        Student offline = new OfflineStudent();
        Student regular = new RegularStudent();
        displayStudentDetails(regular);
        displayStudentDetails(offline);
//        online.attendClass();
//        online.submitAssignment();
//        online.study();
//        offline.attendClass();
//        offline.submitAssignment();
//        regular.attendClass();
//        regular.submitAssignment();


//        Student online1 = StudentFactory.getStudent("online");
//        Student offline1 = StudentFactory.getStudent("offline");
//        Student regular1 = StudentFactory.getStudent("regular");
//        online1.attendClass();
//        offline1.attendClass();
//        regular1.attendClass();
//        online1.submitAssignment();
//        offline1.submitAssignment();
//        regular1.submitAssignment();

    }

}
