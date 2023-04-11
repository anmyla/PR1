package Level_2;

import java.util.Scanner;

public class MathTower {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a new number for the tower: ");
        int input = scanner.nextInt();
        int ans = input;

        for (int i = 1; i < 10; i++) {
            input = input * i;
            System.out.println(ans + " * " +i+  " = " + input);
            ans= input;
        }

        for (int i = 9; i > 0; i--) {
            input = input / i;
            System.out.println(ans + " / " +i+  " = " + input);
            ans= input;
        }
    }
}
