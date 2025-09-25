package dsa.bestpattern.slidingwindow.striver;

public class MinSubInWindow {
    static void main() {
        int[] arr = {-1, 2, 3, 3, 4, 5, -1};
        int k = 4;

        int sum = 0, prevSum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        prevSum = sum;
        int l = 0, r = k - 1;

        int minDiff = Integer.MAX_VALUE;

        while (r < arr.length - 1) {
            sum = sum - arr[l];
            l++;
            r++;
            sum = sum + arr[r];
            int diff = Math.abs(sum - prevSum);
            minDiff = Math.min(diff, minDiff);
            prevSum = sum;
        }
        System.out.println("Min Sub is: " + minDiff);
    }
}
