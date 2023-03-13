package Monday13032023;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

//        double penalty = penalty(penalty);
//        System.out.println("The return value of penalty is: " + penalty);
//
//        double discount = discount(penalty);
//        System.out.println("the total amount of penalty is: " +penalty );

    }

    public static double penalty(double penalty) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Speed: ");
        int speed = scanner.nextInt();

        int overSpeed = speed - 50;
        penalty = 0;

        if (overSpeed < 0) {
            System.out.println("You're a good driver!");
        } else if ((overSpeed > 0) && (overSpeed <= 10)) {
            System.out.println("You are driving " + overSpeed + " km/h more than allowed. You will get a written warning!");
        } else if (overSpeed <= 20) {
            System.out.println("You are driving " + overSpeed + " km/h more than allowed. You should pay the penalty: 30 Euro");
            penalty = penalty + 30;
        } else if (overSpeed <= 30) {
            System.out.println("You are driving " + overSpeed + " km/h more than allowed. You should pay the penalty: 50 Euro");
            penalty = penalty + 50;
        } else if (overSpeed <= 50) {
            System.out.println("You are driving " + overSpeed + " km/h more than allowed. You should pay the penalty: 100 Euro");
            penalty = penalty + 100;
        } else if (overSpeed <= 100) {
            System.out.println("You are driving " + overSpeed + " km/h more than allowed. You should pay the penalty: 500 Euro");
            penalty = penalty + 500;
        } else {
            System.out.println("You are driving " + overSpeed + " km/h more than allowed. You should pay the penalty: 1500 Euro");
            penalty = penalty + 1500;
        }

        System.out.println("Enter alcohol level: ");
        double alcoholLevel = scanner.nextDouble();

        if (alcoholLevel < 0) {
            System.out.println("No alcohol in your system!");
        } else if (alcoholLevel <= 0.5) {
            System.out.println("Alcohol level is within tolerance.");
        } else if (alcoholLevel <= 1.0) {
            System.out.println("Your alcohol level is: " + alcoholLevel + "pro/mille. Your penalty is 50 Euro");
            penalty = penalty + 50;
        } else if (alcoholLevel <= 2.0) {
            System.out.println("Your alcohol level is: " + alcoholLevel + "pro/mille. Your penalty is 100 Euro");
            penalty = penalty + 100;
        } else {
            System.out.println("Your alcohol level is: " + alcoholLevel + "pro/mille. Your penalty is 2500 Euro");
            penalty = penalty + 2500;
        }

        return penalty;
    }

    public static double discount(double penalty) {
        if (penalty > 0) {
            System.out.println("Your total penalty is: " + penalty + "Euro");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Month: ");
            String month = scanner.next();

            switch (month) {
                case "January":
                case "February":
                    System.out.println("It is " + month + ". No discount possible! Your total penalty is " + penalty + " Euro.");
                    break;
                case "March":
                case "April":
                    penalty = penalty * 0.90;
                    System.out.println("It is " + month + ". Your total penalty is " + penalty + " Euro.");
                    break;
                case "May":
                case "June":
                    penalty = penalty * 0.85;
                    System.out.println("It is " + month + ". Your total penalty is " + penalty + " Euro.");
                    break;
                case "July":
                case "August":
                    penalty = penalty * 0.80;
                    System.out.println("It is " + month + ". Your total penalty is " + penalty + " Euro.");
                    break;
                case "September":
                case "October":
                    penalty = penalty * 0.75;
                    System.out.println("It is " + month + ". Your total penalty is " + penalty + " Euro.");
                    break;
                case "November":
                case "December":
                    penalty = penalty * 0.70;
                    System.out.println("It is " + month + ". Your total penalty is " + penalty + " Euro.");
                    break;
            }
        } else {
            System.out.println(" Everything's fine!");
        }
        return penalty;
    }
}
