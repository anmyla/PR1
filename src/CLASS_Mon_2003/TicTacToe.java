package CLASS_Mon_2003;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] playField= new char[3][3];
        char currentPlayer = 'X';

        printPlayField(playField);

        while (!(isPlayFieldFull(playField))) {
            System.out.println("Player " +currentPlayer+ " turn!");
            System.out.println("Choose a row ( 0, 1, 2)? : " );
            int row = input.nextInt();
            System.out.println("Choose a col (0, 1, 2)? : " );
            int col = input.nextInt();

           if (isMoveValid(playField, row, col)) {
               playField[row][col] = currentPlayer;
                if (currentPlayer == 'X') {
                    currentPlayer = 'O';
                    printPlayField(playField);
                }
                else {
                    System.out.println("Invalid move. Try again!");
                }
           }
        }


    }

//----------method to print the playfield on the console-----------
    public static void printPlayField(char[][] playField){
        playField = new char[3][3];
        System.out.println("   0    1    2");
        for (int row = 0; row < playField.length; row++) {
            System.out.print(row);
            for (int col = 0; col < playField[row].length; col++) {
                System.out.print("[ " + playField[row][col] + " ]");
            }
            System.out.println();
        }
    }

    public static boolean isPlayFieldFull(char[][] playField) {
        for (int row = 0; row < playField.length; row++) {
            for (int col = 0; col < playField[row].length; col++) {
                if (playField[row][col] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isMoveValid(char[][] playField, int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        if (playField[row][col] != ' ') {
            return false;
        }
        return true;
    }

}




