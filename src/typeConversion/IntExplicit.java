package typeConversion;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class IntExplicit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number: ");

       /* int number = scanner.nextInt();
        */

        double number = scanner.nextDouble();
        System.out.println("Before conversion: " +number);

        /*
        double temp = number;
        System.out.println("After conversion: " +temp);
        */

        /*
        int temp = (int) number;
        System.out.println("After conversion: " +temp);
        */

        System.out.println("After the conversion to float: " +(float) number);

        System.out.println("After the conversion to long: " +(long) number);

        System.out.println("After the conversion to short: " +(short) number);

        //double to String
        String stringNumber = Double.toString(number);
        System.out.println(stringNumber);
    }
}
