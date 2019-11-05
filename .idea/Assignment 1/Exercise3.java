import java.io.Console;
import java.util.ArrayList;

/**
 * Given the string, check if it is a [palindrome](keyword://palindrome).
 * Example
 * - For `inputString = "aabaa"`, the output should be`checkPalindrome(inputString) = true`;
 * - For `inputString = "abac"`, the output should be`checkPalindrome(inputString) = false`;
 * - For `inputString = "a"`, the output should be`checkPalindrome(inputString) = true`.
 */
public class Exercise3 {
    public static void main(String[] arg) {
        boolean result;
        Console console = System.console();
        String inputString = console.readLine("Enter String:");
        System.out.println("The string "+ inputString + ", is Palindrome:" + isPalindrome(inputString));

    }

    /**
     * Verifies Palindrome.
     *
     * @param inputString - String to verify.
     * @return True if is Palindrome, false otherwise.
     */
    private static boolean isPalindrome(String inputString)  {
        char[] inputArray;
        inputArray = inputString.toCharArray();
        int indexStart = 0;
        int indexEnd = inputString.length() - 1;
        while (indexStart < indexEnd) {
            if (inputArray[indexStart] != inputArray[indexEnd]) {
                return false;
            }
            indexStart++;
            indexEnd--;
        }
        return true;
    }
}
