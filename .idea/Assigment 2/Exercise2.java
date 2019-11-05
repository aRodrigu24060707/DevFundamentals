import java.io.Console;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Count repeating words in a string
 * Make a program that counts the number of occurrences of every repeating word, not you should ignore those words that are not repeating.
 * "This is is a new text text that have repeating repeating repeating words"
 * //Result:
 * is:        2
 * text:      2
 * repeating: 3
 */
public class Exercise2 {
    public static void main(String[] arg) {
        String str = "This is is a new text text that have repeating repeating repeating words";
        String[] array = str.split(" ");
        Map<String, Integer> mapCount = new HashMap<>();
        for (String word : array) {
            if (!mapCount.containsKey(word)) {
                mapCount.put(word, 1);
            } else {
                Integer count = mapCount.get(word) + 1;
                mapCount.put(word, count);
            }
        }

        Iterator it = mapCount.keySet().iterator();
        while(it.hasNext()) {
            String key = (String) it.next();
            Integer count = mapCount.get(key);
            System.out.println(key + " : " +count);
        }
    }
}
