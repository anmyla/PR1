package HomeExercises;

public class ArithmeticTower {
    public static void main(String[] args) {
        buildArithmeticTower();

    }
    public static void buildArithmeticTower () {
        int multiplier = 1;
        int product;
        for (int i = 1; i <= 9; i++ ) {
             product = multiplier * i;
            System.out.println( multiplier + " * " + i + " = " + product);
            multiplier = product;
        }
    }
}
