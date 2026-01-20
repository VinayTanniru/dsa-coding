package main.java.logicbuilding;

import java.util.Scanner;

// 16. Write a Java program to print day of week name using switch case.
public class DayOfWeek {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your Input day number");

        int dayNumber = s.nextInt();

        if(!isValidInput(dayNumber)){
            System.out.println("Entered Invalid number");
            s.close();
            return;
        }

        printDayOfWeek(dayNumber);

        s.close();
    }

    static void printDayOfWeek(int dayNumber){

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
                break;
        }
    }

    public static boolean isValidInput(int dayNumber) {
        return dayNumber > 0 && dayNumber <=7 ;
    }
}
