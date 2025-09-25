package concepts.strings;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubstring {
    static void main() {
        String input = "ADOBECODEBANKKC";
        String target = "ABC";

        String res = minWindow(input, target);
        System.out.println(res);
    }

    private static String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        Map<Character, Integer> freqMap = new HashMap<>();
        int minLength = 0;
        int minStart = 0;
        for (char c : t.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        int start = 0;
        minStart = 0;
        minLength = Integer.MAX_VALUE;
        int count = 0;
        Map<Character, Integer> window = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);

            window.put(c, window.getOrDefault(c, 0) + 1);

            if (freqMap.containsKey(c) && window.get(c).equals(freqMap.get(c))) {
                count++;
            }

            while (freqMap.size() == count) {
                if (end - start + 1 < minLength) {
                    minLength = end - start + 1;
                    minStart = start;
                }
                char left = s.charAt(start++);
                window.put(left, window.get(left) - 1);
                if (freqMap.containsKey(left) && window.get(left) < freqMap.get(left)) {
                    count--;
                }
            }

        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minLength + minStart);
    }
}
