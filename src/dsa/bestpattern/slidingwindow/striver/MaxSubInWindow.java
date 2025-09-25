package dsa.bestpattern.slidingwindow.striver;

public class MaxSubInWindow {
    static void main() {
        int[] arr = {-1, 2, 3, 3, 4, 5, -1};
        int k = 4;

        int sum = 0, prevSum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        prevSum = sum;

        int l = 0, r = k - 1;
        int maxDiff = 0;

        while (r < arr.length - 1) {
            sum = sum - arr[l];
            l++;
            r++;
            sum = sum + arr[r];
            int diff = Math.abs(sum - prevSum);
            maxDiff = Math.max(maxDiff, diff);
            prevSum = sum;
        }
        System.out.println("Maximum Diff Bewteen windows: " + maxDiff);
    }
}
