package Basics;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] twoDi = new int[3][3];

        for (int[] row : twoDi) {
            for (int el : row) {
                el = 1;
                System.out.print(" " + el);
            }
            System.out.println();
        }
        System.out.println('\n' );
        for (int i = 0; i < twoDi.length; i++) {
            for (int j = 0; j < twoDi[i].length; j++)  {
                if (( i == 0 && j == 0) ||( i == 0 && j == 2) || ( i == 2 && j == 0) || ( i == 2 && j == 2)){
                    twoDi[i][j] = 3;
                }
                if (i==1 && j ==1) {
                    twoDi[i][j] = 9;
                }
                System.out.print(" " + twoDi[i][j]);
            }
            System.out.println();
        }

    }
}

//Multidimensional Arrays
//Create a two-dimensional array containing three arrays with
// three fields each. Initialize the multidimensional array with
// the int 1 at each position. Print all the values to the console in the form of a square.
//Change the value in the middle to 9.
//Change the corner values to 3
//
//A picture containing text
//
//Description automatically generated
//
//Graphical user interface
//
//Description automatically generated with low confidence
//
//Graphical user interface
//
//Description automatically generated with medium confidence
