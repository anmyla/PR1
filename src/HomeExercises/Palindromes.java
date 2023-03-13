package HomeExercises;

public class Palindromes {
    public static void main(String[] args) {
        String[] palindromes = new String[] //array with String elements
                {
                        "top spot",
                        "taco cat",
                        "never odd or even",
                        "Otto",
                        "Anna",
                        "I don't really understand this exercise!" //was able to make it but with a lot of help from Google
                };

        for (String i : palindromes) { // saving the elements of the "palindromes array" in data type String i
            System.out.print(i);
            i = i.toLowerCase();//converting all the characters in lower cases
            i = i.replaceAll("\\s+",""); //ignoring white spaces
            if (isPalindrome(i)) { // calling the method to reverse compare the characters in an element
                System.out.println(" is a palindrome");
            }
            else {
                System.out.println (" is not a palindrome");
            }
        }
    }

    public static boolean isPalindrome(String line) { //datatype to save each element of the palindrome array
        int i = 0; // index i will start at the beginning of the line and will increment
        int j = line.length() - 1; //index j will start from the end of the line and will decrement
        while (j>=0) { // do comparison until j is at 0
            if (line.charAt(i) == line.charAt(j)) { // charAt(i) is a (java)method that returns the value at a specified index
                i++;
                j--;
            }
            else {
                return false; //somewhere along the process of comparing, characters being compared are not equal
            }
        }
        return true; // the comparison process is completed and every comparison returned true/equal.
    }
}
