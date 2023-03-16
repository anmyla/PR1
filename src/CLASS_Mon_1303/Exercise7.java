package CLASS_Mon_1303;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        int days = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month: ");
        String month = scanner.next();
        month = month.toLowerCase();

        if ( (month.equals("january") || (month.equals("march") || (month.equals("may") || (month.equals("august") || (month.equals("october") || (month.equals("december") ))))))) {
            System.out.println(month + " has 31 days");
            days = days + 31;
        }
        else if ( (month.equals("april") || (month.equals("june") || (month.equals("september") || (month.equals("november")))))) {
            System.out.println(month + " has 30 days");
            days = days + 30;
        }
        else {
            System.out.println(month + " has 28 days");
            days = days + 28;
        }
    }
}
