package main.java.logicbuilding;

// ## 4. Best Time to Buy and Sell Stock

// ### Problem Statement
// You are given an array where each element represents the stock price on a given day.

// Find the maximum profit you can achieve by buying once and selling once.

// ### Example
// Input: `[7,1,5,3,6,4]`
// Output: `5`

// ### Constraints
// - Prices array length ≥ 1

// ### Expected Approach
// - Single pass
// - Track minimum price
public class StockSelling {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int minPrice=arr[0],maxProfit=0;
        for(int i=1;i<arr.length;i++){
            minPrice = Math.min(minPrice, arr[i]);
            maxProfit = Math.max(maxProfit, arr[i]-minPrice);
        }
        System.out.println("The maximum profit will be "+maxProfit);
    }
}
