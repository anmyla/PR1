package HomEx1_ReverseString_WordChecker_ConvertIntToString;

import java.util.Scanner;
public class Programmauswahlmenue { // UGLY program but it works!!!
    public static void main(String[] args) {
        int choice = 0;
        System.out.println("Menu: \n" +
                "1. Reverse String Output \n" +
                "2. Odd or Even Number \n" +
                "3. Count the Vowels \n" +
                "4. Calculate the Factorial \n" +
                "5. Terminate the Program");
        do {
            Scanner again = new Scanner(System.in);
            System.out.println("Enter your choice: " );
            choice = again.nextInt();
        } while (choice < 1 || choice > 5);

        do {
            switch (choice) {
                case 1:
                    reversedWord();
                    System.out.println("Menu: \n" +
                            "1. Reverse String Output \n" +
                            "2. Odd or Even Number \n" +
                            "3. Count the Vowels \n" +
                            "4. Calculate the Factorial \n" +
                            "5. Terminate the Program");

                    Scanner again = new Scanner(System.in);
                    again = new Scanner(System.in);
                    System.out.println("Please enter the program you want to run: ");
                    choice = again.nextInt();
                    break;

                case 2:
                    oddOrEven();
                    System.out.println("Menu: \n" +
                            "1. Reverse String Output \n" +
                            "2. Odd or Even Number \n" +
                            "3. Count the Vowels \n" +
                            "4. Calculate the Factorial \n" +
                            "5. Terminate the Program");

                    again = new Scanner(System.in);
                    System.out.println("Please enter the program you want to run: ");
                    choice = again.nextInt();
                    break;

                case 3:
                    countTheVowels();
                    System.out.println("Menu: \n" +
                            "1. Reverse String Output \n" +
                            "2. Odd or Even Number \n" +
                            "3. Count the Vowels \n" +
                            "4. Calculate the Factorial \n" +
                            "5. Terminate the Program");

                    again = new Scanner(System.in);
                    System.out.println("Please enter the program you want to run: ");
                    choice = again.nextInt();
                    break;

                case 4:
                    factorial();
                    System.out.println("Menu: \n" +
                            "1. Reverse String Output \n" +
                            "2. Odd or Even Number \n" +
                            "3. Count the Vowels \n" +
                            "4. Calculate the Factorial \n" +
                            "5. Terminate the Program");

                    again = new Scanner(System.in);
                    System.out.println("Please enter the program you want to run: ");
                    choice = again.nextInt();
                    break;
            }
        } while (choice < 5);
        System.out.println("Thanks for banking with us! Goodbye!");
    }


    private static int getChoice(int choice) {
        System.out.println("Menu: \n" +
                "1. Reverse String Output \n" +
                "2. Odd or Even Number \n" +
                "3. Count the Vowels \n" +
                "4. Calculate the Factorial \n" +
                "5. Terminate the Program");

        Scanner again = new Scanner(System.in);
        System.out.println("Please enter the program you want to run: ");
        choice = again.nextInt();
        return choice;
    }

    public static void reversedWord() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a word to reverse: ");
        String word = scanner1.next();

        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            char letter = word.charAt(i);
            reversedWord = reversedWord + letter;
        }
        System.out.println("The word \"" + word + "\" when reversed is: " + reversedWord);
    }


    public static void oddOrEven() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter a number to find out if it is odd or even: ");
        int number = scanner2.nextInt();

        boolean even;
        if (number % 2 == 0) {
            even = true;
            System.out.println("The number: " + number + " is even");
        } else {
            System.out.println("The number: " + number + " is odd");
        }
    }

    public static void countTheVowels() {
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String phrase = scanner3.nextLine();

        int vowelCounter = 0;
        char letterChecker;
        phrase = phrase.toLowerCase();
        for (int i = 0; i < phrase.length(); i++) {
            letterChecker = phrase.charAt(i);
            if (letterChecker == 'a' || letterChecker == 'e' || letterChecker == 'i' || letterChecker == 'o' || letterChecker == 'u') {
                vowelCounter++;
            }
        }
        System.out.println("Number of vowels in the given phrase is " + vowelCounter);
    }

    public static void factorial() {
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner4.nextInt();

        int factorial = number;
        for (int i = number - 1; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of the number " + number + " is: " + factorial);
    }
}
