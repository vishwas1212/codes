package concepts.arrays.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsWithDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};

        List<List<Integer>> powerset = subset(arr);
        System.out.println(powerset);
    }

    private static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> rs = new ArrayList<>();
        Arrays.sort(arr);
        backtrack(0, arr, new ArrayList<>(), rs);
        return rs;
    }

    private static void backtrack(int start, int[] arr, ArrayList<Integer> current, List<List<Integer>> rs) {
        rs.add(new ArrayList<>(current));
        for (int i = start; i < arr.length; i++) {

            if (i > start && arr[i] == arr[i - 1]) {
                continue;
            }
            current.add(arr[i]);
            backtrack(i + 1, arr, current, rs);
            current.remove(current.size() - 1);
        }
    }
}
