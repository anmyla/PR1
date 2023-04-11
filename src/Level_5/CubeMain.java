package Level_5;

public class CubeMain {
    public static void main(String[] args) {
        CubeClass test = new CubeClass();
        System.out.println("The area is: " + test.groundArea(10,5));
        System.out.println("The volume is: " + test.volume(10,5,5));
        test.scaled(10,5,5, 3);
        System.out.println("The surface area is: " + test.surfaceArea(10,5,5));

    }
}
