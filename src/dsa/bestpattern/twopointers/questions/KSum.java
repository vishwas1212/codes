package dsa.bestpattern.twopointers.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KSum {
    static void main() {
        int[] nums = {1, 0, -1, 0, -2, 2, 0};

        System.out.println("2Sum, target=0: " + kSum(nums, 0, 2));
        System.out.println("3Sum, target=0: " + kSum(nums, 0, 3));
        System.out.println("4Sum, target=0: " + kSum(nums, 0, 4));
        System.out.println("5Sum, target=0: " + kSum(nums, 0, 5));
        System.out.println("6Sum, target=0: " + kSum(nums, 0, 6));
        System.out.println("7Sum, target=0: " + kSum(nums, 0, 7));
    }

    private static List<List<Integer>> kSum(int[] arr, int target, int k) {
        Arrays.sort(arr);
        return kSumHelper(arr, target, k, 0);
    }

    private static List<List<Integer>> kSumHelper(int[] arr, int target, int k, int si) {
        List<List<Integer>> result = new ArrayList<>();

        if (k == 2) {
            return twoSum(arr, target, si);
        }
        if (arr.length - si < k) {
            return result;
        }
        for (int i = si; i <= arr.length - k; i++) {
            if (i != si && arr[i] == arr[i - 1]) {
                continue;
            }
            List<List<Integer>> subresult = kSumHelper(arr, target - arr[i], k - 1, i + 1);
            for (List<Integer> list : subresult) {
                List<Integer> resList = new ArrayList<>(list);
                resList.add(0, arr[i]);
                result.add(resList);
            }
        }
        return result;
    }

    private static List<List<Integer>> twoSum(int[] arr, int target, int si) {
        List<List<Integer>> result = new ArrayList<>();
        if (arr.length - si < 2) {
            return result;
        }
        int l = si, r = arr.length - 1;
        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum == target) {
                result.add(List.of(arr[l], arr[r]));
                while (l < r && arr[l] == arr[l + 1]) {
                    l++;
                }
                while (l < r && arr[r] == arr[r - 1]) {
                    r--;
                }
                l++;
                r--;
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return result;
    }
}
