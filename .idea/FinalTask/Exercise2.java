
import java.util.HashSet;

public class Exercise2 {

    public static void main(String[] arg) {
        String[] firstTestArrayOne = {"2", "1", "3", "5", "3", "2"};
        HashSet<String> result = new HashSet<>();
        String valueResult = "-1";
        for (String value : firstTestArrayOne) {
            if (!result.add(value)) {
                valueResult = value;
                break;
            }
        }
        System.out.println(valueResult);
    }
}
