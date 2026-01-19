package main.java.logicbuilding;

import java.util.Scanner;

// 15. Write a Java program to input electricity unit charges and calculate total 
// electricity bill according to the given condition:
//     For first 50 units Rs. 0.50/unit
//     For next 100 units Rs. 0.75/unit
//     For next 100 units Rs. 1.20/unit
//      For unit above 250 Rs. 1.50/unit
//      An additional surcharge of 20% is added to the bill
public class ElectricityBillCalculator {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your electricity units");

        int units = s.nextInt();

        if(units <=0){
            System.out.println("Entered Invalid units");
            s.close();
            return;
        }

        calculateTotalBill(units);
        
        s.close();
    }

    static double calculateCharge(double amount){
        return amount+(amount*20)/100;
    }

    static void printCurrentBill(double amount,double charge){
        System.out.println("Bill amount (without surcharge): " + amount);
        System.out.println("Bill amount (with surcharge): " + charge);
    }

    static void calculateTotalBill(int units){
        double amount=0,charge=0;
        if(units<=50){
            amount = 0.50*units;
        }else if(units<=150){
            amount=0.50*50+(units-50)*0.75;
        }else if(units<=250){
            amount=0.50*50+100*0.75+(units-150)*1.20;
        }else {
            amount=0.50*50+100*0.75+150*1.20+(units-250)*1.50;
        }
            charge = calculateCharge(amount);
            printCurrentBill(amount,charge);
    }
}
