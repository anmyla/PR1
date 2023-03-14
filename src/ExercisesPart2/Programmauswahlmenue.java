package ExercisesPart2;

import java.util.Scanner;

import static java.lang.System.out;

public class Programmauswahlmenue {
    public static void main(String[] args) {
    oddOrEven(59);
    reversedWord();
    }
    public static void reversedWord() {
        Scanner scanner1 = new Scanner(System.in);
        out.println("Enter a word: ");
        String word = scanner1.next();

        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + reversedWord.charAt(i);
        }
        out.println(reversedWord);
    }

    public static boolean oddOrEven(double number) {
        boolean even = false;
        if(number % 2 == 0) {
            even = true;
            System.out.println("The number: "+number+  " is even");
        }
        else {
            even= false;
            out.println("The number: " +number+  " is odd");
        }
        return even;
    }
}
