package olddsamixcodes.hashmapcodes;

import java.util.HashMap;
import java.util.Map;

public class FrequencyWithHashMap {

    public static void main(String[] args) {
        String str = "aa bb cc dd ee ff gg a b c d e f g aa bb cc dd ee ff gg a b c d e f g";
        String str1 = "abbcd";
        HashMap<Character, Integer> map = new HashMap<>();

        String[] st = str.split(" ");
        for (int i = 0; i < str1.length(); i++) {
            // Java 8
            char ch = str1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry entry : map.entrySet()) {
            Integer count = (Integer) entry.getValue();
            if (count > 1) {
                System.out.println(entry);
            } else {
                System.out.println(" -+1");
            }
        }

    }

}
