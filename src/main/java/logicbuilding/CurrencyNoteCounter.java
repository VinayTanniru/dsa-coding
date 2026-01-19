package main.java.logicbuilding;

import java.util.Scanner;

// 12. Write a Java program to count total number of notes in given amount.
public class CurrencyNoteCounter {

    int count;
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the amount (multiples of 100)");

        int amount = s.nextInt();

        if(!isAmountValid(amount)){
            System.out.println("Invalid amount");
            s.close();
            return;
        }

        countNotes(amount);

        s.close();
    }

    static void countNotes(int amount){
        int totalNotes=0;

        int [] notes = {2000,500,200,100};

        for(int note : notes){
            if(amount >= note){
                int count = amount/note;
                amount = amount%note;
                totalNotes+= count;
                System.out.println(note + " : " + count);
            }
        }
        System.out.println("Total number of notes = " + totalNotes);
    }

    static boolean isAmountValid(int amount){
        return amount % 100 == 0 && amount > 0 ;
    }
}
