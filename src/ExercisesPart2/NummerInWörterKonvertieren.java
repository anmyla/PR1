package ExercisesPart2;

import java.util.Scanner;

public class NummerInWörterKonvertieren {
    public static void main(String[] args) {
        aufEnglisch();
    }
    public static int eingabe() {
        int nummer;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bitten geben Sie ein Nummer zwischen 1 bis 10 ein: " );
            nummer = scanner.nextInt();

            if ((nummer < 1) || (nummer > 10)) {
                System.out.println("Ungültige Eingabe. Bitte versuchen Sie es erneut.");
            }
        } while ((nummer < 1) || (nummer > 10));
        return nummer;
    }

    public static void aufEnglisch() {
        int nummer = eingabe();
        switch (nummer) {
            case 1:
                System.out.println("One" .toLowerCase());
                break;
            case 2:
                System.out.println("Two" .toLowerCase());
                break;
            case 3:
                System.out.println("Three".toLowerCase());
                break;
            case 4:
                System.out.println("Four".toLowerCase());
                break;
            case 5:
                System.out.println("Five".toLowerCase());
                break;
            case 6:
                System.out.println("Six".toLowerCase());
                break;
            case 7:
                System.out.println("Seven".toLowerCase());
                break;
            case 8:
                System.out.println("Eight".toLowerCase());
                break;
            case 9:
                System.out.println("Nine".toLowerCase());
                break;
            case 10:
                System.out.println("Ten".toLowerCase());
                break;
        }
    }
}
