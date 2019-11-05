import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Checking whether two strings are anagrams
 * Two strings that have the same characters, but that are in a different order, are anagrams.
 * For this exercise anagramas are case-insensitive and white * * spaces should be ignored.
 */
public class Exercise6 {
    public static void main(String[] arg) {
        String str1 = "H e llo ";
        String str2 = "oehLL";
        str1 = str1.replaceAll(" ", "");
        str2 = str2.replaceAll(" ", "");
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        Map<Character, Integer> map1 = mapCount(str1);
        Map<Character, Integer> map2 = mapCount(str2);
        System.out.println(map1);
        System.out.println(map2);
        System.out.println("Is anagramas: "+ (map1.toString() == map2.toString()));
    }

    private static Map<Character, Integer> mapCount(String string) {
        Map<Character, Integer> mapCount = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            char value = string.charAt(i);
            if (!mapCount.containsKey(value)) {
                mapCount.put(value, 1);
            } else {
                Integer count = mapCount.get(value) + 1;
                mapCount.put(value, count);
            }
        }
        return mapCount;
    }
}
