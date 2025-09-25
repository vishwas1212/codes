package dsa.bestpattern.slidingwindow.striver;

import java.util.HashSet;
import java.util.Set;

public class MaxFruitsIntoBasketBruteForce {
    static void main() {
        int[] arr = {3, 3, 3, 1, 2, 1, 1, 1, 2, 3, 4};
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i; j < arr.length; j++) {
                set.add(arr[j]);
                if (set.size() <= 2) {
                    maxLen = Math.max(maxLen, j - i + 1);
                } else {
                    break;
                }
            }
        }
        System.out.println(maxLen);
    }
}
