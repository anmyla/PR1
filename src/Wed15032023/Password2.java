package Wed15032023;

import java.util.Scanner;

public class Password2 {
    public static void main(String[] args) {
        String password = "Geheim";
        String input = "";
        do {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter your password: ");
            input = scanner1.nextLine();
        } while (!(password.equals(input)));

        System.out.println("Correct Password!");
    }
}