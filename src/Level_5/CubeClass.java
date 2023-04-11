package Level_5;

public class CubeClass {
    double length = 0;
    double width = 0;
    double height = 0;



    public double groundArea(double length, double width) {
        this.length = length;
        this.width = width;

        double area = length * width;
        return area;
    }
    public void scaled(double length, double width, double height, int factor) {
        this.length = length;
        this.width = width;
        this.height = height;
        System.out.println();
        System.out.println("The scaled length by: "+ factor+ " is: " + length * factor);
        System.out.println("The scaled width: "+ factor+ " is: " + width * factor);
        System.out.println("The scaled height: "+ factor+ " is: " + height * factor);
        System.out.println();
    }

    public double volume(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;

        double vol = length * width * height;
        return vol;
    }

    public double surfaceArea(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;

        double surface = ((length * width) + (length * height) + (height * width)) * 2;
        return surface;
    }



}




