package main.java.logicbuilding;

import java.util.Scanner;

// 14. Write a Java program to input basic salary of an employee and calculate its Gross salary 
// according to following:
//     Basic Salary <= 10000 : HRA = 20%, DA = 80%
//     Basic Salary <= 45000 : HRA = 25%, DA = 90%
//     Basic Salary >= 75000 : HRA = 30%, DA = 95%
public class EmployeeSalaryCalculator {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your basic salary");

        int basicSalary = s.nextInt();

        if(basicSalary <=0){
            System.out.println("Entered Invalid Salary");
            s.close();
            return;
        }

        calculateGrossSalary(basicSalary);

        s.close();
    }

    static void calculateGrossSalary(int basicSalary){
        if(basicSalary <= 10000 ){
            calculate(basicSalary,20,80);
        } else if (basicSalary <= 45000){
            calculate(basicSalary,25,90);
        }else{
            calculate(basicSalary,30,95);
        }
    }

    static void calculate(int basicSalary, int hraPercent, int daPercent) {
       double grossSalary;

       double hrAllowance = (double) (basicSalary * hraPercent)/100 ;

       double directAllowance = (double) (basicSalary * daPercent)/100 ;

       grossSalary = basicSalary + hrAllowance + directAllowance ;

       System.out.println("Gross Salary: "+grossSalary);

    }
}
