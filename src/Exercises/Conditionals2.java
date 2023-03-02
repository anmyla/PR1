package Exercises;

import java.util.Scanner;

public class Conditionals2 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println( "How many non-fiction books you bought? ");
        int nonFiction = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println( "How many fiction books you bought? ");
        int fiction = scanner2.nextInt();

        checkDiscount(nonFiction, fiction);

    }

    private static void checkDiscount(int nonFiction, int fiction) {
        if (nonFiction > 2 && fiction > 1) {
            System.out.println("Yes, you're entitled to a discount!");
        } else {
            System.out.println("No, you're not entitled to a discount!");
        }
    }
}
