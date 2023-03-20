package OOP_Rectangle;

import java.util.Scanner;

public class Rectangle {
    private double height; //set to private so other classes can't change the values
    private double width; //set to private so other classes can't change the values

    Rectangle(double h, double w) {
        this.height = h;
        this.width = w;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width =width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return height * width;
    }

    public double getPerimeter() {
        return 2*(height + width);
    }


}
