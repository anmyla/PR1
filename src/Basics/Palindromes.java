package Basics;

public class Palindromes {
    public static void main(String[] args) {

        System.out.println(palindromeChecker("anna"));
        System.out.println(palindromeChecker("this should return false"));

    }

    public static boolean palindromeChecker(String wordString) {

        String isThisPalindrome = wordString.toLowerCase();

        isThisPalindrome.replaceAll("\\s+", "");
        char[] toCharArray = new char[isThisPalindrome.length()];
        boolean isPalindrome = false;
        int j = isThisPalindrome.length() - 1;

        for (int i = 0; i < toCharArray.length; i++) {
            toCharArray[i] = isThisPalindrome.charAt(j);
            j--;
        }

        String reversed;
        reversed = String.copyValueOf(toCharArray);
        System.out.println(reversed);

        if (isThisPalindrome.equals(reversed)) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }
        return isPalindrome;
    }
}

//Palindromes
//We want to find out whether a word or a phrase is a palindrome,
// i.e. a word or phrase that reads the same forward as it does backwards.
//
//Examples for palindromes:
// Was it a car or a cat I saw
// Murder for a jar of red rum
// Go hang a salami, I'm a lasagna hog
// Otto
// 1122332211
//
//Steps:
//Prepare the Strings - in case there are capital letters,
// you might want to convert them all to lowercase or upper case.
//  Remember that Strings have built in methods you can access with the point operator.
//If you are checking sentences, you will need to get rid of spaces.
// Maybe a loop might be helpful?
//Save the first and the last letters of your potential
// palindrome in a char variable. Then you compare: are the first and the last letter the same?
//If they are the same you can use .substring(1, string.length-1),
// which only saves everything from the second to the penultimate letters in the String.
// This way you only keep comparing the last letters until you are out of letters.
//Once the palindrome is too short to compare further (<=1), you can return true: it is a palindrome!
//If it is not short enough: use a recursive call to keep going until you are out of letters to compare.
//If the first and last letters don‘t match: return false; it is not a palindrome.