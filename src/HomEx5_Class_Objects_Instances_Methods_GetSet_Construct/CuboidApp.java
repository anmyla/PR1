package HomEx5_Class_Objects_Instances_Methods_GetSet_Construct;

public class CuboidApp {
    public static void main(String[] args) {
        Cuboid q1 = new Cuboid();
        double area;
        double vol;
        double surface;
        double scaledVolume;


        area = q1.calculateArea(23.5, 14.8);
        System.out.println("The area of the box is: " +area+ " sq/cm");

        vol = q1.calculateVolume(23.5,14.8,16.2);
        System.out.println("The volume of the box is: " +vol+ " sq/cm");

        surface = q1.calculateSurface(23.5,14.8,16.2);
        System.out.println("The surface area of the box is: " +surface+ " sq/cm");

        scaledVolume = q1.scaleTo(2, 23.5, 14.8, 16.2);
        System.out.println("The volume of the box when factored is: " + scaledVolume);

    }
}
