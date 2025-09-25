package concepts.arrays.set;

import java.util.ArrayList;
import java.util.List;

public class KSizeSubsets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int k = 3;

        List<List<Integer>> powerset = combine(nums, k);
        System.out.println(powerset);
    }

    private static List<List<Integer>> combine(int[] nums, int k) {
        List<List<Integer>> rs = new ArrayList<>();
        backtrack(0, nums, k, new ArrayList<>(), rs);
        return rs;
    }

    private static void backtrack(int start, int[] nums, int k, ArrayList<Integer> current, List<List<Integer>> rs) {
        if (current.size() == k) {
            rs.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            backtrack(i + 1, nums, k, current, rs);
            current.remove(current.size() - 1);
        }
    }
}
