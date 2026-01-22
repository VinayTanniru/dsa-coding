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
            System.out.println("Entered Positive numbers greater than Zero");
            s.close();
            return;
        }
        
        // countDigits(n);

        // findFirstAndLastDigit(n);

        // isPalindrome(n);

        // calculateSum(n);

        // calculateProduct(n);

        frequencyOfDigit(n);

        s.close();
    }

    static void findFirstAndLastDigit(int n){

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

    static void isPalindrome(int n){
        int reverseNumber=0,inputNumber;
        inputNumber = n;
        while(n>0){
            int temp =n%10;
            reverseNumber = (reverseNumber * 10 ) + temp ;
            n=n/10;
        }
        System.out.println("The Reverse of all digits in number be "+ reverseNumber);
        if(inputNumber == reverseNumber ){
            System.out.println("The number is palindrome");
        }else{
            System.out.println("The number is not an palindrome");
        }
    }

    static void calculateSum(int n){

        int sumOfDigits=0;
        while(n > 0){
                int temp = n%10;
                sumOfDigits += temp;
                n = n/10;
        }
        System.out.println("The Sum of all digits in number be "+ sumOfDigits);
    }

    static void calculateProduct(int n){

        int productOfDigits=1;
        while(n > 0){
                int temp = n%10;
                productOfDigits *= temp;
                n = n/10;
        }
        System.out.println("The Product of all digits in number be "+ productOfDigits);
    }

    static void frequencyOfDigit(int n){
        int[] frequency = new int[10]; // Array to store frequency of digits 0-9
        while(n>0){
            int digit = n%10;
            frequency[digit]++;
            n=n/10;
        }
        System.out.println("Frequency of each digit:");
        for(int i = 0; i < 10; i++){
            if(frequency[i] > 0){
                System.out.println("Digit " + i + " appears " + frequency[i] + " time(s)");
            }
        }
    }
}
