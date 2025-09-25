package dsa.bestpattern.slidingwindow.striver;

import java.util.HashMap;
import java.util.Map;

public class LongestStringWithKDistBruteForce {
    static void main() {
        String str = "aaabbccdd";
        int k = 2;

        int maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            map.clear();
            for (int j = i; j < str.length(); j++) {

                map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0) + 1);
                if (map.size() <= k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                } else {
                    break;
                }

            }
        }
        System.out.println(maxLen);
    }
}
