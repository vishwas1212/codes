package dsa.bestpattern.slidingwindow.hashmap;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterRepl {
    static void main() {
        String input = "AAABABBA";
        int k = 2;

        int l = 0, r = 0, maxLen = 0, maxFreq = 0;

        Map<Character, Integer> map = new HashMap<>();

        while (r < input.length()) {
            map.put(input.charAt(r), map.getOrDefault(input.charAt(r), 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(input.charAt(r)));

            if (r - l + 1 - maxFreq > k) {
                map.put(input.charAt(l), map.get(input.charAt(l)) - 1);
                maxFreq = 0;
                l++;
            }

            if (r - l + 1 - maxFreq <= k) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
            r++;
        }
        System.out.println(input.substring(l, l + maxLen));
        System.out.println(maxLen);
    }
}
