package HomEx1_ReverseString_WordChecker_ConvertIntToString;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int factorial = number;
        for (int i = number - 1; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of the number " + number + " is: " + factorial);
    }
}