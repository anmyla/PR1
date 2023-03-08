package HomeExercises;

import java.util.Scanner;

public class SumAndVowels {
    public static void main(String[] args) {
        double sum = 0;
        double number = 1;

        while (!(number <= 0)) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter a number: ");
            number = scanner1.nextDouble();

            if (number != 0) {
                sum = sum + number;
                System.out.println(sum + " = current sum");
            }
            if (number == 2) {
                sum = sum * 2;
                System.out.println("Since you entered 2, the current sum is doubled: " + sum);

            } else if (number == 3) {
                sum = sum * 3;
                System.out.println("Since you entered 3, the current sum is tripled: " + sum);
            } else if (number == 22) {
                sum = sum / 2;
                System.out.println("Since you entered 22, the current sum is halved: " + sum);
            }
            else  {
                System.out.println( sum + " = is the Total of all sums so far.");
            }
        }
        System.out.println("Since you entered 0, the END TOTAL is = " + sum);
    }
}

//Sums and Vowels
//
//Write a Scanner that asks you to enter a number.
// Write a program that keeps adding up all the positive numbers it gets through the scanner.
//Rules for specific numbers:
//If a 2 is entered, the sum doubles
//If a 3 is entered the sum id tripled
//If a 22 is entered, the sum is halved
//As soon as a negative number or 0 is entered, the Scanner
// closes and prints the sum to the console.
//
//
//Write a Scanner that asks you to enter a letter.
// Write a method that figures out whether the input from the console
// is a vowel or not and print the result to the console.
//The scanner closes only after you put in 0, otherwise it
// continues to ask for more letters to evaluate.
//Remember: you compare Strings with .equals() !