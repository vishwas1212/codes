package dsa.bestpattern.slidingwindow.bruteforce;

import java.util.HashMap;
import java.util.Map;

public class FIndLongestSubstringKDistinct {
    static void main() {
        String str = "ababababcdeffg";
        int k = 2;
        int l = 0, maxLen = 0, idx = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int r = 0; r < str.length(); r++) {
            char c = str.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while (map.size() > k) {
                char d = str.charAt(l);
                map.put(d, map.get(d) - 1);
                if (map.get(d) == 0) {
                    map.remove(d);
                }
                l++;
            }

            if (maxLen < r - l + 1) {
                maxLen = r - l + 1;
                idx = l;
            }
        }
        System.out.println(str.substring(idx, idx + maxLen));
    }
}
