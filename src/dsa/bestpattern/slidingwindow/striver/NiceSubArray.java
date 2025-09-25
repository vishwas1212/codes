package dsa.bestpattern.slidingwindow.striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NiceSubArray {
    static void main() {
        int[] arr = {1, 1, 2, 1, 1};
        int target = 3;

        int res = getCount(arr, target) - getCount(arr, target - 1);
        System.out.println(res);

        List<int[]> list = getExactSubArrays(arr, target);
        for (int[] ints : list) {
            System.out.println(Arrays.toString(ints));
        }

    }

    private static List<int[]> getExactSubArrays(int[] arr, int target) {
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j] % 2;

                if (sum == target) {
                    result.add(Arrays.copyOfRange(arr, i, j + 1));
                }
            }
        }
        return result;
    }

    private static int getCount(int[] arr, int target) {
        int l = 0, r = 0, sum = 0, count = 0;

        while (r < arr.length) {
            sum += arr[r] % 2;

            while (sum > target) {
                sum = sum - arr[l] % 2;
                l++;
            }

            count = count + (r - l + 1);
            r++;
        }
        return count;
    }
}
