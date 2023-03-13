package Monday13032023;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Speed: ");
        int speed = scanner.nextInt();

        int overSpeed = speed - 50;

        if (overSpeed > 0) {
            System.out.println(overSpeed + " km/h more than the allowed 50km/h");
            if ((overSpeed > 0) && (overSpeed <= 10)) {
                System.out.println("Written Warning!");
            } else if ((overSpeed > 10) && (overSpeed < 20)) {
                System.out.println("Penalty: 30 Euro");
            } else if ((overSpeed > 20) && (overSpeed < 30)) {
                System.out.println("Penalty: 50 Euro");
            } else if ((overSpeed > 30) && (overSpeed < 50)) {
                System.out.println("Penalty: 100 Euro");
            } else if ((overSpeed > 50) && (overSpeed < 100)) {
                System.out.println("Penalty: 500 Euro");
            } else {
                System.out.println("Penalty: 1500 Euro");
            }
        } else {
            System.out.println("You're a good driver!");
        }

        //---------------------------------------------
        System.out.println("Enter alcohol level: ");
        double alcoholLevel = scanner.nextDouble();

        if (alcoholLevel > 0) {
            if (alcoholLevel > 0 && alcoholLevel <= 0.5) {
                System.out.println("Everything's fine!");
            } else if (alcoholLevel > 0.5 && alcoholLevel <= 1.0) {
                System.out.println("Penalty: 50 Euro");
            } else if (alcoholLevel > 1.0 && alcoholLevel <= 2.0) {
                System.out.println("Penalty: 100 Euro");
            } else {
                System.out.println("Penalty: 2500 Euro");
            }
        } else {
            System.out.println("No alcohol in your system!");
        }

    }
}
