package dsa.bestpattern.slidingwindow.striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestStringConsecutive {
    static void main() {
        String s = "ababababcdeffggh";
        int[] hash = new int[256];
        Arrays.fill(hash, -1);
        int l = 0, r = 0, maxLen = 0, idx = 0;

        while (r < s.length()) {
            if (hash[s.charAt(r)] != -1) {
                if (hash[s.charAt(r)] >= l) {
                    l = hash[s.charAt(r)] + 1;
                }
            }

            if (maxLen < r - l + 1) {
                maxLen = r - l + 1;
                idx = l;
            }
            hash[s.charAt(r)] = r;
            r++;
        }
        List<String> list = new ArrayList<>();
        for (int i = idx; i < idx + maxLen; i++) {
            list.add(String.valueOf(s.charAt(i)));
        }

        System.out.println("Max Consecutive String is: " + list + " and Length is: " + maxLen);
    }

}
