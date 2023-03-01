package Exercises;

import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {

        System.out.println("Senior, Student, Pet Discount");

        checkIfDiscount(false, false, false);
        checkIfDiscount(false, false, true);
        checkIfDiscount(false, true, true);
        checkIfDiscount(true, true, true);

    /*    Scanner scanner1 = new Scanner(System.in);
        System.out.println( "How many non fiction books you bought? ");
        int nonFiction = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println( "How many fiction books you bought? ");
        int fiction = scanner2.nextInt();
    */
        System.out.println();
        System.out.println("Bookstore discount");
        checkDiscountBooks(2, 0);
        checkDiscountBooks(4, 8);
        checkDiscountBooks(2, 3);
        checkDiscountBooks(4, 1);
        checkDiscountBooks(3, 2);
        checkDiscountBooks(5, 0);
        checkDiscountBooks(4, 5);
        checkDiscountBooks(5, 3);


    }

    public static void checkIfDiscount(boolean isSenior, boolean isStudent, boolean isDog) {
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

    public static void checkDiscountBooks(int nonFiction, int fiction) {

        if (nonFiction > 2 && fiction > 1) {
            System.out.println("Discount!");
        } else {
            System.out.println("No discount");
        }
    }

}
