package com.quest.practice_vars;

import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,4,3,54,34,33,5,4,3};
        Arrays.sort(arr);
        System.out.println("Sorted Array:" + Arrays.toString(arr));
        System.out.println("Duplicate elements in array:");
        int i=0;
        while(i < arr.length - 1) {
            int count = 1;
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }
            if (count>1) {
                System.out.println(arr[i]+" "+count);
            }
            i++;
        }
    }
}



