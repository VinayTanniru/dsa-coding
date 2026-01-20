package main.java.logicbuilding;

import java.util.Scanner;

// 26. Write a Java program to count number of digits in a number.
// 27. Write a Java program to find first and last digit of a number.
// 28. Write a Java program to find sum of first and last digit of a number.
// 29. Write a Java program to check whether a number is palindrome or not.
// 30. Write a Java program to calculate sum of digits of a number.
// 31. Write a Java program to calculate product of digits of a number.
// 32. Write a Java program to enter a number and print its reverse.
// 33. Write a Java program to find frequency of each digit in a given integer.
// 34. Write a Java program to enter a number and print it in words.
// 35. Write a Java program to print all ASJavaII character with their values.
// 36. Write a Java program to find power of a number using for loop.
// 37. Write a Java program to find all factors of a number.
// 38. Write a Java program to calculate factorial of a number.
public class NumberManipulations {
    public static void main (String args[]){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter n value");

        int n = s.nextInt();

        if(n <= 0){
            System.out.println("Entered Invalid number");
            s.close();
            return;
        }
        
        countDigits(n);

        findFirstandLastDigit(n);

        s.close();
    }

    static void findFirstandLastDigit(int n){
        int lastDigit = n%10;
        while(n >= 10){
            n=n/10;
        }
        System.out.println("The First digit will be "+n+"\nThe Last digit will be "+lastDigit);
        System.out.println("The Sum of First and Last digit will be "+(n+lastDigit));
    }

    static void countDigits(int n){
        int result=0,count=0,temp = n;
        while(n>0){
            result = n/10;
            n = result;
            count++;
        }
        System.out.println("The no of digits in given number "+temp+" is: "+count);
    }
}
