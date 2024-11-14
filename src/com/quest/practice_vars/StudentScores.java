package com.quest.practice_vars;

import java.util.Arrays;

public class StudentScores {
    public static void main(String[] args) {
        // Step 1: Initialize arrays
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace"};
        int[] ages = {20, 21, 22, 23, 24, 25, 26};
        int[][] scores = {
                {85, 90, 78, 92, -1},
                {88, 92, 80, -1, 85},
                {75, 80, 70, 60, 72},
                {90, 85, 88, 95, 92},
                {65, 70, 60, 68, 67},
                {80, 85, -1, 90, 95},
                {90, 88, 92, 85, 80}
        };
        // Step 2: Calculate average scores
        calculateAverageScores(names, ages, scores);

        // Step 3: Find the highest scorer
        findHighestScorer(names, ages, scores);

        // Step 4: Ranking students by average score
        rankStudents(names, ages, scores);

        // Step 5: Detect missing data
        detectMissingData(names, scores);
    }

    // Method to calculate and print average scores
    public static void calculateAverageScores(String[] names, int[] ages, int[][] scores) {
        for(int i = 0; i < names.length; i++) {
            int totalScore = 0;
            int count = 0;
            for(int j = 0; j < scores[i].length; j++) {
                if(scores[i][j] != -1) {
                    totalScore += scores[i][j];
                    count++;
                }
            }
            double average = (double) totalScore / count;
            System.out.println("Average score of " + names[i] + " (Age: "+ages[i] +") : " + average);
        }
    }

    // Method to find the student with the highest average score
    public static void findHighestScorer(String[] names, int[] ages, int[][] scores) {
        int highestScoreIndex = 0;
        double highestScore = calculateAverageScore(scores, 0);

        for (int i = 1; i < names.length; i++) {
            double score = calculateAverageScore(scores, i);
            if (score > highestScore) {
                highestScoreIndex = i;
                highestScore = score;
            }
        }
        System.out.println("Highest scorer is " + names[highestScoreIndex]+ " (Age: " + ages[highestScoreIndex] + " )  and score is " + highestScore);
    }

    private static double calculateAverageScore(int[][] scores, int studentIndex) {
        int totalScore = 0;
        int count = 0;
        for(int j = 0; j < scores[studentIndex].length; j++) {
           if(scores[studentIndex][j] != -1) {
               totalScore += scores[studentIndex][j];
               count++;
           }
        }
        if(count == 0) {
            return 0.0;
        }
        return (double) totalScore / count;
    }

    // Method to rank students based on average score
    public static void rankStudents(String[] names, int[] ages, int[][] scores) {
        double[] averageScore = new double[names.length];
        for(int i = 0; i < names.length; i++) {
            averageScore[i] = calculateAverageScore(scores, i);
        }
        int[] indexes = new int[names.length];
        for(int i = 0; i < names.length; i++) {
            indexes[i] = i;
        }
        Arrays.sort(indexes);
        for (int i = 0; i < names.length; i++) {
            int index = indexes[indexes[i]];
            System.out.println((i+1) + "st: " + names[index]+ "(Age: " + ages[index] + ", Score: " + averageScore[i] + ")");
        }
    }

    // Method to detect missing data in the scores array
    public static void detectMissingData(String[] names, int[][] scores) {
        String[] subjects = {"Math","Science","Hindi","English","SocialScience"};
        for (int i = 0; i < names.length; i++) {
            String sName = names[i];
            int[] sScores = scores[i];
            boolean found = false;
            StringBuilder missingData = new StringBuilder();
            for(int j = 0; j < sScores.length; j++) {
                if(sScores[j] == -1) {
                    if (missingData.length() > 0) {
                        missingData.append(",");
                    }
                    missingData.append(subjects[j]);
                    found = true;
                }
            }
            if(found) {
                System.out.println(sName+" has Missing data in "+missingData);
            }
            else {
                System.out.println(sName+" has No Missing data");
            }
        }
    }
}
