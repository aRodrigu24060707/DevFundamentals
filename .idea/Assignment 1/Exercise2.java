import java.io.Console;

/**
 * Given a year, return the century it is in.
 * The first century spans from the year 1 up to and including the year 100,
 * the second - from the year 101
 * up to and including the year 200, etc.
 * Example
 * - For `year = 1905`, the output should be`centuryFromYear(year) = 20`;
 * - For `year = 1700`, the output should be`centuryFromYear(year) = 17`.
 */
public class Exercise2 {

    public static void main(String[] arg) {
        int result;
        Console console = System.console();
        int year = Integer.parseInt(console.readLine("Enter year:"));
        if (year % 100 == 0) {
            result = year / 100;
        } else {
            result = (year / 100) + 1;
        }
        System.out.println("Result:" + result);
    }
}
