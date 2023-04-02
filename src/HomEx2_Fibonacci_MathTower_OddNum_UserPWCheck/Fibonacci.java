package HomEx2_Fibonacci_MathTower_OddNum_UserPWCheck;

public class Fibonacci {
    public static void main(String[] args) {
        int number = 20;
        int addend1 = 0;
        int addend2 = 1;
        int fibonacci = 0;

        for (int i = 0; i <= number; i++) {
            System.out.print(fibonacci + " ");
            fibonacci = addend1+ addend2;
            addend1 = addend2;
            addend2 = fibonacci;
        }
    }
}
