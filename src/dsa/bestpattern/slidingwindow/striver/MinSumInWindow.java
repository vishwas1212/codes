package dsa.bestpattern.slidingwindow.striver;

public class MinSumInWindow {
    static void main() {
        int[] arr = {-1, 2, 3, 3, 4, 5, -1};
        int k = 4;
        int sum = 0, minSum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        minSum = sum;

        int l = 0, r = k - 1;

        while (r < arr.length - 1) {
            sum = sum - arr[l];
            l++;
            r++;
            sum = sum + arr[r];
            minSum = Math.min(sum, minSum);
        }
        System.out.println("Minimum sum for constant window is: " + minSum);
    }
}
