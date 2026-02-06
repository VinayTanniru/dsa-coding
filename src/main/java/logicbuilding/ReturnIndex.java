package main.java.logicbuilding;


// ## 2. Two Sum;

// ### Problem Statement
// Given an array of integers and a target value, return the indices of the two numbers such that they add up to the target.

// You may assume that exactly one solution exists.

// ### Example
// Input: `nums = [2, 7, 11, 15], target = 9`
// Output: `[0, 1]`

// ### Constraints
// - `2 ≤ nums.length ≤ 10^5`

// ### Expected Approach
// - HashMap for constant-time lookup

public class ReturnIndex {
    public static void main(String[] args) {

        int nums [] = {2, 7, 11, 15};

        int target = 9;

        findIndices(nums, target);
        
    }

    static void findIndices(int arr[],int target){

            int arrayLength = arr.length;
            for(int i=0; i<arrayLength;i++ ){
                for (int j=i+1;j<arrayLength;j++){
                    if (arr[i]+arr[j] == target){
                        System.out.println("The Indices will be :" +i+"  "+j);
                        break;
                    }
                }
            }
    }
}
