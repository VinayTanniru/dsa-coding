package main.java.logicbuilding;

// ## 1. Find the Missing Number

// ### Problem Statement
// You are given an array containing `n` distinct numbers taken from the range `0` to `n`. One number is missing from the array.

// Return the missing number.

// ### Example
// Input: `[3, 0, 1]`
// Output: `2`

// ### Constraints
// - `1 ≤ n ≤ 10^5`
// - Array contains `n` distinct numbers

// ### Expected Approach
// - Mathematical sum or XOR
// - O(n) time, O(1) space
public class MissingNumber {
    public static void main(String[] args) {
        // int arr[] = {3,0,1};
        int arr[] = {4,2,0,3};
        bruteMissingNumber(arr);
        xorMissingNumber(arr);
    }

    static void bruteMissingNumber(int arr[]){
        int arrayLength = arr.length;
        int actualSum = arrayLength * (arrayLength +1)/2;
        int currentSum=0;

        System.out.println("The actual sum: "+actualSum);
        for (int i=0; i < arrayLength; i++){
            currentSum += arr[i];
        }

        System.out.println("The current sum: "+currentSum);
        System.out.println("The missing number: "+(actualSum - currentSum ));
    }

    static void xorMissingNumber(int arr[]){
        int arrayLength = arr.length;
        int xorResult = 0;

        for(int i=0; i<=arrayLength ; i++){
            xorResult ^= i;
        }

        for (int num : arr){
            xorResult ^= num;
        }
        System.out.println("The missing number: "+xorResult);
    }
}
