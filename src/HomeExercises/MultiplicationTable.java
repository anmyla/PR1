package HomeExercises;

public class MultiplicationTable {
    public static void main(String[] args) {
        int z;
        int b = 10;
        int c = 10;

        for (int i = 10; i < 21; i++) {
            for (int a = 0; a < 11; a++) {
                z = b * 10;

                b = b + 1;
                System.out.print(" " + z + " ");

            }
            System.out.println();
            c = i * 10;
            System.out.print(" " + c + " ");
        }
    }
}
