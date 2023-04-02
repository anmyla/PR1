package Exer2_Gerzic_Continue_Break_ForLoop_Modulo_IntToString;
import  java.util.Arrays;
public class IntegerToString_Arrays {
    public static void main(String[] args) {
        int evenNumber = 2;
        int indexCounter = 0;
        String[] array1 = new String[100];

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                array1[indexCounter] = Integer.toString(i);
                indexCounter++;
            }
        }

        System.out.println(Arrays.toString(array1));
    }

}

