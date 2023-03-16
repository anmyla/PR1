package HOME_Exercises_Gerzic;

import java.nio.file.Paths;
import java.util.Scanner;

public class WordChecker {
    public static void main(String[] args) throws Exception {
        //The path to the file we need will be saved in a String variable
        String file = "C:\\Users\\s53026\\Desktop\\faust.txt";

        //With Scanner and the Option "(Paths.get(PATH))", the content will be read
        Scanner bookText = new Scanner(Paths.get(file));
        String completeBook = bookText.next();

        //Require user to enter the word they want to count
        Scanner textInput = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = textInput.nextLine();
        word = word.toLowerCase();

        int counter = 0;
        while (bookText.hasNext()) {
            String theNextWord = bookText.next();
            theNextWord = theNextWord.toLowerCase();
            if (word.equals(theNextWord)){
            counter++;
        }
    }
        System.out.println("The word '" + word + "' was found " + counter + " times in this document.");
}
}
