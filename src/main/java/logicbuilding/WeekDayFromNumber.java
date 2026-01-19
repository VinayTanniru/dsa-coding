package main.java.logicbuilding;

// 11. Write a Java program to input week number and print week day.
public class WeekDayFromNumber {

    public static void main(String[] args) {
        getWeekDay(2);
    }

    static void getWeekDay(int number){

        if (number < 1 || number > 7) {
        System.out.println("Invalid week number");
        return;
        }

        if(number == 1){
            System.out.println("It will be Sunday");
        } else if(number == 2){
            System.out.println("It will be Monday");
        } else if(number == 3){
            System.out.println("It will be Tuesday");
        } else if(number == 4){
            System.out.println("It will be Wednesday");
        } else if(number == 5){
            System.out.println("It will be Thursday");
        } else if(number == 6){
            System.out.println("It will be Friday");
        } else if(number == 7){
            System.out.println("It will be Saturday");
        }
    }
}
