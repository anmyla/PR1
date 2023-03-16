package CLASS_Wed_1503;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        boolean aHouse = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is the building a house? (y/n):  ");
        String input = scanner.nextLine();

        if (input.toLowerCase().equals("y")) {
            aHouse = true;
        }
        for (int i = 1; i <= 68; i++) {
            if (i == 10 || i == 19 || i == 28 || i == 36 || i == 55) {
                continue;
            }
            System.out.println("Floor " + i);
            if (aHouse == true && i == 4) {
                break;
            }
        }
    }
}
