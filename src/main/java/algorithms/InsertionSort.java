package main.java.algorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {35,-1,-5,0,25,10};
        
        printArray(arr, "Original");

        insertionSortImpl(arr);
        
        printArray(arr, "Sorted");
    }

    static void printArray(int arr[], String message){
        System.out.println(message + "Array " + Arrays.toString(arr));
    }

    static void insertionSortImpl(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
