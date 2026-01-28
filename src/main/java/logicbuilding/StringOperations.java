package main.java.logicbuilding;

// 64. Write a Java program to find length of a string and compare and concatenate two     strings.
// 65. Write a Java program to find total number of alphabets, digits or special     character in a string.
// 66. Write a Java program to count total number of vowels and consonants in a string.
// 67. Write a Java program to count total number of words in a string.
// 68. Write a Java program to find reverse of a string.
// 69. Write a Java program to check whether a string is palindrome or not.
// 70. Write a Java program to find first occurrence of a character in a given string.
// 71. Write a Java program to find last occurrence of a character in a given string.
// 72. Write a Java program to search all occurrences of a character in given string.
// 73. Write a Java program to count occurrences of a character in given string.
// 74. Write a Java program to find highest frequency character in a string.
// 75. Write a Java program to find lowest frequency character in a string.
// 76. Write a Java program to count frequency of each character in a string

public class StringOperations {
    public static void main(String[] args) {
        // getLengthOfString("Activa");
        // compareStrings();
           reverseString("Vinay");
    }

    static void getLengthOfString(String str){
        System.out.println("The length of "+str+ " will be"+ str.length());
    }

    static void compareStrings(){
        // String str = "FLM", str1="flm";
        String s1 = new String ("FLM");
        String s2 = new String ("FLM");
        // System.out.println("The comparision of both strings will be : "+(str == str1));
        // System.out.println("The comparision of both strings will be : "+(str.equals(str1)));
        System.out.println("The comparision of both strings will be : "+(s1 == s2));
        System.out.println("The comparision of both strings will be : "+(s1.equals(s2)));
    }

    static void reverseString(String str){
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}