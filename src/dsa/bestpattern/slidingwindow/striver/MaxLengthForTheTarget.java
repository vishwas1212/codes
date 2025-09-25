package dsa.bestpattern.slidingwindow.striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxLengthForTheTarget {
    static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 10};
        int k = 3;

        int sum = 0, maxLen = 0, r = 0, l = 0;
        int start = 0, end = 0;

        List<int[]> listOfArrays = new ArrayList<>();

        while (r < arr.length) {
            sum += arr[r];

            while (sum > k && l <= r) {
                sum = sum - arr[l];
                l++;
            }

            if (sum <= k) {
                maxLen = Math.max(r - l + 1, maxLen);
                start = l;
                end = r;
            }
            int[] subArrays = Arrays.copyOfRange(arr, start, end + 1);
            listOfArrays.add(subArrays);
            r++;
        }
        for (int[] listOfArray : listOfArrays) {
            if (listOfArray.length > 0)
                System.out.println(Arrays.toString(listOfArray));
        }

        System.out.println(maxLen);

    }
}
