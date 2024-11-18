package com.quest.practice_vars;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        final int MAX_SCORE = 100;
        int[] math = new int[10];
        int[] science = new int[10];
        int[] english = new int[10];
        Scanner sc = new Scanner(System.in);

        // Validate number of students
        int numStudents = 0;
        while (true) {
            System.out.println("Enter the number of students (between 1 and 100): ");
            if (sc.hasNextInt()) {
                numStudents = sc.nextInt();
                if (numStudents >= 1 && numStudents <= 100) {
                    break;
                } else {
                    System.out.println("Number of students must be between 1 and 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next();
            }
        }

        for (int i = 0; i < numStudents; i++) {
            // Get valid student name
            String name = "";
            while (true) {
                System.out.println("Enter the name of student " + (i + 1) + ": ");
                name = sc.next();
                boolean isValid = true;
                for (int j = 0; j < name.length(); j++) {
                    char ch = name.charAt(j);
                    if (!Character.isLetter(ch)) {
                        isValid = false;
                        break;
                    }
                }
                if (isValid) {
                    break;
                } else {
                    System.out.println("Name is not valid. Please enter a valid name containing only letters.");
                }
            }

            // Validate Math score
            math[i] = getValidScore(sc, "Math");

            // Validate Science score
            science[i] = getValidScore(sc, "Science");

            // Validate English score
            english[i] = getValidScore(sc, "English");

            // Calculate total and average score
            int totalScore = math[i] + science[i] + english[i];
            double averageScore = (double) totalScore / 3;

            // Output results
            System.out.println("Total score: " + totalScore);
            System.out.println("The average score: " + averageScore);

            // Assign grade based on average score
            char grade = getGrade(averageScore);
            System.out.println("Grade: " + grade);

            // Provide feedback based on grade
            provideFeedback(grade);

            // Warning if any subject score is below 60
            if (math[i] < 60 || english[i] < 60 || science[i] < 60) {
                System.out.println("Warning: Needs improvement in individual subjects.");
            }
        }
        System.out.println("Summary: " + numStudents + " students processed.");
    }

    // Method to get valid score for a subject
    static int getValidScore(Scanner sc, String subject) {
        final int MAX_SCORE = 100;
        int score;
        while (true) {
            System.out.print("Enter the score for " + subject + " (0-100): ");
            if (sc.hasNextInt()) {
                score = sc.nextInt();
                if (score >= 0 && score <= MAX_SCORE) {
                    break;
                } else {
                    System.out.println("Score must be between 0 and " + MAX_SCORE + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer score.");
                sc.next();
            }
        }
        return score;
    }

    // Method to find grade based on average score
    private static char getGrade(double averageScore) {
        if (averageScore >= 90) {
            return 'A';
        } else if (averageScore >= 80) {
            return 'B';
        } else if (averageScore >= 70) {
            return 'C';
        } else if (averageScore >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Method to provide feedback based on grade
    private static void provideFeedback(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Excellent Performance!");
                break;
            case 'B':
                System.out.println("Good job, but you can aim higher!");
                break;
            case 'C':
                System.out.println("You can do better.");
                break;
            case 'D':
                System.out.println("Needs improvement.");
                break;
            case 'F':
                System.out.println("Failure. You need significant improvement.");
                break;
            default:
                System.out.println("Invalid grade.");
                break;
        }
    }
}
