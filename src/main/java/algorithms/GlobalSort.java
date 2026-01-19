package main.java.algorithms;

import java.util.Arrays;

public class GlobalSort {

    public static void main(String[] args) {
        int arr [] = { 5, 4, 3, 2, 1};
        // int arr [] = {1};
        if(! validateArray(arr)){
           System.out.println("Array should not be null or length must be greater than 1 : "+ Arrays.toString(arr));
           return;
        }
        
        printArray(arr,"Original");
        
        int[] bubbleArr = arr.clone();
        
        int[] insertionArr = arr.clone();
        
        bubbleSortImpl(bubbleArr);
        
        printArray(bubbleArr,"Sorted Using Bubble Sort");
        
        insertionSortImpl(insertionArr);
        
        printArray(insertionArr,"Sorted Using Insertion Sort");
    }
    
    static boolean validateArray(int arr[]){
        return arr != null && arr.length > 1 ;
    }
    
    static void printArray(int arr[], String message){
        System.out.println(message+" Array : "+ Arrays.toString(arr));
    }
    
    static  void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    static void bubbleSortImpl(int arr[]){
        boolean swapped;
        for(int i=0; i < arr.length-1; i++){
            swapped = false;
            for(int j=1; j < arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                    swapped = true;
                }
            }
            
            if(!swapped){
                break;
            }
        }
    }
    
    static void insertionSortImpl(int arr[]){
        for(int i=0; i < arr.length-1; i++){
            for(int j= i+1 ; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
}
