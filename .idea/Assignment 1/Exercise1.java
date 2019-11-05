import java.io.Console;
import java.lang.Math;

/**
 * Given an integer `n`, return the largest number that contains exactly `n` digits.
 * Example
 * For `n = 2`, the output should be `largestNumber(n) = 99`.
 * Input/Output
 */
public class Exercise1 {

    public static void main(String[] arg) {
        Console console = System.console();
        int digitNumber = Integer.parseInt(console.readLine("Enter digits number:"));
        int result = (int) (Math.pow(10, digitNumber)-1);
        System.out.println("Result:" + result);
    }
}
