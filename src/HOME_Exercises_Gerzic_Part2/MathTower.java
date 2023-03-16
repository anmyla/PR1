package HOME_Exercises_Gerzic_Part2;

import java.util.Scanner;

public class MathTower {

    public static void main(String[] args) {
        mathTowerWithForLoop();
        mathTowerWithWhileLoop();

    }
    public static void mathTowerWithForLoop () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int multiplier = input.nextInt();
        int product = 0;
        int quotient = 0;
        for (int i = 1; i <= 9; i++ ) {
            product = multiplier * i;
            System.out.println( multiplier + " * " + i + " = " + product);
            multiplier = product;
        }
        for (int i = 1; i <= 9; i++ ) {
            quotient = product / i;
            System.out.println( product + " / " + i + " = " + quotient);
            product = quotient;
        }
    }

    public static void mathTowerWithWhileLoop () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int multiplier = input.nextInt();
        int product = 0;
        int quotient = 0;
        int i = 1;
        while (i > 0  && i <=9) {
            product = multiplier * i;
            System.out.println( multiplier + " * " + i + " = " + product);
            multiplier = product;
            i++;
        }

        i = 1;
        while (i > 0  && i <=9) {
            quotient = product / i;
            System.out.println( product + " / " + i + " = " + quotient);
            product = quotient;
            i++;
        }
    }
}
