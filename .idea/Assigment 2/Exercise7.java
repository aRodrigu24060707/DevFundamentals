/**
 * Checking whether two arrays contain a mismatch
 */
public class Exercise7 {
    public static void main(String[] args) {
        
        int[] firstTestArrayOne = {1, 2, 3, 4, 5, 6};
        int[] firstTestArrayTwo = {1, 2, 3, 4, 5, 6};

        int resultFirstTest = mismatch(firstTestArrayOne, firstTestArrayTwo);
        System.out.println(resultFirstTest); //result should be -1


        int[] secondTestArrayOne = {1, 2, 3, 4, 5, 6};
        int[] secondTestArrayTwo = {1, 2, 3, 4, 2, 6};

        int resultSecondTest = mismatch(secondTestArrayOne, secondTestArrayTwo);
        System.out.println(resultSecondTest); //result should be 4
    }

    public static int mismatch(int[] first, int[] second) {
       int result = -1;
       for(int index = 0; index < first.length; index++) {
           if (first[index]!=second[index]) {
               result = 4;
           }
       }
       return result;
    }
}
