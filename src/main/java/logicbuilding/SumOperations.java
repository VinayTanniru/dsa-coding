package main.java.logicbuilding;

import java.util.Scanner;

// 22. Write a Java program to find sum of all natural numbers between 1 to n.
// 23. Write a Java program to find sum of all even numbers between 1 to n.
// 24. Write a Java program to find sum of all odd numbers between 1 to n.
public class SumOperations {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter n value");

        int n = s.nextInt();

        if(n <= 0){
            System.out.println("Entered Invalid number");
            s.close();
            return;
        }
        
        calculateSumOfNaturalNumbers(n);
        calculateSumOfEvenNumbers(n);
        calculateSumOfOddNumbers(n);

        s.close();
    }

    private static void calculateSumOfOddNumbers(int n) {
        int i=1,sum=0;
        while(i<=n){
            sum += i;
            i += 2;
        }
        System.out.println("Sum of Odd numbers from 1 to "+n+" is "+sum);    
    }

    private static void calculateSumOfEvenNumbers(int n) {
        int i=2,sum=0;
        while(i<=n){
            sum += i;
            i += 2;
        };
        System.out.println("Sum of Even numbers from 1 to "+n+" is "+sum);  
    }

    private static void calculateSumOfNaturalNumbers(int n) {
        int i=1,sum=0;
        while(i<=n){
            sum += i;
            i++;
        }
       System.out.println("Sum of Natural numbers from 1 to "+n+" is "+sum);
    }
}
