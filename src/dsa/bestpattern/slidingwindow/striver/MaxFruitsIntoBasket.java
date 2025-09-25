package dsa.bestpattern.slidingwindow.striver;

import java.util.HashMap;
import java.util.Map;

public class MaxFruitsIntoBasket {
    static void main() {
        int[] arr = {3, 3, 3, 1, 2, 1, 1, 1, 2, 3, 4};
        int k = 2;

        int l = 0, r = 0, maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while (r < arr.length) {
            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);

            while (map.size() > k) {
                map.put(arr[l], map.get(arr[l]) - 1);
                if (map.get(arr[l]) == 0) {
                    map.remove(arr[l]);
                }
                l++;
            }

            if (map.size() <= k) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
            r++;
        }
        System.out.println(maxLen);
    }
}
