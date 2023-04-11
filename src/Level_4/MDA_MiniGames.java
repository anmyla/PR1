package Level_4;

public class MDA_MiniGames {
    public static void main(String[] args) {

//        calculateSum();
//        calculateAverage();
//        findMinMax();
//        calculateRowSum();
        System.out.println("Are the sums of different rows equal? " + allRowsEqual());
    }

    public static int[][] randomIntValuesInMDArray() {
        int[][] sampleArray = new int[8][8];

        for (int i = 0; i < sampleArray.length; i++) {
            for (int j = 0; j < sampleArray[i].length; j++) {
                sampleArray[i][j] = (int) (Math.random() * 100);
            }
        }
        return sampleArray;
    }

    public static void calculateSum() {
        int[][] sampleArray2 = randomIntValuesInMDArray();
        int sum = 0;

        for (int i = 0; i < sampleArray2.length; i++) {
            for (int j = 0; j < sampleArray2[i].length; j++) {
                System.out.print(sampleArray2[i][j] + " ");
                sum = sum + sampleArray2[i][j];
            }
            System.out.println();
        }
        System.out.println("The sum of all the values in the array is: " + sum);
        System.out.println();
    }

    public static void calculateAverage() {
        int[][] sampleArray2 = randomIntValuesInMDArray();
        int sum = 0;

        for (int i = 0; i < sampleArray2.length; i++) {
            for (int j = 0; j < sampleArray2[i].length; j++) {
                sum = sum + sampleArray2[i][j];
            }
        }
        System.out.println("The average of all values in the array is: " + sum / sampleArray2.length);
        System.out.println("-------------------------------------");
    }

    public static void findMinMax() {
        int[][] sampleArray3 = randomIntValuesInMDArray();
        int max = 0;
        int min = 0;


        for (int i = 0; i < sampleArray3.length; i++) {
            for (int j = 0; j < sampleArray3[i].length; j++) {
                System.out.print(sampleArray3[i][j] + " ");
                if (sampleArray3[i][j] > max) {
                    max = sampleArray3[i][j];
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The highest value is: " + max);

        min = max;

        for (int i = 0; i < sampleArray3.length; i++) {
            for (int j = 0; j < sampleArray3[i].length; j++) {
                if (sampleArray3[i][j] < min) {
                    min = sampleArray3[i][j];
                }
            }
        }
        System.out.println("The  lowest value is: " + min);
        System.out.println();
    }

    public static void calculateRowSum() {
        int[][] sampleArray5 = randomIntValuesInMDArray();
        int sum = 0;
        int[] sumsFromRows = new int[sampleArray5.length];

        for (int i = 0; i < sampleArray5.length; i++) {
            for (int j = 0; j < sampleArray5[i].length; j++) {
                sum = sum + sampleArray5[i][j];
            }
            System.out.println("The sum of all values in row " + i + " is : " + sum);
            sumsFromRows[i] = sum;
            sum = 0;
        }
        System.out.println();
    }

    public static boolean allRowsEqual() {
        boolean isEqual = false;
        int[][] sample = {
                {2, 5, 3, 2},
                {6, 4, 2},
                {2, 10},
                {2, 2, 2,2, 6}
        };
        int sum = 0;
        int[] sumsFromRows = new int[sample.length];

        for (int i = 0; i < sample.length; i++) {
            for (int j = 0; j < sample[i].length; j++) {
                sum = sum + sample[i][j];
            }
            System.out.println("The sum of all values in row " + i + " is : " + sum);
            sumsFromRows[i] = sum;
            sum = 0;
        }

        for (int i = 0; i < sample.length; i++) {
            if (sumsFromRows[0] == sumsFromRows[i]) {
                isEqual = true;
            }
            else {
                isEqual = false;
            }
        }
        return isEqual;
    }
}

