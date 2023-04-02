package Exer2_Gerzic_Continue_Break_ForLoop_Modulo_IntToString;

import java.util.Scanner;

public class Password_Equals {
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