package Exer2_Gerzic_Continue_Break_ForLoop_Modulo_IntToString;

import java.util.Scanner;

public class Continue_Break_Airplane {
    public static void main(String[] args) {
        boolean isA380 = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is the plane an A380: (y/n) ");
        String input = scanner.nextLine();

        if (input.toLowerCase().equals("y")) {
            isA380 = true;
        }

        for (int i = 1; i <= 50; i++) {
            if (i == 13 || i == 17) {
                continue;
            }
            System.out.println("Row:  " + i);
            if (isA380 == false && i == 19) {
                break;
            }
        }
    }
}
