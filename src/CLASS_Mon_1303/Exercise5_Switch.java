package CLASS_Mon_1303;

import java.util.Scanner;

public class Exercise5_Switch {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of penalty: ");
        double penalty = scanner.nextDouble();

        System.out.println("Enter Month: ");
        String month = scanner.next();

        switch (month) {
            case "January":
            case "February":
                System.out.println("No discount possible! Your total penalty is " + penalty + " Euro.");
                break;
            case "March":
            case "April":
                penalty = penalty * 0.90;
                System.out.println("Your total penalty is " + penalty + " Euro.");
                break;
            case "May":
            case "June":
                penalty = penalty * 0.85;
                System.out.println("Your total penalty is " + penalty + " Euro.");
                break;
            case "July":
            case "August":
                penalty = penalty * 0.80;
                System.out.println("Your total penalty is " + penalty + " Euro.");
                break;
            case "September":
            case "October":
                penalty = penalty * 0.75;
                System.out.println("Your total penalty is " + penalty + " Euro.");
                break;
            case "November":
            case "December":
                penalty = penalty * 0.70;
                System.out.println("Your total penalty is " + penalty + " Euro.");
                break;
        }
    }
}
