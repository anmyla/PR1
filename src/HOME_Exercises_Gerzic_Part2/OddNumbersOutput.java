package HOME_Exercises_Gerzic_Part2;

import java.util.Scanner;

public class OddNumbersOutput {
    public static void main(String[] args) {
        int number;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a whole number greater than 0: ");
            number = input.nextInt();
        } while (number <= 0 );

        for (int i = 0; i <= number; i++) {
            if (!(i % 2 == 0)) {
                System.out.print(i+ " ");
            }
        }
    }
}

//Write a Java program that asks the user to enter a positive integer
//and then prints all odd numbers from 1 up to that integer to the
//console.
//Output should look like this: