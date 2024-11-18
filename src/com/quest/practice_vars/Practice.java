package com.quest.practice_vars;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        final int MAX_SCORE = 100;
        int[] math = new int[10];
        int[] science = new int[10];
        int[] english = new int[10];
        Scanner sc = new Scanner(System.in);
        int numStudents=0;
        while(true) {
            System.out.print("Enter number of students (1-100): ");
            if(sc.hasNextInt()){
                numStudents = sc.nextInt();
                if(numStudents>=1 && numStudents<=MAX_SCORE) {
                    break;
                }
                else {
                    System.out.println("Enter the number between 1 and 100");
                }
            }
            else {
                System.out.println("Invalid input. Enter valid input.");
                sc.next();
            }
        }
        for (int i = 0; i < numStudents; i++) {
            String studentName = "";
            while(true) {
                System.out.print("Enter the name of student " + (i+1) + ": ");
                studentName = sc.next();
                boolean isValid = true;
                for(int j = 0; j < studentName.length(); j++) {
                    char ch = studentName.charAt(j);
                    if(!Character.isLetter(ch)) {
                        isValid = false;
                        break;
                    }
                }
                if(isValid) {
                    break;
                }
                else {
                    System.out.println("Name is not valid. Enter valid input.");
                }
            }
            math[i] = getValidScore(sc,"Math");
            science[i] = getValidScore(sc,"Science");
            english[i] = getValidScore(sc,"English");
            int totalScore = math[i] + science[i] + english[i];
            double averageScore = (double) totalScore / numStudents;
            System.out.println("The total score is: " + totalScore);
            System.out.println("The average score is: " + averageScore);
            char grade = getGrade(averageScore);
            System.out.println("The grade is: " + grade);
            provideFeedback(grade);
            if(math[i]<60 || science[i]<60 || english[i]<60) {
                System.out.println("Warning: Needs improvement in individual subjects.");
            }
        }
        System.out.println("Summary: "+numStudents+" students processed.");
    }
    private static int getValidScore(Scanner sc,String subject) {
        final int MAX_SCORE = 100;
        int score;
        while(true) {
            System.out.print("Enter the score for "+subject+" (0-100): ");
            if(sc.hasNextInt()) {
                score = sc.nextInt();
                if(score >0 && score <= MAX_SCORE) {
                    break;
                }
                else {
                    System.out.println("Score must be between 1 and 100");
                }
            }
            else {
                System.out.println("Invalid input. Please Enter valid input.");
                sc.next();
            }
        }
        return score;
    }
    private static char getGrade(double averageScore){
        if(averageScore>=90){
            return 'A';
        }
        else if(averageScore>=80 && averageScore<90){
            return 'B';
        }
        else if(averageScore>=70 && averageScore<80){
            return 'C';
        }
        else if(averageScore>=60 && averageScore<70){
            return 'D';
        }
        else if(averageScore>=50 && averageScore<60){
            return 'E';
        }
        else{
            return 'F';
        }
    }
    private static void provideFeedback(char grade){
    switch (grade){
        case 'A':
            System.out.println("Excellent performance!");
            break;
        case 'B':
            System.out.println("Good job, but you can aim higher!");
            break;
        case 'C':
            System.out.println("You need to put in more effort!");
            break;
        case 'D':
            System.out.println("Your performance is below expectations. Consider seeking help.");
            break;
        case 'E':
            System.out.println("Needs improvement.");
            break;
        case 'F':
            System.out.println("Failure. You need significant improvement.");
            break;
        default:
            System.out.println("Invalid input. Please enter valid input.");
            break;
        }
    }
}
