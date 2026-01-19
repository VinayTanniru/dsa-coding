package main.java.logicbuilding;

import java.util.ArrayList;
import java.util.Scanner;

// 13. Write a Java program to input marks of five subjects Physics,Chemistry,Biology,Mathematics 
// and Computer. Calculate percentage and grade according to following:
//     Percentage >= 90% : Grade A
//     Percentage >= 80% : Grade B
//     Percentage >= 70% : Grade C
//     Percentage >= 60% : Grade D
//     Percentage >= 40% : Grade E
//     Percentage < 40% : Grade F
public class StudentGradeCalculator {
    public static void main(String[] args) {
        
        String [] subjects = {"Physics","Chemistry","Biology","Mathematics","Computer"};
        ArrayList<Integer> marks = new ArrayList<Integer>(5);

        Scanner s = new Scanner(System.in);

        for (String subject : subjects){
            System.out.println("Enter marks for  "+subject);
            marks.add(s.nextInt());
        }

        if(!validateMarks(marks)){
            System.out.println("Entered Inavalid marks");
            s.close();
            return;
        }


        calculatePercentage(marks);

        s.close();
    }

    static boolean validateMarks(ArrayList<Integer> marks){
        for (int mark : marks){
            if(mark > 100 || mark < 0){
                return false;
            }
        }
        return true;
    }

    static void calculatePercentage(ArrayList<Integer> marks){
        int subjectTotal = 0;
        double percentage;

        for(int mark : marks){
            subjectTotal += mark;
        }

        System.out.println("The total marks of student will be "+subjectTotal);

        percentage = (double)(subjectTotal*100)/500;

        System.out.println("The Percentage of student will be "+percentage);

        assignGrade(percentage);
    }

    static void assignGrade(double percentage){
        if(percentage >= 90){
            System.out.println("Grade A");
        } else if(percentage >= 80){
            System.out.println("Grade B");
        } else if(percentage >= 70){
            System.out.println("Grade C");
        } else if(percentage >= 60){
            System.out.println("Grade D");
        } else if(percentage >= 40){
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
        }
    }
}
