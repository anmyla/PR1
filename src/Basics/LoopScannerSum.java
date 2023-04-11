package Basics;

import java.util.Scanner;

public class LoopScannerSum {
    public static void main(String[] args) {
        int sum = 0;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number:  ");
            int num = input.nextInt();

            if (num % 2 == 0) {
                sum = sum + num; }
                if (num == 0) {
                    System.out.println("The value is sum is: " + sum);
                    return;
                } else if (num == 2) {
                    sum = sum * 2;
                } else if (num == 3) {
                    sum = sum * 3;
                } else if (num == 22) {
                    sum = sum / 2;
                }
        }while (sum > 0);

        System.out.println("The value is sum is: " + sum);
    }
}
//Write a Scanner that asks you to enter a number.
// Write a program that keeps adding up all the positive
// numbers it gets through the scanner.
//Rules for specific numbers:
//If a 2 is entered, the sum doubles
//If a 3 is entered the sum id tripled
//If a 22 is entered, the sum is halved
//As soon as a negative number or 0 is entered, the
// Scanner closes and prints the sum to the console.
//
