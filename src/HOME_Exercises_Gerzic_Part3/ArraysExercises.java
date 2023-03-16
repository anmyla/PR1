package HOME_Exercises_Gerzic_Part3;

import java.util.Random;
import java.util.Scanner;

public class ArraysExercises {
    public static void main(String[] args) {
//        arrayExercises1();
//        arrayExercises2();
//        arrayExercises3();
//        arrayExercises4();
//        arrayExercises5();
//        arrayExercises6();
        arrayExercises8();
    }

    public static void arrayExercises1() { // prints out each element in each position in the array
        int[] sample1 = new int[]
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < sample1.length; i++) {
            int elementInArray = sample1[i];
            System.out.println("The element in position " + i + " of sample1 array is: " + elementInArray);
        }
    }

    public static void arrayExercises2() { // checks and prints out the highest number in the array
        double[] sample2 = new double[]
                {5.2, 6.4, 67.2, 32.1, 8.2};
        double greatestNumber = 0;
        for (int i = 0; i < sample2.length; i++) {
            if (sample2[i] > greatestNumber) {
                greatestNumber = sample2[i];
            }
        }
        System.out.println("The greatest highest number in Sample2 Array is: " + greatestNumber);
    }

    public static void arrayExercises3() { // prints out the length of the string in each element of the array
        String[] sample3 = new String[]
                {
                        "This beat is Automatic, supersonic, hypnotic, funky fresh",
                        "Work my body, so melodic, this beat goes right through my chest",
                        "Everybody, ma and papi, came to party, grab somebody",
                        "Work ya body, work ya body",
                        "Rock it, don't stop it! Everybody get on the floor",
                        "Crank the party up. We about to get it on",
                        "Let me see you one, two step! I love it when you one, two step",
                        "Everybody one, two step! We about to get it on"};

        for (int i = 0; i < sample3.length; i++) {
            String stringElement = sample3[i];
            int stringLength = stringElement.length();
            System.out.println("The length of the string element in position " + i + " is " + stringLength);
        }
    }

    public static void arrayExercises4() { // generates random numbers and prints out the sum of all these numbers
        int[] sample4 = new int[12];
        Random randomElement = new Random();

        int elementInArray;
        int sum = 0;
        for (int i = 0; i < sample4.length; i++) {
            sample4[i] = randomElement.nextInt();
            elementInArray = sample4[i];
            sum = sum + elementInArray;
        }
        System.out.println("The total sum of all the elements in Sample4 Array is: " + sum);
    }

    public static void arrayExercises5() {  // generates numbers to fill the array
        int[] sample5 = new int[100];
        Random randomElement = new Random();
        for (int i = 0; i < sample5.length; i++) {
            sample5[i] = randomElement.nextInt();
            System.out.println(sample5[i]);
        }

    }

    public static void arrayExercises6() { //only prints out the even numbers
        int[] sample6 = new int[20];
        Random randomElement = new Random();
        for (int i = 0; i < sample6.length; i++) {
            sample6[i] = randomElement.nextInt();
            if (sample6[i] % 2 == 0) {
                System.out.println(sample6[i]);
            }
        }
    }

    public static void arrayExercises7() {
    }

    public static void arrayExercises8() { //get user inputs for elements in the array and prints out sum
        int[] sample8 = new int[10];
        int userInput = 0;
        int sum = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < sample8.length; i++) {
            System.out.println("Enter a number: ");
            userInput = input.nextInt();
            sample8[i] = userInput;
            System.out.println("The element in position " + i + " is " + sample8[i]);
            sum = sum + sample8[i];
        }
        System.out.println("The sum of all the numbers entered is: " +sum);
    }
}


//1. write a program that generates an array of 10 integers, and then
//element by element (not all at once) in the console.
//2. write a program that creates an array of 5 floating point numbers (no
//reading from the console) and finds and prints the largest element in the array.
//3. write a program which creates an array of 8 strings (no reading from the
//the console) and prints the length of each string in the array.
//4. write a program that creates an array of 12 integers (no reading from the console) and outputs a sum
//from the console) and calculates a sum of all elements in the array.
//5. write a program that creates an array of 15 random numbers between 1 and 100
//(no reading from the console) and outputs all elements, one by one (not everything
//(not all at once) in the array.
//6. write a program that creates an array of 20 integers (no reading from the console) and outputs
//from the console) and outputs only the even numbers in the array.
//PR1 Exercises
//4
//7. write a program that creates an array of 10 strings (no reading from the console) and outputs the
//from the console) and outputs those strings in the array that begin with a certain letter.
//letter.
//8. write a program that reads the elements of an array of 10 integers
//from the console by the user and then finds the largest element and outputs it.
//and outputs it.
//9. write a program that creates an array of 6 integers (no reading in
//from the console!) and finds and outputs the smallest element in the array.
//10.write a program that creates an array of 9 floating point numbers (no reading from the console!)
//read from the console) and calculates and prints the average element in the array.
//and outputs it.