package HomeExercises;

public class Triangle {
    public static void main(String[] args) {
        int x = 10;
        for (int i = 1; i <= x; ++i) {
            for (int j = 1; j < i; ++j) {
                System.out.print(j);
            }
            System.out.println(i);
        }
    }
}
