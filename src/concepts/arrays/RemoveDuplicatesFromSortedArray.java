package concepts.arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedArray {
    static void main() {
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5};
        int r = 0;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        while (r < arr.length) {
            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);

            if (map.get(arr[r]) > 1) {
                map.put(arr[r], map.get(arr[r]) - 1);
            }
            r++;
        }
        System.out.println(map.keySet());
    }
}
