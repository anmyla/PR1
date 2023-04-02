package Homex4_MultidimensionalArrays;

public class MultidimensionalArrayExercises {
    public static void main(String[] args) {

        multiArraySumY();
        multiArraySpiel();
        calculateSumOfEachRow();
        threeDimensionalArray();

    }

    public static void multiArraySumY() { //Übung 1 – Summen berechnen (aller Elemente im Array)
        double[][] findSum = {
                {5.6, 4, 0, 2.4},
                {6.7, 32.3, 5, 7.9, 2},
                {56.2, 45, 82.1, 34},
                {34, 54.1, 76.2, 49, 3.2, 0.4}};

        double sum = 0;

        for (double[] col : findSum) {
            for (double row : col) {
                System.out.print(row + " ");
                sum = sum + row;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The sum of all the numbers in the array is: " + sum);
        System.out.println();
        System.out.println("------------------------------------------------------------------");
    }

    public static void multiArraySpiel() { //1.2 Übung 2 – MultiArray-Spielereien
        int[][] numField = new int[8][8];

        int sum = 0;
        int counter = 0;

        int lowestValue = 0;
        int greatestValue = 0;

        for (int i = 0; i < numField.length; i++) {
            for (int j = 0; j < numField[i].length; j++) {
                counter++;
                numField[i][j] = (int) (Math.random() * 101);
                System.out.print(" " + numField[i][j]);
                sum = sum + numField[i][j];
                if (numField[i][j] > greatestValue) {
                    greatestValue = numField[i][j];
                }
            }
            System.out.println();
        }

        lowestValue = greatestValue;
        for (int i = 0; i < numField.length; i++) {
            for (int j = 0; j < numField[i].length; j++) {
                if (numField[i][j] < lowestValue) {
                    lowestValue = numField[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("The sum of all the numbers in the array is: " + sum);
        System.out.println("The average of all the numbers in the array is: " + (sum / counter));
        System.out.println("The highest value in the array is: " + greatestValue);
        System.out.println("The lowest value in the array is: " + lowestValue);
        System.out.println("------------------------------------------------------------------");
    }

    public static void calculateSumOfEachRow() { //Übung 3 – Einzelne Summen vergleichen
        int[][] sumEachArray = new int[8][8];

        int sum = 0;
        int rowSum = 0;
        int numValue = 0;
        int[] sumOfEachRow = new int[8];

        for (int i = 0; i < sumEachArray.length; i++) {
            for (int j = 0; j < sumEachArray[i].length; j++) {
                sumEachArray[i][j] = (int) (Math.random() * 100);
                numValue = sumEachArray[i][j];
                System.out.print(" " + numValue);
                sum = sum + numValue;
            }
            System.out.println();
            rowSum = sum;
            sumOfEachRow[i] = rowSum;
            rowSum = 0;
            sum = 0;
        }
        System.out.println();

        boolean rowsHaveEqualSums = false;
        int greatestNumber = 0;
        int rowWithGreatestSum = 0;
        for (int i = 0; i < sumOfEachRow.length; i++) {
            System.out.println("The sum of row " + i + " is :" + sumOfEachRow[i]);
            if (sumOfEachRow[i] > greatestNumber) {
                greatestNumber = sumOfEachRow[i];
                rowWithGreatestSum = i;
            }
        }
        if (sumOfEachRow[0]==sumOfEachRow[1] && (sumOfEachRow[1]==sumOfEachRow[2]) && (sumOfEachRow[2]==sumOfEachRow[3]) && (sumOfEachRow[3]==sumOfEachRow[4]) && (sumOfEachRow[4]==sumOfEachRow[5]) && (sumOfEachRow[5]==sumOfEachRow[6]) && (sumOfEachRow[6]==sumOfEachRow[7])) {
            rowsHaveEqualSums = true;
            System.out.println("The sum of each of the " +sumOfEachRow.length+ " one-dimensional arrays is equal to the others.");
        }else {
            System.out.println("The sums the " +sumOfEachRow.length+ " one-dimensional arrays are not equal.");
            }
        System.out.println("The row which contains the greatest sum is row: " + rowWithGreatestSum + " with the value of: " + greatestNumber);
        System.out.println("------------------------------------------------------------------");
    }

    public static void threeDimensionalArray() {
        double [][][] threeDimensions = new double [4][3][2];
        double sum = 0;
        double greatestValue = 0;
        double lowestValue = 0;
        int counter = 0;


        for (int i = 0; i < threeDimensions.length; i++) {
            for (int j = 0; j < threeDimensions[i].length; j++) {
                for (int k = 0; k < threeDimensions[i][j].length; k++) {
                    threeDimensions[i][j][k] = (double) (Math.random() * 100);
                    System.out.print(" " + threeDimensions[i][j][k]);
                    sum = sum + threeDimensions[i][j][k];
                    counter++;
                    if (threeDimensions[i][j][k] > greatestValue) {
                        greatestValue = threeDimensions[i][j][k];
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();

        lowestValue = greatestValue;
        for (int i = 0; i < threeDimensions.length; i++) {
            for (int j = 0; j < threeDimensions[i].length; j++) {
                for (int k = 0; k < threeDimensions[i][j].length; k++) {
                    if (threeDimensions[i][j][k] < lowestValue) {
                        lowestValue = threeDimensions[i][j][k];
                    }
                }
            }
        }
        System.out.println("The sum of all the numbers in the array is: " + sum);
        System.out.println("The average of all the numbers in the array is: " + (sum / counter));
        System.out.println("The highest value in the array is: " + greatestValue);
        System.out.println("The lowest value in the array is: " + lowestValue);
    }

}
