package CLASS_Wed_1503;

import java.util.Scanner;

public class Airplane {
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
