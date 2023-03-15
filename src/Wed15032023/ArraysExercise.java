package Wed15032023;
import  java.util.Arrays;
public class ArraysExercise {
    public static void main(String[] args) {
        int evenNumber = 2;
        int indexCounter = 0;
        String[] array1 = new String[100];

        for (int i = 0; i < 200; i++) {
            if (i % 2 == 0) {
                array1[indexCounter] = Integer.toString(i);
                indexCounter++;
            }
        }

        System.out.println(Arrays.toString(array1));
    }

}

