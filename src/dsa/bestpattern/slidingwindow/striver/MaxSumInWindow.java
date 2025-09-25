package dsa.bestpattern.slidingwindow.striver;

public class MaxSumInWindow {
    static void main() {
        int[] arr = {-1, 2, 3, 3, 4, 5, -1};
        int k = 4;

        int l = 0, r = k - 1;
        int sum = 0, maxSum = 0;

        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        maxSum = sum;

        while (r < arr.length - 1) {
            sum = sum - arr[l];
            l++;
            r++;
            sum = sum + arr[r];
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println("Maximum sum for constant window is: " + maxSum);
    }
}
