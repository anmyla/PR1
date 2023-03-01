package Exercises;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
 /*
        boolean isSenior = false;
        boolean isDog = false;
        boolean isStudent = true;

        checkIfDiscount(false, false, false);
        checkIfDiscount(false, false, true);
        checkIfDiscount(false, true, true);
        checkIfDiscount(true, true, true);
 */



        Scanner scanner1 = new Scanner(System.in);
        System.out.println( "How many non fiction books you bought? ");
        int nonFiction = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println( "How many fiction books you bought? ");
        int fiction = scanner2.nextInt();

        checkDiscountBooks();
    }

    /*    public static void checkIfDiscount( boolean isSenior, boolean isStudent, boolean isDog) {
            // First Conditional - the class solution

            if (isSenior) {
                System.out.println("Discount!");
            } else if (isDog) {
                System.out.println("Discount!");
            } else if (isStudent) {
                System.out.println("Discount!");
            } else {
                System.out.println("No discount!");
            }
        }
    */
    public static int checkDiscountBooks(int nonFiction, int fiction) {

        if (nonFiction > 2 && fiction > 1) {
            System.out.println("You're entitled for a Discount!");
        }
        else {
            System.out.println("Sorry, you're not entitled for a discount");
        }

        return nonFiction;

    }
}
