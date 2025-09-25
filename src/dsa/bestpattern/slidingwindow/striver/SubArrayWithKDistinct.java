package dsa.bestpattern.slidingwindow.striver;

import java.util.*;

public class SubArrayWithKDistinct {
    static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 1, 3, 4};
        int k = 3;

        int count = getDistinxtSubArray(arr, k) - getDistinxtSubArray(arr, k - 1);
        System.out.println(count);

        List<int[]> list = getExactSubArrays(arr, k);

        for (int[] ar : list) {
            System.out.println(Arrays.toString(ar));
        }
    }

    private static List<int[]> getExactSubArrays(int[] arr, int k) {
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i; j < arr.length; j++) {
                set.add(arr[j]);
                if (set.size() == k) {
                    result.add(Arrays.copyOfRange(arr, i, j + 1));
                } else if (set.size() > k)
                    break;
            }
        }
        return result;
    }

    private static int getDistinxtSubArray(int[] arr, int k) {
        int l = 0, r = 0, count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while (r < arr.length) {
            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);

            while (map.size() > k) {
                map.put(arr[l], map.get(arr[l]) - 1);
                if (map.get(arr[l]) == 0)
                    map.remove(arr[l]);
                l++;
            }
            count = count + (r - l + 1);
            r++;
        }
        return count;
    }
}
