package ClassroomExercises;

public class Method {
    public static void main(String[] args) {

        double area1= calculateArea(2.1, 4.4);
        double area2= calculateArea(5.4, 3.4);

        if (area1 > area2) {
            System.out.println("Area 1 is greater than Area 2");
        }
        else {
            System.out.println("Area 2 is greater than Area 1");
        }
    }

    public static double calculateArea (double length, double breadth) {
        double area = length * breadth;
        return area;

    }
}
