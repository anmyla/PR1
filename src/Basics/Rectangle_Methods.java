package Basics;

public class Rectangle_Methods {
    public static void main(String[] args) {

        System.out.println("Area in sq. m. : " + calculateArea(24,10));
        System.out.println("Perimeter in m: " + calculatePerimeter(24,10));

    }
    public static int calculateArea (int length, int width){
        int area = length * width;
        return area;
    }

    public static int calculatePerimeter (int length, int width){
        int perimeter = 2 * (length + width);
        return perimeter;
    }

}
//Rectangle
//Create a new class “Rectangle”. Declare the variables width and length.
// Both should store an integer value representing the width and length of a rectangle.
//Now declare a third variable: circumference. Calculate the circumference of the rectangle.
//Then declare a fourth variable: area. Calculate the area of the rectangle.
//Write the circumference and the area to the console.
//Convert the functionality of your Rectangle class into 2 methods: calculateCircumference() and calculateArea()!
