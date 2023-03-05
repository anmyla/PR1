package HomeExercises;

import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner km = new Scanner(System.in);
        System.out.println("Enter distance in kilometer: ");
        int kilometers = km.nextInt();
        kilometerToMiles(kilometers);

        Scanner mi = new Scanner(System.in);
        System.out.println("Enter distance in miles: ");
        double miles = mi.nextDouble();
        milesToKilometer(miles);

    }
    public static double kilometerToMiles(int kilometers) {
        double distanceToMiles = kilometers * 0.62137119;
        System.out.println( kilometers + " km is equivalent to " + distanceToMiles + " miles.");
        return distanceToMiles;
    }
    public static double milesToKilometer(double miles) {
        double distanceToKilometers = miles * 1.609344;
        System.out.println( miles + " miles is equivalent to " + distanceToKilometers + " km.");
        return distanceToKilometers;
    }

}
