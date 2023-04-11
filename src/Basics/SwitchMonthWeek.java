package Basics;

import java.util.Scanner;

public class SwitchMonthWeek {
    public static void main(String[] args) {

        System.out.println(month());
        System.out.println(week());

    }
    private static String month(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int mon = input.nextInt();
        return switch (mon) {
            case 1 -> "Jan";
            case 2 -> "Feb";
            case 3 -> "Mar";
            case 4 -> "Apr";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "Aug";
            case 9 -> "Sep";
            case 10 -> "Oct";
            case 11 -> "Nov";
            case 12 -> "Dec";
            default -> "invalid input";
        };
    }

    private static String week(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int week = input.nextInt();
        return switch (week) {
            case 1 -> "Mon";
            case 2 -> "Tue";
            case 3 -> "Wed";
            case 4 -> "Thu";
            case 5 -> "Fri";
            case 6 -> "Sat";
            case 7 -> "Sun";
            default -> "invalid input";
        };
    }
}
//Switch Months
//
//Create a new class “Months”. Write a program that takes an int as a
// parameter and prints out the corresponding month. For example, if the
// input is "1", the program should print out "January".
//
//Switch Week
//Create a new class “Week”. Write a program that takes an int from a
// scanner as a parameter and prints out the corresponding weekday.
// For example if the input is 1, the program should print out “Monday”.
// IF the input parameter is any other number, the program should print out an error message.
