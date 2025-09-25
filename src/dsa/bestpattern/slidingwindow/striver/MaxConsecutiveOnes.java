package dsa.bestpattern.slidingwindow.striver;

import java.util.Arrays;

public class MaxConsecutiveOnes {
    static void main() {
        int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0};
        int k = 2;

        int l = 0, r = 0, maxLen = 0, zeros = 0, idx = 0;

        while (r < arr.length) {
            if (arr[r] == 0) {
                zeros++;
            }
            if (zeros > k) {
                if (arr[l] == 0) {
                    zeros--;
                }
                l++;
            }
            if (zeros <= k) {
                maxLen = Math.max(maxLen, r - l + 1);
                idx = l;
            }
            r++;
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, idx, idx + maxLen)));
        System.out.println(maxLen);
    }
}
