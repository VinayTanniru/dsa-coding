package main.java.logicbuilding;

import java.util.Scanner;

// 17. Write a Java program to print all natural numbers from 1 to n. - using while loop
// 18. Write a Java program to print all natural numbers in reverse (from n to 1). - using while loop
public class NaturalNumbers {

    private static final String HEADER =
        "The numbers are fetched like below:";
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter n value");

        int n = s.nextInt();

        if(n <= 0){
            System.out.println("Entered Invalid number");
            s.close();
            return;
        }

        System.out.println(HEADER);
        printAscendingNumbers(n);

        System.out.println();

        System.out.println(HEADER);
        printDescendingNumbers(n);

        s.close();
        
    }

    static void printAscendingNumbers(int n){
        int i=1;
        while(i<=n){
            if(i<n){
                System.out.print(i+",");
            }else{
                System.out.print(i);
            }
            
            i++;
        }
    }

    static void printDescendingNumbers(int n){
        int i=n;
        while(i>=1){
            if(i>1){
                System.out.print(i+",");
            }else{
                System.out.print(i);
            }
            i--;
        }
    }
}