package Basics;

public class ArithmeticTower {
    public static void main(String[] args) {
        int product = 0;
        int quotient = 0;
        int n = 10;

            for ( int j = 1; j <= 9; j++) {
                product = n * j;
                System.out.println( n + " * "+ j + " = " + product);
                n = product;
            }

            quotient = product;

        for ( int i = 9; i > 0; i--) {
            quotient = quotient / i;
            System.out.println( n + " / "+ i + " = " + quotient);
            n = quotient;
        }
        }
    }

//
//Create a new class called “ArithemeticTower”.
//        Write a program that creates an arithmetic tower, i.e., a program where the result of the previous
//        operation is the basis for the next operation. If you start with 1 , for example, and the first operation
//        is to multiply by 2, the result is now the basis for the next operation:
//        1 * 2 = 2
//        2 * 3 = 6
//        6 * 4 = 24
//        You can start with any number you like to build your tower.
//        Tip: You will need to write two for loops, running from 2 to 9. Multiply or divide the
//        result of the previous run with the current value of the loop (index).
