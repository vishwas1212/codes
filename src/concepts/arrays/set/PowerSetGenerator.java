package concepts.arrays.set;

import concepts.oops.interfaces.A;

import java.util.ArrayList;
import java.util.List;

public class PowerSetGenerator {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        List<List<Integer>> powerSet = subset(arr);
        System.out.println(powerSet);

    }

    private static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, arr, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int index, int[] arr, ArrayList<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        for (int i = index; i < arr.length; i++) {
            current.add(arr[i]);
            backtrack(i + 1, arr, current, result);
            current.remove(current.size() - 1);
        }
    }
}
