package concepts.arrays.set;

import java.util.ArrayList;
import java.util.List;

public class PowerSetBitManipulation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        List<List<Integer>> powerSet = subset(arr);
        System.out.println(powerSet);
    }

    private static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();

        int n = arr.length;
        int total = 1 << n;

        for (int i = 0; i < total; i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(arr[j]);
                }
            }
            result.add(subset);
        }


        return result;
    }
}
