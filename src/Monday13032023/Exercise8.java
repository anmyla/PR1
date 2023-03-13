package Monday13032023;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        int n = 0;

        while (n <= number) {
            sum = sum + n;
            n++;
        }
        System.out.println("The sum of 1 to " + number + " is " + sum);


    }
}
