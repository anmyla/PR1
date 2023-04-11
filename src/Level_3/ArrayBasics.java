package Level_3;

import java.util.Scanner;
import java.util.UUID;
import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
//        simpleArrayInt();
//        maxValueInArrayDouble();
//        randomStringArray();
//        calculateSumForEachArrayRow();
//        randomIntValuesInArray();
//        onlyEvenNumbers();
//        startsWithLetter('a');
//        userInputArray();
        findAverageArrayDouble();

    }

    public static void simpleArrayInt() {
        int[] arr1 = {56, 23, 12, 56, 98, 2, 89, 43, 6, 35};

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println();
    }

    public static void maxValueInArrayDouble() {
        double[] arr2 = new double[5];
        double max = 0;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Math.random() * 100;
            System.out.print(arr2[i] + ",   ");
            if (arr2[i] > max) {
                max = arr2[i];
            }
        }
        System.out.println('\n' + "The greatest values in this array is: " + max);
        System.out.println();
    }

    static String usingRandomUUID() {
        UUID randomUUID = UUID.randomUUID();
        return randomUUID.toString().replaceAll("_", "");
    }

    public static void randomStringArray() {
        String[] arr3 = new String[8];
        int length = 0;
        for (int i = 0; i < arr3.length; i++) {
            String randomStr = usingRandomUUID();
            arr3[i] = randomStr;
            System.out.println(arr3[i]);

            System.out.println("The of :" + arr3[i] + " is " + arr3[i].length());
        }
        System.out.println();
    }

    public static void calculateSumForEachArrayRow() {
        int[] arr4 = new int[12];
        int rowSum = 0;
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = (int) (Math.random() * 100);
            rowSum = rowSum + arr4[i];
            System.out.print(arr4[i] + ",   ");
        }
        System.out.println('\n' + "The total sum of all values in this array is: " + rowSum);
        System.out.println();
    }

    public static void randomIntValuesInArray() {
        int[] arr5 = new int[15];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = (int) (Math.random() * 100);
            System.out.println(arr5[i] + ",   ");
        }
        System.out.println();
    }

    public static void onlyEvenNumbers() {
        int[] arr6 = new int[20];
        System.out.println("Only prints even numbers");
        for (int i = 0; i < arr6.length; i++) {
            arr6[i] = (int) (Math.random() * 100);
            if (arr6[i] % 2 == 0) {
                System.out.print(arr6[i] + ",   ");
            }
        }
        System.out.println();
    }

    public static void startsWithLetter(char letter) {
        String startLetter = String.valueOf(letter);
        String[] arr7 = new String[]
                {
                        "banana",
                        "pineapple",
                        "mango",
                        "guava",
                        "avocado",
                        "apple",
                        "atis",
                        "durian",
                        "aratilis",
                        "jackfruit",
                };

        for (int i = 0; i < arr7.length; i++) {
            if (arr7[i].startsWith(startLetter.toLowerCase())) {
                System.out.println(arr7[i]);
            }
        }
    }

    public static void userInputArray() {
        Scanner scan = new Scanner(System.in);
        int[] arr8 = new int[10];

        System.out.println("Takes value from user input ans saves in array");
        for (int i = 0; i < arr8.length; i++) {
            System.out.println("Enter a number (1-1000): ");
            arr8[i] = scan.nextInt();
        }
        System.out.println("The numbers you entered are:  ");

        for (int i = 0; i < arr8.length; i++) {
            System.out.print(arr8[i] + " ");
        }
        Arrays.sort(arr8);
        System.out.println('\n' + "The lowest value you entered is: " + arr8[0]);
        System.out.println("The highest value you entered is: " + arr8[arr8.length - 1]);
    }

    public static void findAverageArrayDouble() {
            double[] arr10 = new double[9];
            double average = 0;
            double sum = 0;
            for (int i = 0; i < arr10.length; i++) {
                arr10[i] = Math.random() * 100;
                System.out.print(arr10[i] + ",   ");
                sum = sum + arr10[i];
                }
            average = sum/arr10.length;
            System.out.println('\n' + "The average value in this array is: " + average);
            System.out.println();
        }

    }


