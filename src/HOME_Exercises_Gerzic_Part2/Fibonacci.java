package HOME_Exercises_Gerzic_Part2;

public class Fibonacci {
    public static void main(String[] args) {
        int number = 20;
        int addend = 1;
        int fibonacci = 1;
        for (int i = 0; i <= number; i++) {
            System.out.print(fibonacci + " " + addend + " ");
            fibonacci = fibonacci + addend;
            addend = addend + fibonacci;
        }
    }
}