package com.quest.practice_vars;

import java.util.Arrays;

public class MatrixExample {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = i + j;
            }
        }
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));

        }
    }
}
