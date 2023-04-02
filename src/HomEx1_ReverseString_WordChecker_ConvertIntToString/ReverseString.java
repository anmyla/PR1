package HomEx1_ReverseString_WordChecker_ConvertIntToString;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
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
         for (char reversedWord : stringToCharArray)
             System.out.print(reversedWord);
    }
}
