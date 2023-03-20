package CLASS_Mon_2003;
import java.util.Scanner;
public class TicTacToeSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[3][3];
        char currentPlayer = 'X';

        initializeBoard(board);
        printBoard(board);

        while (!isGameOver(board)) {
            System.out.println("Player " + currentPlayer + "'s turn.");
            System.out.print("Enter row (0-2): ");
            int row = scanner.nextInt();
            System.out.print("Enter column (0-2): ");
            int col = scanner.nextInt();

            if (isValidMove(board, row, col)) {
                board[row][col] = currentPlayer;
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                printBoard(board);
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        char winner = getWinner(board);
        if (winner != ' ') {
            System.out.println("Player " + winner + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    public static void initializeBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                board[row][col] = ' ';
            }
        }
    }

    public static void printBoard(char[][] board) {
        System.out.println("   0  1  2");
        for (int row = 0; row < board.length; row++) {
            System.out.print(row + " ");
            for (int col = 0; col < board[0].length; col++) {
                System.out.print("[" + board[row][col] + "]");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isGameOver(char[][] board) {
        if (getWinner(board) != ' ' || isBoardFull(board)) {
            return true;
        }
        return false;
    }

    public static boolean isBoardFull(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValidMove(char[][] board, int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        if (board[row][col] != ' ') {
            return false;
        }
        return true;
    }

    public static char getWinner(char[][] board) {
        for (int i = 0; i < 3; i++) {
            // check rows
            if (board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] != ' ') {
                return board[i][0];
            }
            // check columns
            if (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] != ' ') {
                return board[0][i];
            }
        }
        // check diagonal from top-left to bottom-right
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != ' ') {
            return board[0][0];
        }

// check diagonal from top-right to bottom-left
        if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != ' ') {
            return board[0][2];
        }
return board[0][0];
    }
}