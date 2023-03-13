package Monday13032023;

import java.util.Scanner;

public class Exercise1b {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();

        String name = firstName.concat(" " + lastName);

        int numberOfCharacters = name.length();
        boolean nameLengthMoreThan10 = name.length() > 10;
        System.out.println("Is the length longer than 10 characters?: " + nameLengthMoreThan10 + " and the exact number of characters is: " + numberOfCharacters);
        System.out.println("Willkommen " + name.toUpperCase());

//        if (nameLengthMoreThan10) {
//            System.out.println(name.concat(" is more than 10 characters. It has exactly ") +numberOfCharacters + " characters.");
//        } else {
//            System.out.println(name.concat (" is shorter than 10 characters."));
//        }

    }
}