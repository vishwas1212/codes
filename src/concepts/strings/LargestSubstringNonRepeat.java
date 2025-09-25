package concepts.strings;

import java.util.HashMap;
import java.util.Map;

public class LargestSubstringNonRepeat {
    public static void main(String[] args) {
        String input = "abababcabcdefggh";
        int start = 0, startIndex = 0, maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (map.containsKey(c) && map.get(c) >= start) {
                start = map.get(c) + 1;
            }
            map.put(c, i);

            if (i - start + 1 > maxLen) {
                maxLen = i - start + 1;
                startIndex = start;
            }
        }

        System.out.println(input.substring(startIndex, startIndex + maxLen));
        String res = "";
        for (int i = startIndex; i < startIndex + maxLen; i++) {
            res = res + input.charAt(i);
        }
        System.out.println(res + " " + maxLen);

        char[] ch = new char[maxLen];

        for (int i = 0; i < maxLen; i++) {
            ch[i] = input.charAt(startIndex + i);
        }
        String charRes = new String(ch);
        System.out.println(charRes);
    }
}
