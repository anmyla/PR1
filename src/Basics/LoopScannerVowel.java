package Basics;

import java.util.Scanner;

public class LoopScannerVowel {
    public static void main(String[] args) {

        String let = "a";

       do {
           Scanner input = new Scanner(System.in);
           System.out.println("Enter a letter:  ");
            let = input.next();
            let.toLowerCase();

           if (let.equals("a") || let.equals("e") || let.equals("i") || let.equals("u")) {
               System.out.println("The letter " + let + " is a vowel.");
           } else {
               System.out.println("The letter " + let + " is a consonant.");
           }
       }while (!let.equals("o"));
    }
}

////Write a Scanner that asks you to enter a
// letter. Write a method that figures out whether the
// input from the console is a vowel or not and print the result to the console.
////The scanner closes only after you put in 0, otherwise
// it continues to ask for more letters to evaluate.
////Remember: you compare Strings with .equals() !
