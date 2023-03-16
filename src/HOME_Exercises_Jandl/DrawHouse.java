package HOME_Exercises_Jandl;

public class DrawHouse {
    public static void main(String[] args) {
        int[][] house = {
                {0, 0, 0, 8, 0, 0, 0},
                {0, 0, 8, 0, 8, 0, 0},
                {0, 8, 8, 8, 8, 8, 0},
                {8, 8, 8, 8, 8, 8, 8},
                {8, 0, 0, 8, 0, 0, 8},
                {8, 8, 8, 0, 8, 8, 8},
                {8, 8, 8, 0, 8, 8, 8},
        };
        for (int[] row : house) {
            for (int item : row) {
                if (item == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(item);
                }
            }
            System.out.println();
        }

    }
}
