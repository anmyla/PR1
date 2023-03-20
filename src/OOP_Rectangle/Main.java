package OOP_Rectangle;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------Parameters/Construct------------------");

        Rectangle r1 = new Rectangle(43, 45);
        System.out.println("height: " + r1.getHeight());
        System.out.println("width: " + r1.getWidth());

        System.out.println("-----------Getter------------------");
        double height = r1.getHeight();
        double width = r1.getWidth();

        System.out.println("The height is: " + height );
        System.out.println("The width is: " + width);


        System.out.println("-----------Setter------------------");

        r1.setHeight(4);
        r1.setWidth(25);

        System.out.println("The height is: " + height );
        System.out.println("The width is: " + width);

        System.out.println("-----------more functions------------------");

        System.out.println("The area is: " + r1.getArea());
        System.out.println("The perimeter is: " + r1.getPerimeter());


    }
}

//Task:
//Create a class called Rectangle that represents a rectangle with a width and height. The class should contain the following methods:
//A constructor that takes a width and height as parameters and sets them as the width and height of the rectangle.
//Getter methods getWidth() and getHeight(), which return the width and height of the rectangle as doubles, respectively.
//Setter methods setWidth(double width) and setHeight(double height), which set the width and height of the rectangle, respectively.
//A getArea() method that calculates and returns the area of the rectangle (width * height).
//A method getPerimeter(), which calculates and returns the perimeter of the rectangle (2 * (width + height)).
//Create a separate class Main that tests the Rectangle class by creating two rectangle objects with different widths and heights, and then outputs their areas and perimeters.