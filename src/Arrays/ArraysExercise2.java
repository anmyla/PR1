package Arrays;

import java.util.Arrays;

public class ArraysExercise2 {
    public static void main(String[] args) {
        int[] number = new int[100];

        int indexCounter = 0;
        for (int i = 2; i <= 200; i++) {
            if (i % 2 == 0) {
                number[indexCounter] = i;
                indexCounter++;
            }
        }
        System.out.println(Arrays.toString(number));
    }
}
