package Level_4;

public class MDA_CalculateSum {
    public static void main(String[] args) {
        double[][] sampleArray1 = {
                {8.8, 12},
                {134, 67.92, 45, 32.4, 76},
                {1},
                {0, 0.56}
        };

        double sum = 0;
        for (int i = 0; i< sampleArray1.length; i++) {
            for (int j= 0; j< sampleArray1[i].length; j++) {
                sum = sum + sampleArray1[i][j];
            }
        }
        System.out.println("The sum of all the values in this multiarray is: " + sum);
    }
}
