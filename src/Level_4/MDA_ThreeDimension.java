package Level_4;

public class MDA_ThreeDimension {
    public static void main(String[] args) {

        generateValuesInArray();
    }

    public static void generateValuesInArray() {
        double[][][] arr = new double[4][3][2];
        double average = 0;
        double sum = 0;
        int counter = 0;
        double max = 0;
        double min = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = Math.random() * 100;
                    System.out.print(arr[i][j][k] + ",   ");
                    sum = sum + arr[i][j][k];
                    counter++;
                    if (arr[i][j][k] > max) {
                        max = arr[i][j][k];
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        min = max;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++){
                    if (arr[i][j][k] < min) {
                        min = arr[i][j][k];
                    }
                }
            }
        }
        average = sum / counter;
        System.out.println("The sum of all the values in this array is: " + sum);
        System.out.println("The average value in this array is: " + average);
        System.out.println("The max values in this array is: " + max);
        System.out.println("The minimum value in this array is: " + min);

    }
}
