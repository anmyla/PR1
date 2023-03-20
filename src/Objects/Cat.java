package Objects;

import java.util.Scanner;

public class Cat {
    String name;
    String color;
    String breed;
    int age;

    Cat (String n, String c, String b, int a) {
        n = name;
        c = color;
        b = breed;
        a = age;
    }
    public void catMeows() {
     String meows = "meow";

     if(meows.equals("meow")) {
     System.out.println(meows);
    }
     else {
         System.out.println("can't meow");}
    }


    public void catInfo() {
        System.out.println(name + " is " + age + " year old and she is a " + breed + ".");
    }

    public boolean catDrinksMilk() {
        boolean drinksMilk;
        System.out.println("Does it drink milk? : y/n");
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