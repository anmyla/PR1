package HOME_Exercises_Jandl;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        //Create a two-dimensional array containing three arrays
        // with three fields each. Initialize the multidimensional array
        // with the int 1 at each position. Print all the values to the
        // console in the form of a square.
        int[][] multiArray = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1},
        };
        for (int[] row : multiArray) {
            for (int item : row) {
                System.out.print(" " + item);
            }
            System.out.println();
        }

        System.out.println("Change the value in the middle to 9");
        multiArray[1][1] = 9;
        for (int[] row : multiArray) {
            for (int item : row) {
                System.out.print(" " + item);
            }
            System.out.println();
        }

        System.out.println("Change the corner values to 3");
        multiArray[0][0] = 3;
        multiArray[0][2] = 3;
        multiArray[2][0] = 3;
        multiArray[2][2] = 3;
        for (int[] row : multiArray) {
            for (int item : row) {
                System.out.print(" " + item);
            }
            System.out.println();
        }
    }
}

//Multidimensional Arrays
//Create a two-dimensional array containing three arrays
// with three fields each. Initialize the multidimensional array
// with the int 1 at each position. Print all the values to the
// console in the form of a square.


//Change the value in the middle to 9.
//Change the corner values to 3

