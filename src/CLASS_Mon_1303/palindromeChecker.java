package CLASS_Mon_1303;

import java.util.Scanner;

public class palindromeChecker {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a word or sentence: ");
            String input = scanner.nextLine();
            String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Remove non-alphanumeric characters and convert to lowercase
            String reversedInput = new StringBuilder(cleanInput).reverse().toString(); // Reverse the string
            if (cleanInput.equals(reversedInput)) {
                System.out.println(input + " is a palindrome.");
            } else {
                System.out.println(input + " is not a palindrome.");
            }
        }
    }
