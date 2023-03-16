package HOME_Exercises_Jandl;

public class MultiplicationTable {
    public static void main(String[] args)  {
        int[][] arrayMultiplicationTable = new int[10][10];
        int row = 10;
        int column = 10;
        for(int a = 0; a < arrayMultiplicationTable.length; a++)
        {
            for(int b = 0; b < arrayMultiplicationTable[a].length; b++)
            {
                arrayMultiplicationTable[a][b] = row * column;
                column = column + 1;
            }
            row = row + 1;
            column = 10;
        }
        for(int a = 0; a < arrayMultiplicationTable.length; a++)
        {
            for(int b = 0; b < arrayMultiplicationTable[a].length; b++)
            {
                System.out.print(" " + arrayMultiplicationTable[a][b] + "  ");
            }
           System.out.println();
        }
    }
}