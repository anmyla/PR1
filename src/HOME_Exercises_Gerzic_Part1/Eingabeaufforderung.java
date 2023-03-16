package HOME_Exercises_Gerzic_Part1;

import java.util.Scanner;

public class Eingabeaufforderung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitten geben Sie Ihren Name ein: ");
        String name = scanner.nextLine();

        System.out.println("Bitte geben Sie Ihr Alter ein: ");
        int alter = scanner.nextInt();

        System.out.println("Hallo, " + name.concat("! Du bist ") + alter + " Jahre alt.");

    }
}
