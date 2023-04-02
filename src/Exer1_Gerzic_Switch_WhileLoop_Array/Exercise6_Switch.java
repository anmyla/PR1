package Exer1_Gerzic_Switch_WhileLoop_Array;

import java.util.Scanner;

public class Exercise6_Switch {
    public static void main(String[] args) {
//        daysOfTheMonth();
//        int numberOfDays = daysOfTheMonth();
//        System.out.println("number of days from the method daysOfTheMonth: " + numberOfDays);
    }

    public static int daysOfTheMonth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month: ");
        String month = scanner.next();
        int days = 0;

        switch (month.toLowerCase()) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                System.out.println(month + " has 31 days");
                days = days + 31;
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println(month + " has 30 days");
                days = days + 30;
                break;
            case "february":
                System.out.println(month + " has 28 days");
                days = days + 28;
        }
        return days;
    }
}
