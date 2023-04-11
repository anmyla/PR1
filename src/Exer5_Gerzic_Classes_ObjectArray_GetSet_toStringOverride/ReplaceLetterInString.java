package Exer5_Gerzic_Classes_ObjectArray_GetSet_toStringOverride;

import java.util.Scanner;

public class ReplaceLetterInString {
    public static void main(String[] args) {
        Scanner wordinput = new Scanner(System.in);
        System.out.println("Enter a word/phrase: ");
        String word = wordinput.nextLine();
        String replacedWord;

        word = word.toLowerCase();

        System.out.println(replacedWord= word.replace('e', 'o'));

    }
}
