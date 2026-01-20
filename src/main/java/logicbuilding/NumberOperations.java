package main.java.logicbuilding;

//Number Operations
// 1. Write a Java program to find maximum between two numbers.
// 2. Write a Java program to find maximum between three numbers.
// 3. Write a Java program to check whether a number is negative, positive or zero.
// 4. Write a Java program to check whether a number is divisible by 5 and 11 or not.
// 5. Write a Java program to check whether a number is even or odd.
// 6. Write a Java program to check whether a year is leap year or not.
// 20. Write a Java program to print all even numbers between 1 to 100. - using while loop
// 21. Write a Java program to print all odd number between 1 to 100.
// 25. Write a Java program to print multiplication table of any number.

public class NumberOperations {
    public static void main(String[] args) {
        // maxOf2Numbers(75,65);
        // maxOf3Numbers(10,10,5);
        // checkNumberSign(-5);
        // checkDivisibility(65);
        // checkEvenOdd(7);
        // findingLeapYear(2020);
        printEvenNumbers();
        System.out.println();
        printOddNumbers();
        System.out.println();
        printTable(5);

    }

    static void maxOf2Numbers(int a,int b){
        if(a>b){
            System.out.println("The Value of "+a+ " is Bigger");
        }else if (a==b) {
            System.out.println("The Value of "+a+ " and "+b+" are Equal");
        }else{
            System.out.println("The Value of "+b+ " is Bigger");
        }
    }

    static void maxOf3Numbers(int a,int b,int c){
        if(a == b &&  a == c){
            System.out.println("The Value of "+a+","+b+","+c+ " are Equal");
        }else if (a >= b && a >= c) {
            System.out.println("The Value of "+a + " is bigger");
        } else if (b >= a && b >= c) {
            System.out.println("The Value of "+b + " is bigger");
        } else {
            System.out.println("The Value of "+c + " is bigger");
        }
    }

    static void checkNumberSign(int a){
        if(a>0){
            System.out.println("The Value of "+a+ " is Positive");
        }else if(a==0){
            System.out.println("The Value of "+a+ " is Zero");
        }else{
            System.out.println("The Value of "+a+ " is Negative");
        }
    }

    static void checkDivisibility(int a){
        if(a%5 == 0 && a%11 == 0){
            System.out.println("The Value of "+a+ " is divisible by 5 and 11");
        }else {
            System.out.println("The Value of "+a+ " is neither by 5 or 11");
        }
    }

    static void checkEvenOdd(int a){
        if(a%2 == 0){
            System.out.println("The Value of "+a+ " is an Even number");
        }else {
            System.out.println("The Value of "+a+ " is an Odd number");
        }
    }

    //A leap year must be divisible by 400 or it should be divisible by 4 and not divisible by 100
    static void findingLeapYear(int a){
        if(a%400 == 0 || a%4 == 0 && a%100 != 0){
            System.out.println("The Value of "+a+ " is a Leap year");
        }else {
            System.out.println("The Value of "+a+ " is not a Leap year");
        }
    }

    static void printEvenNumbers(){
        int i=2;
        while(i<=100){
                if(i<100){
                    System.out.print(i+",");
                }else{
                    System.out.print(i);
                }
            i += 2;
        }
    }

        static void printOddNumbers(){
        int i=1;
        while(i<=99){
                if(i<99){
                    System.out.print(i+",");
                }else{
                    System.out.print(i);
                }
            i += 2;
        }
    }

    static void printTable(int n){
        int i=1;
        while(i<=10){
            System.out.println(n +" X "+i+" = "+(n*i));
            i++;
        }
    }
    
}
