package Objects;

import java.util.Locale;
import java.util.Scanner;

public class Hund {
    String name;
    String color;
    String breed;
    int age;

    public void barking() {
        String barks = "woof woof";
    }


    public void dogInfo() {
        System.out.println(name + " is " +age+ " year old and she is a " +breed + "." );
    }

    public boolean dogBringsStick() {
        boolean bringStick;
        System.out.println("Can it bring stick? : y/n");
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        answer = answer.toLowerCase();

        if (answer.equals("y")) {
            return true;
        } else {
            return false;
        }
    }
}