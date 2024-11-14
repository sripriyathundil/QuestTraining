package com.quest.practice_vars;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int arr[]={9,4,5,3,2,8};
        sortArray(arr);
        printArray(arr);
    }

    public static int[] sortArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

}
