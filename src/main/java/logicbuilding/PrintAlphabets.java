package main.java.logicbuilding;

// 19. Write a Java program to print all alphabets from a to z. - using while loop
public class PrintAlphabets {
    public static void main(String[] args) {
        char ch = 'a';
        while(ch <= 'z'){
            if(ch < 'z'){
                System.out.print(ch+",");
            } else {
                System.out.print(ch);
            }
            ch++;
        }
    }
}