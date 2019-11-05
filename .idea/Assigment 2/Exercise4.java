import java.io.Console;

/**
 * Minimum, maximum, and average of an int array
 * Make a program that computes the minimum, maximum, and average of an int array
 * {2, 3, 4, 5, 6, 9}
 * //Min Value:      1
 * //Max Value:      7
 * //Average Value:  4
 */
public class Exercise4 {

    public static void main(String[] arg) {
        int[] arrayNumber = {2, 3, 4, 5, 6, 9};
        int min = getMin(arrayNumber);
        int max = getMax(arrayNumber);
        double average = getAverage(arrayNumber);
        System.out.println("Min Value :" + min);
        System.out.println("Max Value :" + max);
        System.out.println("Average Value :" + average);
    }

    private static int getMin(int[] arrayNumber) {
        int min = arrayNumber[0];
        for (int index = 0; index < arrayNumber.length; index++) {
            if (arrayNumber[index] < min) {
                min = arrayNumber[index];
            }
        }
        return min;
    }

    private static int getMax(int[] arrayNumber) {
        int max = arrayNumber[0];
        for (int index = 0; index < arrayNumber.length; index++) {
            if (arrayNumber[index] > max) {
                max = arrayNumber[index];
            }
        }
        return max;
    }

    private static double getAverage(int[] arrayNumber) {
        int sum = 0;
        for (int index = 0; index < arrayNumber.length; index++) {
            sum = sum + arrayNumber[index];
        }
        return (sum/arrayNumber.length);
    }
}
