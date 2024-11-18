package com.quest.practice_vars;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5,8,0,6,9};
        int largest = arr[0];
        for(int i=0; i < arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        int secondLargest = arr[0];
        for(int i=0; i< arr.length;i++){
            if(arr[i]!=largest && arr[i]>secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Largest number in array is : " + secondLargest);
    }
}
