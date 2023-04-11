package Level_1;

import java.util.Scanner;

public class ConvertNumberToWord {

    public static void main(String[] args) {

        convertToWords();


    }

    public static int input() {
        int num = 0;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number:  ");
            num = input.nextInt();

            if (num >0 && num < 11) {
                return num;
            }
            else{
                System.out.println("invalid input, please try again ( 1-10): ");
            }
        } while (num < 1 || num > 10);
        return num;
    }

    public static void convertToWords() {
        switch (input()) {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Nine");
            case 10 -> System.out.println("Ten");
            default -> System.out.println("invalid input");
        };
    }
}
//1.2 Übung 2 – Nummer in Wörter konvertieren
//Schreiben Sie ein Java-Programm, das den Benutzer auffordert,
// eine Zahl zwischen 1 und 10 (einschließlich) einzugeben, und dann
// das englische Wort für diese Zahl ausgibt. Wenn der Benutzer eine
// ungültige Zahl eingibt, sollte das Programm eine Fehlermeldung ausgeben
// und den Benutzer auffordern, erneut eine gültige Zahl einzugeben.
//Ihr Programm sollte das folgende Verhalten aufweisen:
//1. WenndasProgrammstartet,sollesdenBenutzerauffordern,eineZahlzwischen
// 1 und 10 (einschließlich) einzugeben.
//2. WennderBenutzereineungültigeZahleingibt,solltedasProgrammdiefolgende
// Fehlermeldung ausgeben: "Ungültige Zahl eingegeben. Bitte geben Sie eine
// Zahl zwischen 1 und 10 (einschließlich) ein".
//3. Das Programm sollte den Benutzer so lange auffordern, eine gültige
// Zahl einzugeben, bis der Benutzer eine Zahl zwischen 1 und 10 (einschließlich) eingibt.
//4. SobaldderBenutzereinegültigeZahleingibt,solltedasProgrammdasenglische
// Wort für diese Zahl ausgeben. Das englische Wort sollte in Kleinbuchstaben
//ausgegeben werden.
