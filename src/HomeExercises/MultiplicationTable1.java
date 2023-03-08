package HomeExercises;

public class MultiplicationTable1 {
    public static int[][] multiTable(int row, int col)
    {
        int length = 10;
        int [][] yes = new int[row][col];

        for (row = 1; row <= yes.length ; row++)
        {
            for (int column = 1; column <= yes[row].length; column++)
            {
                yes[row-1][column-1] = (row)*(column);
            }

        }
        return yes;
    }

}
