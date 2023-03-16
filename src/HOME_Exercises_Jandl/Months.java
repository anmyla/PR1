package HOME_Exercises_Jandl;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        //------ Predefined values---------
        System.out.println(monthChecker(11));
        System.out.println(monthChecker(8));
        System.out.println(monthChecker(13));

        //--------- Input values -----------
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a number between 1 - 12: ");
        int month = scanner1.nextInt();

        System.out.println("The month is: " + monthChecker(month));

    }

    private static String monthChecker(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "ERROR: Only acceptable numbers are from 1 to 12";
        };
    }
}

