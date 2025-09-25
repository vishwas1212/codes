package concepts.arrays.set;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSumTarget {
    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> powerSet = combine(nums, target);
        System.out.println(powerSet);
    }

    private static List<List<Integer>> combine(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0, nums, target, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int start, int[] nums, int target, ArrayList<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (target < nums[i])
                break;
            current.add(nums[i]);
            backtrack(i, nums, target - nums[i], current, result);
            current.removeLast();
        }
    }
}
