package HomeExercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        //-----with predefined values----------
        calculatePerimeter(3, 9);
        calculateArea(3, 9);
        System.out.println();


        //-----with values from user input----------
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter rectangle's width in meters: ");
        int width = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter rectangle's length in meters: ");
        int length = scanner2.nextInt();

        calculatePerimeter(width, length);
        calculateArea(width, length);
    }

    public static int calculatePerimeter(int width, int length) {
        int perimeter = ((width + length) * 2);
        System.out.println("The perimeter of this rectangle is: " + perimeter + " meters.");
        return perimeter;
    }

    public static int calculateArea(int width, int length) {
        int area = width * length;
        System.out.println("The area of this rectangle is: " + area + " square meters.");
        return area;
    }
}

