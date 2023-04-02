package Exer1_Gerzic_Switch_WhileLoop_Array;

import java.util.Scanner;

public class Exercise3_IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 5) {
            System.out.println("The number is greater than 5.");
        } else if (number < 5) {
            System.out.println("The number is less than 5.");
        } else {
            System.out.println("The number is equals to 5.");
        }
    }
}
