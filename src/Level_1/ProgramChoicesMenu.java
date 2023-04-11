package Level_1;

import java.util.Scanner;

public class ProgramChoicesMenu {
    public static void main(String[] args) {
        int choice;
        choice = menu();

        while (choice > 0 || choice < 5) {
            if (choice == 1) {
                stringInvert();
            } else if (choice == 2) {
                oddOrEven();
            } else if (choice == 3) {
                countTheVowels();
            } else if (choice == 4) {
                simpleFactorial();
            } else if(choice == 5){
                return;
            }
            else {
                System.out.println("Not a valid number!");
            }
            choice = menu();
        }
    }

    public static void stringInvert() {
        Scanner wordinput = new Scanner(System.in);
        System.out.println("Enter a word you want to invert: ");
        String word = wordinput.nextLine();

        char letter;
        char [] holder = new char [word.length()];
        int j= 0;

        for (int i = word.length()-1; i >= 0 ; i--) {
            letter = word.charAt(i);
            holder[j] = letter;
            j++;
        }
        j=0;
        String inverted = String.copyValueOf(holder);
        System.out.println(inverted);
    }

    public static boolean oddOrEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2==0) {
            System.out.println("the number you entered is even.");
            return true;
        }
        else {
            System.out.println("The number you entered is odd.");
            return false;
        }
    }

    public static int countTheVowels() {
        Scanner wordinput = new Scanner(System.in);
        System.out.println("Enter a word/phrase to to count the vowels: ");
        String word = wordinput.nextLine();

        word = word.toLowerCase();
        int counter = 0;
        char letter;

        for (int i = 0; i < word.length() ; i++) {
            letter = word.charAt(i);
            if (letter == 'a' || letter == 'e' ||letter == 'o' ||letter == 'i' ||letter == 'u') {
                counter++;
            }
        }
        System.out.println("There are [ " + counter + " ] vowels in this word/phrase.");
        return counter;
    }

    public static void simpleFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int multiplier = number;
        int ans = 1;

        for ( int i = number; i> 0; i --) {
            System.out.print(i + " * ");
            ans = ans * multiplier;
            multiplier--;
        }
        System.out.print(" = " + ans);
        System.out.println('\n'+"The answer is: " +ans);
    }

    public static int menu() {
        System.out.println("PROGRAM MENU");
        System.out.println("1. String invert.");
        System.out.println("2. Odd or Even Number.");
        System.out.println("3. Count the vowels");
        System.out.println("4. Factorial");
        System.out.println("5. Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the program you wish to run ( 1-5): ");
        int menu = scanner.nextInt();

        return menu;
    }
}

