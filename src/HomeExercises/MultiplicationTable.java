package HomeExercises;

public class MultiplicationTable {
    public static void main(String[] args) {
        int z = 10;
        int b = 10;
        int c = 10;
        for (int i = 10; i < 21; i++) {
            for (int a = 0; a < 10; a++) {
                z = b * 10;
                System.out.print(" " + z + " ");
                b = b + 1;
            }
            System.out.println();
            c = c * 10;
            System.out.print(" " + c + " ");
        }
    }
}
