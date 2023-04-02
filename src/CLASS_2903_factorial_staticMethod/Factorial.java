package CLASS_2903_factorial_staticMethod;

public class Factorial {
    public static void main(String[] args) {

        int factorial = findFactorial(5);
        System.out.println( " = " + factorial);

    }

    public static int findFactorial(int num) {
        if (num >= 1) {
            System.out.print(num + " * ");
            return num * findFactorial(num - 1);
        }
        return 1;
    }
}