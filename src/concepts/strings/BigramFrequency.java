package concepts.strings;

import java.util.HashMap;
import java.util.Map;

public class BigramFrequency {
    static void main() {
        String str = "abbcbabaabc";

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length() - 1; i++) {
            String pair = str.substring(i, i + 2);
            map.put(pair, map.getOrDefault(pair, 0) + 1);
        }
        System.out.println(map);
    }
}
