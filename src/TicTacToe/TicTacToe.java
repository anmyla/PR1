package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] playField = new char[3][3];
        char currentPlayer = 'X';

        initializePlayField(playField);
        printPlayField(playField);

        while (!isGameOver(playField)){
            System.out.println("Player " + currentPlayer + "'s turn!");
            System.out.println("Choose a row (0,1,2)? : ");
            int row = input.nextInt();
            System.out.println("Choose a col (0,1,2)? : ");
            int col = input.nextInt();

            if (isMoveValid(playField, row, col)) {
                playField[row][col] = currentPlayer;
                if (currentPlayer == 'X') {
                    currentPlayer = 'O';
                } else {
                    currentPlayer = 'X';
                }
                printPlayField(playField);
            } else {
                System.out.println("Invalid move. Try again!");
            }
        }

        char winner = getWinner(playField);
        if (winner != ' ') {
            System.out.println("Player " + winner + " wins!");
        } else {
            System.out.println("It's a tie!");
        }

    }

    public static void initializePlayField(char[][] playField) {
        for (int row = 0; row < playField.length; row++) {
            for (int col = 0; col < playField[row].length; col++) {
                playField[row][col] = ' ';
            }
        }
    }

    //----------method to print the playField on the console-----------
    public static void printPlayField(char[][] playField) {
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
        boolean isEmpty;
        int emptyBoxCounter = 0;
        for (int row = 0; row < playField.length; row++) {
            for (int col = 0; col < playField[row].length; col++) {
                if (playField[row][col] == ' ') {
                    isEmpty = true;
                    emptyBoxCounter++;
                }
            }
        }
        if (emptyBoxCounter == 0) {
            return true;
        }
        return false;
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

    public static char getWinner(char[][] playField) {
        for (int i = 0; i < 3; i++) {
            // check rows
            if (playField[i][0] == playField[i][1] && playField[i][0] == playField[i][2] && playField[i][0] != ' ') {
                return playField[i][0];
            }
            // check columns
            if (playField[0][i] == playField[1][i] && playField[0][i] == playField[2][i] && playField[0][i] != ' ') {
                return playField[0][i];
            }
        }
        // check diagonal from top-left to bottom-right
        if (playField[0][0] == playField[1][1] && playField[0][0] == playField[2][2] && playField[0][0] != ' ') {
            return playField[0][0];
        }
        // check diagonal from top-right to bottom-left
        if (playField[0][2] == playField[1][1] && playField[0][2] == playField[2][0] && playField[0][2] != ' ') {
            return playField[0][2];
        }
        return playField[0][0];
    }

    public static boolean isGameOver(char[][] playField) {
        if (getWinner(playField) != ' ' || isPlayFieldFull(playField)) {
            return true;
        }
        return false;
    }

}




