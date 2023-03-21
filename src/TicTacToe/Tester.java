package TicTacToe;

public class Tester {
    public static void main(String[] args) {

        char[][] playField = new char[3][3];
        System.out.println("   0    1    2");
        for (int row = 0; row < playField.length; row++) {
            System.out.print(row);
            for (int col = 0; col < playField[0].length; col++) {
                System.out.print("[ " + playField[row][col] + " ]");
            }
            System.out.println();
        }
    }

}
