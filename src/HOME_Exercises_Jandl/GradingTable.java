package HOME_Exercises_Jandl;

import java.util.Scanner;

public class GradingTable {
    public static void main(String[] args) {

        Scanner scannerPoints = new Scanner(System.in);
        System.out.println("Enter your points: ");
        int points = scannerPoints.nextInt();

        System.out.println("Your grade is:");
        getGrades(points);
    }

    private static int getGrades(int points) {
        if ((points == 89) || (points > 90)) {
            System.out.println("Outstanding");
        } else if ((points > 77) && (points < 89)) {
            System.out.println("Excellent");
        } else if ((points > 64) && (points < 78)) {
            System.out.println("Acceptable");
        } else if ((points > 50) && (points < 65)) {
            System.out.println("Passing");
        } else {
            System.out.println("Fail");
        }
        return points;
    }
}


