package Exercises;

import java.util.Scanner;

public class DivisionWithReturn {
    public static void main(String[] args) {
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int number = scanner.nextInt();
//
//        int rest = number % 3;
//
//        if (rest == 0) {
//            System.out.println("The number you entered is divisible by 3.");
//        } else System.out.println("The number you enter is NOT divisible by 3.");
//
        //method 1
        int dividend= 99;
        int divisor = 9;
        int resultOfDivisible = isDivisible1(dividend, divisor);

        if (resultOfDivisible != 0) {
            System.out.println(dividend + " is divisible by " + divisor+ ".");
        }
        else {
            System.out.println(dividend + " is NOT divisible by " + divisor+ ".");
        }


        // method 2
        int dividend2 = 47;
        int divisor2 = 3;
        int resultOfDivisible2 = isDivisible1(dividend2, divisor2);

        if (resultOfDivisible2 != 0) {
            System.out.println(dividend2 + " is divisible by " + divisor2+ ".");
        }
        else {
            System.out.println(dividend2 + " is NOT divisible by " + divisor2+ ".");
        }

    }

    public static int isDivisible1 (int dividend, int divisor) {
        int restFromDivision = dividend % divisor;

        if (restFromDivision == 0) {
            System.out.println(dividend + " is divisible by " + divisor+ ".");
            return dividend;
        }
        else {
            System.out.println(dividend + " is NOT divisible by " + divisor+ ".");
            return 0;
        }
    }

    public static int isDivisible2 (int dividend2, int divisor2) {
        int restFromDivision = dividend2 % divisor2;
        int returnedValue = 0;

        if (restFromDivision == 0) {
            returnedValue = dividend2;

        }
        return returnedValue;
    }
}