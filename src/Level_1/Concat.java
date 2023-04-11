package Level_1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hallo, " + name + "! Du bist " + age+ " Jahre alt!");
    }
}

//Schreiben Sie ein Java-Programm, das den Benutzer auffordert,
// seinen Namen und sein Alter einzugeben, und dann eine Meldung ausgibt,
// die lautet: "Hallo, [Name]! Du bist [Alter] Jahre alt."