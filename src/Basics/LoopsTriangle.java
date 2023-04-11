package Basics;

public class LoopsTriangle {
    public static void main(String[] args) {
        int num = 1;

        for(int i= 0; i < 10; i++) {
            for (int j = 0; j <= num ; j++){
                System.out.print(j);
            }
            num++;
            System.out.println();
        }
    }
}
//Create a new class with a main method.
// Using two nested loops (writing a second loop within a loop),
// write code that prints the following triangle of numbers to the console.
//