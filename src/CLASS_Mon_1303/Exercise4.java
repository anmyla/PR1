package CLASS_Mon_1303;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

    penaltyForOverSpeeding(100);
    penaltyForDrinking(2500);
    discount("December");
    }

    public static double penaltyForOverSpeeding(double penalty1) {
        penalty1 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Speed: ");
        int speed = scanner.nextInt();

        int overSpeed = speed - 50;

        if (overSpeed < 0) {
            System.out.println("Not over speeding!");
        } else if ((overSpeed > 0) && (overSpeed <= 10)) {
            System.out.println("You are driving " + overSpeed + " km/h more than allowed. You will get a written warning!");
        } else if (overSpeed <= 20) {
            System.out.println("You are driving " + overSpeed + " km/h more than allowed. You should pay the penalty: 30 Euro");
            penalty1 = penalty1 + 30;
        } else if (overSpeed <= 30) {
            System.out.println("You are driving " + overSpeed + " km/h more than allowed. You should pay the penalty: 50 Euro");
            penalty1 = penalty1 + 50;
        } else if (overSpeed <= 50) {
            System.out.println("You are driving " + overSpeed + " km/h more than allowed. You should pay the penalty: 100 Euro");
            penalty1 = penalty1 + 100;
        } else if (overSpeed <= 100) {
            System.out.println("You are driving " + overSpeed + " km/h more than allowed. You should pay the penalty: 500 Euro");
            penalty1 = penalty1 + 500;
        } else {
            System.out.println("You are driving " + overSpeed + " km/h more than allowed. You should pay the penalty: 1500 Euro");
            penalty1 = penalty1 + 1500;
        }
        return penalty1;
    }

        public static double penaltyForDrinking(double penalty2) {

        System.out.println("-----------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter alcohol level: ");
        double alcoholLevel = scanner.nextDouble();
        penalty2 = 0;

        if (alcoholLevel < 0) {
            System.out.println("No alcohol in your system!");
        } else if (alcoholLevel <= 0.5) {
            System.out.println("Alcohol level is within tolerance.");
        } else if (alcoholLevel <= 1.0) {
            System.out.println("Your alcohol level is: " + alcoholLevel + "pro/mille. Your penalty is 50 Euro");
            penalty2 = penalty2 + 50;
        } else if (alcoholLevel <= 2.0) {
            System.out.println("Your alcohol level is: " + alcoholLevel + "pro/mille. Your penalty is 100 Euro");
            penalty2 = penalty2 + 100;
        } else {
            System.out.println("Your alcohol level is: " + alcoholLevel + "pro/mille. Your penalty is 2500 Euro");
            penalty2 = penalty2 + 2500;
        }
        return penalty2;
    }

    public static double discount( String month) {
        double penaltyTotal = penaltyForDrinking(2500) + penaltyForOverSpeeding(100);
        if (penaltyTotal > 0) {
            System.out.println("Your total penalty is: " + penaltyTotal + "Euro");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Month: ");
            month = scanner.next();

            switch (month) {
                case "January":
                case "February":
                    System.out.println("It is " + month + ". No discount possible! Your total penalty is " + penaltyTotal + " Euro.");
                    break;
                case "March":
                case "April":
                    penaltyTotal = penaltyTotal * 0.90;
                    System.out.println("It is " + month + ". Your total penalty is " + penaltyTotal + " Euro.");
                    break;
                case "May":
                case "June":
                    penaltyTotal = penaltyTotal * 0.85;
                    System.out.println("It is " + month + ". Your total penalty is " + penaltyTotal + " Euro.");
                    break;
                case "July":
                case "August":
                    penaltyTotal = penaltyTotal * 0.80;
                    System.out.println("It is " + month + ". Your total penalty is " + penaltyTotal + " Euro.");
                    break;
                case "September":
                case "October":
                    penaltyTotal = penaltyTotal * 0.75;
                    System.out.println("It is " + month + ". Your total penalty is " + penaltyTotal + " Euro.");
                    break;
                case "November":
                case "December":
                    penaltyTotal = penaltyTotal * 0.70;
                    System.out.println("It is " + month + ". Your total penalty is " + penaltyTotal + " Euro.");
                    break;
            }
        } else {
            System.out.println(" Everything's fine!");
        }
        return penaltyTotal;
    }
}
