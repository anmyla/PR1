package Level_2;

import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args) {

        numInput();
    }
    public static void numInput() {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number between 1-100: ");
        int input = num.nextInt();
        int check = 0;

        for (int i = 1; i <= input; i++) {
            if (i % 2 != 0) {
                System.out.print(" " + i);
            }
        }

    }
}
