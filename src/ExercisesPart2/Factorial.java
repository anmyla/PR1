package ExercisesPart2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int factorial = 0;
        for (int i = number; i > 0; i--){
            factorial = number * i;
            System.out.println(factorial);
        }

    }
}
//program not yet completely finished. it runs but gives the wrong output.