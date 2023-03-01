package Exercises;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        // First Conditional - the class solution

        boolean isSenior = false;
        boolean isDog = false;
        boolean isStudent = true;

        if (isSenior) {
            System.out.println("Discount!");
        } else if (isDog) {
            System.out.println("Discount!");
        } else if (isStudent) {
            System.out.println("Discount!");
        } else {
            System.out.println("No discount!");
        }

        //Second Conditional - my own solution

        Scanner scanner1 = new Scanner(System.in);
        System.out.println( "How many non fiction books you bought? ");
        int nonFiction = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println( "How many fiction books you bought? ");
        int fiction = scanner2.nextInt();

        if ( nonFiction > 2 && fiction > 1) {
            System.out.println("You're entitled for a Discount!");
        }
        else {
            System.out.println("Sorry, you're not entitled for a discount");
        }
    }
}
