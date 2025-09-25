package dsa.bestpattern.slidingwindow.striver;

import java.util.Arrays;

public class NoOfSubtringContainingKOptimize {
    static void main() {
        String string = "bbacba";
        int k = 3;
        int count = 0, min = 0;
        int[] hash = new int[k];

        Arrays.fill(hash, -1);

        for (int i = 0; i < string.length(); i++) {
            hash[string.charAt(i) - 'a'] = i;

            if (hash[0] != -1 && hash[1] != -1 && hash[2] != -1) {
                count = count + (1 + Math.min(hash[0], Math.min(hash[1], hash[2])));

            }
        }
        System.out.println(count);
    }
}
