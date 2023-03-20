package Objects;

import java.util.Scanner;

public class Police {
    String name;
    String precinct;

    Police (String n, String p) {
        n = name;
        p = precinct;
    }
    public double speedCheck() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the speed: ");
        double s = input.nextDouble();
        return s;
    }

}
