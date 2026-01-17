package main.java.algorithms;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {

		int arr [] = {35,-1,-5,0,25,10};

		System.out.println("Original Array:  "+ Arrays.toString(arr));

		bubbleSortImpl(arr);

		System.out.println("Sorted Array:  "+ Arrays.toString(arr));
	}

	static void bubbleSortImpl(int arr[]) {
		boolean swapped;

        if(arr.length < 2 || arr == null){
            return;
        }
		
		//Will run for n-1 times where n refers to array length
		for(int i=0; i<arr.length - 1; i++) {
			swapped = false;
			
			//for each iteration large number will come to right end
			for(int j=1; j < arr.length-i ; j++) {
			    
			    //swap only if the current element is smaller than previous element
				if(arr[j] < arr[j-1]) {
				    
				    //swap
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swapped = true;
				}
			}
            System.out.println("Iteration "+(i+1)+": "+Arrays.toString(arr));
            //if there is no swap for a particular Iteration of i then it means array is sorted and program can be stopped
			if(!swapped) {
				break;
			}
		}
	}
}
