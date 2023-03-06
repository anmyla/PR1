package Recursion;

public class RecursionExercise {
    public static void main(String[] args) {
        printSentence("Print this sentence 10 times.", 0);

    }
    public static void printSentence(String sentence, int startingNumber) {

        if (startingNumber != 10) {
            System.out.println(sentence);
            startingNumber++;
            printSentence(sentence, startingNumber);
        }
        else {
            System.out.println("End");
        }
    }
}
