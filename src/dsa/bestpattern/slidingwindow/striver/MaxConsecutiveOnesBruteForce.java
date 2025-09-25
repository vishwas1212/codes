package dsa.bestpattern.slidingwindow.striver;

public class MaxConsecutiveOnesBruteForce {
    static void main() {
        int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        int maxLen = 0, zeros;

        for (int i = 0; i < arr.length; i++) {
            zeros = 0;
            for (int j = i; j < arr.length; j++) {

                if (arr[j] == 0)
                    zeros++;

                if (zeros <= k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                } else {
                    break;
                }

            }

        }

        System.out.println(maxLen);
    }
}
