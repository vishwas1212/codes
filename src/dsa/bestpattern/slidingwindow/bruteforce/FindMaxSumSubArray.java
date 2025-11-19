package dsa.bestpattern.slidingwindow.bruteforce;

public class FindMaxSumSubArray {
    static void main() {
        int[] arr = {1, 2, -1, 2, 3, -2, 4, 5};
        int k = 3;
        int maxSum = 0, n = arr.length;

        for (int i = 0; i <= n - k; i++) {
            int currSum = 0;
            for (int j = i; j < i + k; j++) {
                currSum += arr[j];
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println(maxSum);


    }
}
