package dsa.bestpattern.slidingwindow.striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindValidSubArraysForTarget {
    public static void main() {
        int[] arr = {1, 0, 0, 1, 1, 0};
        int target = 2;
        int result = getValidSubArrayCount(arr, target) - getValidSubArrayCount(arr, target - 1);
        System.out.println(result);

        List<int[]> lists = getExactSubArrays(arr, target);

        for (int[] list : lists) {
            System.out.println(Arrays.toString(list));
        }

    }

    private static List<int[]> getExactSubArrays(int[] arr, int target) {
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    result.add(Arrays.copyOfRange(arr, i, j + 1));
                }
                if (sum > target) {
                    break;
                }
            }
        }

        return result;
    }

    private static int getValidSubArrayCount(int[] arr, int target) {

        int l = 0, r = 0, sum = 0, count = 0;
        List<int[]> list = new ArrayList<>();
        while (r < arr.length) {
            sum += arr[r];
            while (sum > target) {
                sum = sum - arr[l];
                l++;
            }
            count = count + (r - l + 1);
            r++;
        }
        return count;
    }
}
