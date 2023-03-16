package HOME_Exercises_Jandl;

public class Triangle {
    public static void main(String[] args) {
            int x = 10;
            for (int i = 1; i < x; ++i) {
                for (int y = 1; y < i; ++y) {
                    System.out.print(y);
                }
                System.out.println(i);
            }
        }
    }