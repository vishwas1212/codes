package dsa.bestpattern.slidingwindow.striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxLengthForSubArray {
    static void main() {
        int[] arr = {2, 3, 10, 1};
        int target = 8;
        int sum = 0;
        int l = 0, minLen = Integer.MAX_VALUE;

        int start = 0, end = 0;

        List<int[]> list = new ArrayList<>();

        for (int r = 0; r < arr.length; r++) {
            sum += arr[r];

            while (sum >= target) {
                minLen = Math.min(r - l + 1, minLen);
                start = l;
                end = r;
                int[] subArray = Arrays.copyOfRange(arr, start, end + 1);
                list.add(subArray);
                sum = sum - arr[l];
                l++;
            }
        }
        if (minLen == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(minLen);
        }

        for (int[] ints : list) {
            System.out.println(Arrays.toString(ints));
        }

    }
}
