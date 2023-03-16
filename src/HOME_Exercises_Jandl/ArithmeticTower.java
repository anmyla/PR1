package HOME_Exercises_Jandl;

public class ArithmeticTower {
    public static void main(String[] args) {
        buildArithmeticTower(10);

    }
    public static int buildArithmeticTower (int multiplier) {
        int product = 0;
        int quotient = 0;
        for (int i = 1; i <= 9; i++ ) {
             product = multiplier * i;
            System.out.println( multiplier + " * " + i + " = " + product);
            multiplier = product;
        }
        for (int i = 1; i <= 9; i++ ) {
            quotient = product / i;
            System.out.println( product + " / " + i + " = " + quotient);
            product = quotient;
        }
        return product;
    }
}
