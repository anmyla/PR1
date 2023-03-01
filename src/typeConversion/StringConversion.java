package typeConversion;

import java.util.Scanner;

public class StringConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        String input = scanner.nextLine();

        //convert to short
        short shortNumber = Short.parseShort(input);
        System.out.println(shortNumber);

        //convert to int
        int intNumber = Integer.parseInt(input);
        System.out.println(intNumber);

        //convert to float
        float floatNumber = Float.parseFloat(input);
        System.out.println(floatNumber);

        //convert to double
        double doubleNumber = Double.parseDouble(input);
        System.out.println(doubleNumber);

        //convert to long
        long longNumber = Long.parseLong(input);
        System.out.println(longNumber);



    }
}
