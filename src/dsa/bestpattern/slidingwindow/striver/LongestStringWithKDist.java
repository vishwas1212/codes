package dsa.bestpattern.slidingwindow.striver;

import java.util.HashMap;
import java.util.Map;

public class LongestStringWithKDist {
    static void main() {
        String str = "aaabbccdd";
        int k = 2;
        int l = 0, r = 0, maxLen = 0, idx = 0;
        Map<Character, Integer> map = new HashMap<>();

        while (r < str.length()) {
            map.put(str.charAt(r), map.getOrDefault(str.charAt(r), 0) + 1);

            while (map.size() > k) {
                map.put(str.charAt(l), map.get(str.charAt(l)) - 1);
                if (map.get(str.charAt(l)) == 0) {
                    map.remove(str.charAt(l));
                }
                l++;
            }
            if (map.size() <= k) {
                if (maxLen < r - l + 1) {
                    maxLen = r - l + 1;
                    idx = l;
                }

            }
            r++;
        }
        System.out.println(str.substring(idx, idx + maxLen) + " " + maxLen);
    }
}
