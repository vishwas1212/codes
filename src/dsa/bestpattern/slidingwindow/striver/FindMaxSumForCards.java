package dsa.bestpattern.slidingwindow.striver;

public class FindMaxSumForCards {
    static void main(String[] args) {
        int[] arr = {6, 2, 3, 4, 7, 2, 1, 7, 1};
        int k = 4;

        int lsum = 0, rsum = 0, maxSum = 0, r = arr.length - 1;

        for (int i = 0; i < k; i++) {
            lsum += arr[i];
        }
        maxSum = lsum;

        for (int i = k - 1; i >= 0; i--) {
            lsum = lsum - arr[i];
            rsum = rsum + arr[r];
            r--;
            maxSum = Math.max(maxSum, lsum + rsum);
        }

        System.out.println("Maximum profits can be obtained is: " + maxSum);
    }
}
