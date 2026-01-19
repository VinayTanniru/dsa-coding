package main.java.logicbuilding;

// CharacterOperations
// 7. Write a Java program to check whether a character is alphabet or not.
// 8. Write a Java program to input any alphabet and check whether it is vowel or consonant.
// 9. Write a Java program to input any character and check whether it is alphabet, digit    or special character.
// 10. Write a Java program to check whether a character is uppercase or lowercase alphabet.

public class CharacterOperations {
    public static void main(String[] args) {
        isAlphabet('4');
        checkLetterCase('A');
        isVowel('i');
        identifyCharType('@');

    }

    static void isAlphabet(char a){
        if (isLetter(a)) {
            System.out.println("The character "+a+ " is an Alphabet");
        }else {
            System.out.println("The character "+a+ " is not an Alphabet");
        }
    }

    static void checkLetterCase(char a){
        if (!isLetter(a)) {
            System.out.println("The character "+a+" is not a letter");
        } else if (Character.isLowerCase(a)) {
            System.out.println("The character "+a+ " is a Lower case letter");
        }else {
            System.out.println("The character "+a+ " is a Uppercase letter");
        }
    }

    static void isVowel(char a){
        if(!isLetter(a)){
            System.out.println("The character "+a+ " is not an alphabet");
        }else {
            char letter = Character.toLowerCase(a);
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println("The character "+letter+ " is a vowel");
        }else {
            System.out.println("The character "+letter+ " is a consonant");
        }
        }
    }

    static void identifyCharType(char a){
        if (isLetter(a)) {
            System.out.println("The character "+a+ " is an alphabet");
        }else if(Character.isDigit(a)) {
            System.out.println("The character "+a+ " is an Number");
        }else {
            System.out.println("The character "+a+ " is an Special character");
        }
    }

    static boolean isLetter(char a){
        return Character.isAlphabetic(a);
    }
}
