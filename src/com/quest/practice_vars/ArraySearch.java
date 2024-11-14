package com.quest.practice_vars;

public class ArraySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,8,9,12,23};
        int key = 8;
        int index = search(arr, key);
        System.out.println(index);
    }
    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
