package dsa.bestpattern.slidingwindow.striver;

import java.util.Arrays;

public class MaxLengthForTheTargetBruteForce {
    static void main() {
        int[] arr = {2, 7, 1, 5, 10};
        int[] subArr = new int[arr.length];
        int k = 14;
        int maxLen = 0;
        int maxSum = 0;
        int sum;
        int l = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum <= k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                    maxSum = Math.max(sum, maxSum);
                } else if (sum > k) {
                    break;
                }
            }
        }
        System.out.println("Max Length Could be: " + maxLen + " And Max Sum Possible: " + maxSum);
        System.out.println(Arrays.toString(subArr));
    }
}
