package com.quest.practice_vars;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8};
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=totalSum-arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
