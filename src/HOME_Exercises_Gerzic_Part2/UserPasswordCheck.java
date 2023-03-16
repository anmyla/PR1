package HOME_Exercises_Gerzic_Part2;

import java.util.Scanner;

public class UserPasswordCheck {
    public static void main(String[] args) {
        String userName = "user123";
        String password = "password123";
        String unInput;
        String pwInput;

        int atempts = 0;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your username: ");
            unInput = input.next();

            System.out.println("Enter your password: ");
            pwInput = input.next();

            if (!(userName.equals(unInput))) {
                System.out.println("Wrong username!");
            } else if (!(password.equals(pwInput))) {
                System.out.println("Wrong password! ");
            }
            atempts = atempts + 1;
        } while (atempts < 3 && (!(userName.equals(unInput)) || !(password.equals(pwInput))));
        if (atempts >= 3) {
            System.out.println("You've reached the maximum number of attempts! For security purposes, the program will now close.");
        } else {
            System.out.println("Authentication successful!");
        }
    }
}

//Write a Java program that prompts the user to enter a username
//and a password. The program should repeatedly prompt the user
//user to enter a username and password until a correct username and password are
//user name and password are entered, or until the maximum number of
//number of attempts is reached.
//The correct username is "user123" and the correct password is "password123".
//If the user enters incorrect credentials, the program should display the message.
//"Incorrect username or password. Please try again." If
//the maximum number of attempts is reached, the program should display the message.
//"Maximum number of attempts reached. End program." and exit the program.
//exit.
//
//Translated with www.DeepL.com/Translator (free version)