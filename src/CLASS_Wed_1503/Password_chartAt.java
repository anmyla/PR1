package CLASS_Wed_1503;

import java.util.Scanner;

public class Password_chartAt {
    public static void main(String[] args) {
        String password = "Geheim";

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String input = scanner1.nextLine();

        char letterChecker = input.charAt(0);
        String checkedPassword = "";


        for (int i = 0; i < password.length(); i++) {
               letterChecker = input.charAt(i);
               checkedPassword = checkedPassword + letterChecker;
        }
        if (checkedPassword.equals(password)) {
                System.out.println("Correct password!");
            }
        else {
            System.out.println("Wrong password!");
        }
    }
}
