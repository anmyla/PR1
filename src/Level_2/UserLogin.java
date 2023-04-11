package Level_2;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {

        final String password = "password123";
        final String username = "user123";
        int attempts = 0;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your username: ");
            String userInput = scan.nextLine();

            System.out.println("Enter your password: ");
            String pwInput = scan.nextLine();

            if (userInput.equals(username) && pwInput.equals(password)) {
                System.out.println("Login succesful!");
                break;
            } else {
                attempts++;
                if (!userInput.equals(username)) {
                    System.out.println("Wrong username!");
                } else {
                    System.out.println("Wrong password!");
                }
            }
            if (attempts == 3) {
                System.out.println("Maximum number of attempts reached. For Security purposes, the program will now close.");
            }
            else {
                System.out.println("Please try again.");
            }
        } while (attempts < 3);

    }

}

