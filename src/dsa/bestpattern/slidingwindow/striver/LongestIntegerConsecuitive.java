package dsa.bestpattern.slidingwindow.striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIntegerConsecuitive {
    static void main() {
        int num = 123454321;
        String s = String.valueOf(num);

        int[] hash = new int[256];
        Arrays.fill(hash, -1);

        int l = 0, r = 0, maxLen = 0, idx = 0;

        while (r < s.length()) {
            if (hash[s.charAt(r)] != -1
                    && hash[s.charAt(r)] >= l) {

                l = hash[s.charAt(r)] + 1;
            }
            if (r - l + 1 > maxLen) {
                maxLen = r - l + 1;
                idx = l;
            }
            hash[s.charAt(r)] = r;
            r++;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = idx; i < idx + maxLen; i++) {
            list.add(Character.getNumericValue(s.charAt(i)));
        }
        System.out.println(maxLen + " " + list);

    }
}
