package com.quest.practice_vars;

public class PracticeVars {
    final static int VOTE_AGE=18;
//    final is used make VOTE_AGE constant
//    static method cannot hold non static method as main method is mandatorily static and since VOTEAGE is used in main it has to be static
    public static void main(String[] args) {
        int age=18;
        double salary=10000.00;
        char gender='M';
        String firstName="John";
        String lastName="Doe";

        System.out.println("age="+age);
        System.out.println("salary="+salary);
        System.out.println("gender="+gender);
        System.out.println("firstName="+firstName);
        System.out.println("lastName="+lastName);

        age=20;
        System.out.println("age="+age);
        System.out.println("vote age ="+VOTE_AGE);
//        VOTE_AGE=21; It cannot be changed since VOTE_AGE is final

        practiceConversion();
        stringConcatenation();
        stringMethods();
    }
    //    static method cannot hold non static method as main method is mandatorily static and since VOTEAGE is used in main it has to be static
    private static void practiceConversion(){
        int a=20;
        double b=25.5;
        double sum=a+b;
//        conversion take place automatically int to double
        int round=(int)b;
//        this doesn't happen automatically
        System.out.println("sum="+sum);
        System.out.println("round="+round);
    }
//    private is used so we can access in same class whereas public is used to acess with in different class
    private static void stringConcatenation(){
        String s1="John";
//        variables
        String s2="Doe";
        String s3=s1 + " " + s2;
//        + can be used for concatenation
        System.out.println(s3);

        int age=20;
        System.out.println("name = "+s3+" age = " +age);
    }
    private static void stringMethods(){
        String s1="John";
        String s2="JOHN";
        String s4=new String("Hello World");
        String s3=new String("hello world");
//        s1 and s2 are literals which has special memory allocation and s3 is object created using heap memory using new keyword
        System.out.println(s3.length());
        System.out.println(s3.equalsIgnoreCase(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
//        IgnoreCase use to ignore the cases and check only for the content
        System.out.println(s3.equals(s2));
        System.out.println(s4==s3);
    }
}
