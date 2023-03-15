package ExercisesPart2;

import java.util.Scanner;

import static java.lang.System.out;

public class Programmauswahlmenue {
    public static void main(String[] args) {

        oddOrEven(59);
        out.println();
    reverse();
        out.println();
    countTheVowels();

    }
//    public static void reversedWord() {
//        Scanner scanner1 = new Scanner(System.in);
//        out.println("Enter a word: ");
//        String word = scanner1.next();
//
//        String reversedWord = "";
//        for (int i = word.length() - 1; i >= 0; i--) {
//            reversedWord = reversedWord + reversedWord.charAt(i);
//        }
//        out.println(reversedWord);
//    }

    public static void reverse() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner1.nextLine();

        //1. save the value of the String "word" to a char[]
        char[] stringToCharArray = word.toCharArray();

        //2. create 2 int variables to represent the beginning and end of the word
        int fromStartOfWord;
        int fromEndOfWord = stringToCharArray.length -1;

        //3. using the 2 int variables, create the for loop to reverse the letters in the stringToCharArray
        for (fromStartOfWord = 0; fromStartOfWord < fromEndOfWord; fromStartOfWord++, fromEndOfWord--) {
            char reversedWord = stringToCharArray[fromStartOfWord];
            stringToCharArray[fromStartOfWord] = stringToCharArray[fromEndOfWord];
            stringToCharArray[fromEndOfWord] = reversedWord;
        }
        out.println("The word in reverse is: ");
        for (char reversedWord : stringToCharArray)
            System.out.print(reversedWord);
    }

    public static boolean oddOrEven(double number) {
        boolean even = false;
        if(number % 2 == 0) {
            even = true;
            System.out.println("The number: "+ number +  " is even");
        }
        else {
            even= false;
            out.println("The number: " + number +  " is odd");
        }
        return even;
    }

    public static void countTheVowels() {

        Scanner scanner2 = new Scanner(System.in);
        out.println("Enter a phrase: ");
        String phrase = scanner2.nextLine();

        int vowelCounter = 0;
        char letterChecker;
        for (int i=0 ; i<phrase.length(); i++){
            letterChecker = phrase.charAt(i);
            if(letterChecker == 'a'|| letterChecker == 'e'|| letterChecker == 'i' ||letterChecker == 'o' ||letterChecker == 'u'||letterChecker == ' '){
                vowelCounter++;
            }
        }
        System.out.println("Number of vowels in the given sentence is "+ vowelCounter);
    }
}
