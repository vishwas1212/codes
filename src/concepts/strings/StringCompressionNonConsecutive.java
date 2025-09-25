package concepts.strings;

import java.util.HashMap;
import java.util.Map;

public class StringCompressionNonConsecutive {
    static void main() {
        String input = "abababcabcdefgghaabcbcbnasfjfna";

        Map<Character, Integer> map = new HashMap<>();

        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
            sb.append(characterIntegerEntry.getKey()).append(characterIntegerEntry.getValue());
        }
        System.out.println(sb);
    }
}
