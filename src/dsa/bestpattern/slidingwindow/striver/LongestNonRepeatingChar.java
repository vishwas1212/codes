package dsa.bestpattern.slidingwindow.striver;

import java.util.HashMap;
import java.util.Map;

public class LongestNonRepeatingChar {
    static void main() {
        String string = "ababababcdeffggh";

        int l = 0, r = 0, maxLen = 0, idx = 0;
        Map<Character, Integer> map = new HashMap<>();

        while (r < string.length()) {
            char c = string.charAt(r);

            if (map.containsKey(c) && map.get(c) >= l) {
                l = map.get(c) + 1;
            }

            if (r - l + 1 > maxLen) {
                maxLen = r - l + 1;
                idx = l;
            }
            map.put(c, r);
            r++;
        }
        System.out.println(maxLen + " " + string.substring(idx, idx + maxLen) + " " + map);
    }
}
