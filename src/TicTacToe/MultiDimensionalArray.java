package TicTacToe;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][][][] fourDimensionsArray = new int[4][3][2][2];
        int counter = 0;
        for (int[][][] dimension1 : fourDimensionsArray) {
            for (int[][] dimension2 : dimension1) {
                for (int[] dimension3 : dimension2) {
                    for (int dimension4 : dimension3) {
                        counter = counter + 1;
                    }
                }
            }
        }
        //System.out.println(fourDimensionArray.length * dimension1.length * dimension2.length * dimension3.length);

        System.out.println(counter);
    }
}