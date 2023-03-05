package ClassExercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int rest = number % 3;

        if (rest == 0) {
            System.out.println("The number you entered is divisible by 3.");
        } else System.out.println("The number you enter is NOT divisible by 3.");

    }
}
